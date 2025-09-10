package HashTable;

import java.util.HashSet;
import java.util.Set;

public class isValidSudoku {

public static boolean isValidSudoku(char[][] board) {
	Set<String> set= new HashSet<String>();
        for(int i=0; i<9; i++)
        {
        	for(int j=0; j<9; j++)
        	{
        		if(board[i][j]=='.')
        		{
        			continue;
        		}
        		String row=Integer.toString(board[i][j])+"_ROW_"+Integer.toString(i);
        		String col=Integer.toString(board[i][j])+"_COL_"+Integer.toString(j);
        		String box=Integer.toString(board[i][j])+"_BOX_"+Integer.toString(i/3)+Integer.toString(j/3);
        		if(set.contains(row)||set.contains(col)||set.contains(box))
        		{
        			return false;
        		}
        		set.add(row);
        		set.add(col);
        		set.add(box);
        		
        	}
        		
        }
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(isValidSudoku(new char[][] { {'8','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}}));

	}

}
