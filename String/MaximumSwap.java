package String;

public class MaximumSwap {
public static int maximumSwap(int num) {
	 char[] digits = Integer.toString(num).toCharArray();
     int[] last = new int[10]; // Stores the last index of each digit (0-9)

     // Fill the last occurrence of each digit
     for (int i = 0; i < digits.length; i++) {
         last[digits[i] - '0'] = i;
     }

     // Try to swap with a bigger digit from the right
     for (int i = 0; i < digits.length; i++) {
         for (int d = 9; d > digits[i] - '0'; d--) {
             if (last[d] > i) {
                 // Swap
                 char temp = digits[i];
                 digits[i] = digits[last[d]];
                 digits[last[d]] = temp;

                 // Return the result after swap
                 return Integer.parseInt(new String(digits));
             }
         }
     }

     // No beneficial swap found
     return num;
}
public static void main(String[] args) {
	int n=98368;
	System.out.print(maximumSwap(n));
}
}
