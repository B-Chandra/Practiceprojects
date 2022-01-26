import java.util.Scanner;

public class StringSplit {
	public static void main(String[] args) {
		
//		String str1;
//		str1 = "Love@is@Trust";
//		String str2 [] = str1.split("@");
		System.out.println("Enter a String :");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String s[] = str.split(" ");
		System.out.println("Splitting the String :");
		
		for (String a : s) {
			System.out.println(a);
		}
	}

}
