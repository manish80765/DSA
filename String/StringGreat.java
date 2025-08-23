package String;


public class StringGreat {
	public static String makeGood(String s) {
		StringBuilder stack = new StringBuilder();

        for (char ch : s.toCharArray()) {
            int len = stack.length();
            if (len > 0 && Math.abs(stack.charAt(len - 1) - ch) == 32) {
                stack.deleteCharAt(len - 1); 
            } else {
                stack.append(ch);
            }
        }

return stack.toString();}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="leEeetcode";
System.out.println(makeGood( s));
	}

}
