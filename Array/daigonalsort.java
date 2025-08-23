package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class daigonalsort {
public int[][] diagonalSort(int[][] mat) {
	int m=mat.length;
	int n= mat[0].length;
	List<Integer> set= new ArrayList();
	Map<Integer, List> map = new HashMap();
	int j=0;
	int i=0;
	for(i=0; i<mat.length; i++)
	{
		for( j=0; j<mat[i].length; j++)
		{
			if(i-j==i+1-j+1) {
				set.add(mat[i][j]);
			}
		}
	}
	return mat;       
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
