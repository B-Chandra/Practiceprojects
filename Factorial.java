import java.util.*;
public class Factorial {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in); 
		System.out.println("Enter the number :");
		int a = scan.nextInt();
		int fact_var =1;
		
		
		for (int i=1; i<=a; i++) {
			
			fact_var *= i;
			
		}
		System.out.printf("Factorial of number is : %d",fact_var);
	}

}
