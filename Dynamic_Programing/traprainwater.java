package Dynamic_Programing;

public class traprainwater {
	
public static int trap(int[] height) {
	int n = height.length;
    if (n == 0) return 0;
	int h=0;
	int[] leftmax= new int[height.length];
	int[] rightmax= new int[height.length];	
	 leftmax[0] = height[0];
	    for (int i = 1; i < n; i++) {
	        leftmax[i] = Math.max(leftmax[i - 1], height[i]);
	    }
	    rightmax[n - 1] = height[n - 1];
	    for (int i = n - 2; i >= 0; i--) {
	        rightmax[i] = Math.max(rightmax[i + 1], height[i]);
	    }
	for(int i=0; i<height.length; i++)
	{
		h=h+Math.min(leftmax[i], rightmax[i])-height[i];
	}
	return h;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println(trap(new int[] {0,1,0,2,1,0,1,3,2,1,2,1}));
	}

}
