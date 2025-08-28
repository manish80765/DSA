package contest;

public class GCD {
	public static int GCD(int n, int m)
	{
		int result = Math.min(n, m);
        while (result > 0) {
            if (n % result == 0 && m % result == 0) {
                break;
            }
            result--;
        }
        return result;
	}
public static int gcdOfOddEvenSums(int n) {
	int sumodd=0;
	int sumeven=0;
	int count =0;
	int num=1;
	while(count<n)
	{
		if(num%2==0)
		{
			sumeven=sumeven+num;			
			num++;
			count++;
			continue;
		}
		else
		{
			sumodd=sumodd+num;
			num++;
		}
		
	}   
    return GCD(sumodd, sumeven);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gcdOfOddEvenSums(5);

	}

}
