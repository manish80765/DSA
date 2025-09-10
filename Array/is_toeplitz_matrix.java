package Array;

public class is_toeplitz_matrix {
public static  boolean isToeplitzMatrix(int[][] matrix) {
	if (matrix.length == 0) {
        return true;
	}
     for(int i=1; i<matrix.length; i++)
     {
    	 for(int j=1; j<matrix[0].length; j++)
    	 {
    		 if(matrix[i][j]!=matrix[i-1][j-1])
    		 {
    			 return false;
    		 }
    	 }
     }
	return true;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.print(isToeplitzMatrix(new int[][] {{1,2},{2,2}}));
	}

}
