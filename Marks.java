package StudentsMarks;

import java.util.Scanner;

public class Marks {
	private static int PASSING;
	private static int FAILING;

	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the marks:");
	
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		
		int sum = a + b + c;
//		int n;
//		// n = a>=40 ? "PASSING" : b>=40 ? "PASSING" : c>=40 ? "PASSING" : sum >=125 ? "PASSING" : "FAILING"; 
//		n = (a>=40) ? PASSING : FAILING;
		
		if (a >=40) {
			if (b>=40) {
				if (c>=40) {
					if (sum>=125) {
						System.out.println("PASSING");
					}
					else {
						System.out.println("FAILING");
					}
				}
			}
		}
		
	}

}
