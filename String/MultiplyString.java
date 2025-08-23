package String;

public class MultiplyString {
public static String multiply(String num1, String num2) {
        Long a=Long.parseLong(num1);
        Long b=Long.parseLong(num2);
        return Long.toString(a*b);
    }
public static void main(String[] args) {
	String a="123456789";
	String b="987654321";
	System.out.println(multiply(a,b));
}
}
