package Matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class findDiagonalOrder {
public static  int[] findDiagonalOrder(int[][] mat) {
	int m=mat.length;
	int n=mat[0].length;
	List<Integer> result= new ArrayList();
    Map<Integer, List> map= new HashMap<>(); 
    int i=0;
    int j=0;
    for( i=0; i<m; i++)
    {
    	for( j=0; j<n; j++)
    	{
    		map.computeIfAbsent(i+j,  k->new ArrayList<>()).add(mat[i][j]);
    	}
    }   
    boolean flag= true;
    int [] arr=new int[m*n];

    for (Map.Entry<Integer,List> v : map.entrySet()) 
    {
    	List<Integer> list = new ArrayList<>(v.getValue()); 
        if (flag) {
            Collections.reverse(list);
        }
        result.addAll(list);
        flag = !flag;
    }

    return result.stream().mapToInt(Integer::intValue).toArray();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] result=findDiagonalOrder(new int[][] {{1,2,3},{4,5,6},{7,8,9}});
		for(int x:result)
		{
			System.out.print(x+",");
		}
	}

}
