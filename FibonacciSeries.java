import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		//Scanner scan = new Scanner(System.in);
		// int num = scan.nextInt();
		int n1=0,n2=1,n3,num=10;
		System.out.print(" "+n2);
		
		for (int i=2; i<=num+1; i++) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
		
	}

}
