package Matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class daigonalsort {
public static int[][] diagonalSort(int[][] mat) {
	Map<Integer, List> map = new HashMap();
	for(int i=0; i<mat.length; i++)
	{
		for(int j=0; j<mat[i].length; j++)
		{
				map.computeIfAbsent(i-j,  k->new ArrayList<>()).add(mat[i][j]);
		}
	}
	for(Map.Entry<Integer, List> a: map.entrySet())
	{
		Integer key = a.getKey();                 // key
	    List list = a.getValue();
	    list.sort(Comparator.naturalOrder());
	}
	for(int i=0; i<mat.length; i++)
	{
		for(int j=0; j<mat[i].length; j++)
		{
			mat[i][j]=(int) map.get(i-j).removeFirst();
		}
	}
	return mat;    
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] result=diagonalSort(new int[][] {{3,3,1,1},{2,2,1,2},{1,1,1,2}});
		for(int[] x:result) {
			System.out.println();
			for(int y:x)
			{
				System.out.print(y);
			}
		}
	
	}

}
