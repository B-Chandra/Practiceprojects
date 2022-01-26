import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number :");
		int m=0,flag=0;
		
		int n = scan.nextInt();
		
		if (n==0 || n==1) {
			System.out.println("Not Prime Number");
		}
		else {
			for (int i=2;i<=m;i++) {
				if (n%i==0) {
					System.out.println("Not Prime Number");
					flag = 1;
					break;
				}
				
				
			}
			if (flag == 0) {
				System.out.println("Prime Number");
			}
		}
		
	}

}
