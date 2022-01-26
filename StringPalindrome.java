import java.util.Scanner;

public class StringPalindrome {
	public static void main(String[] args) {
		System.out.println("Enter the String :abcba");
		String rev ="";
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int l = str.length();
		
		for (int i = l - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if (str.equals(rev)) {
			System.out.println(str +" is Palindrome");
		}
		else {
			System.out.println(str +" is not a Palindrome");
		}
		
	}
	
}
