package Array;

public class CanCompletecircuit {
	 public static int canCompleteCircuit(int[] gas, int[] cost) {
		 int totalTank = 0;
		    int currTank = 0;
		    int startIndex = 0;

		    for (int i = 0; i < gas.length; i++) {
		        int gain = gas[i] - cost[i];
		        totalTank += gain;
		        currTank += gain;

		        if (currTank < 0) {
		            // Can't reach the next station from current start
		            startIndex = i + 1;
		            currTank = 0; // reset for new start
		        }
		    }

		    return totalTank >= 0 ? startIndex : -1  ;
	    }
public static void main(String [] Args)
{
	System.out.println(canCompleteCircuit(new int[] {2,3,4}, new int[] {3,4,3}));
}
}
