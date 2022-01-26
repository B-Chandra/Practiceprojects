import java.util.Scanner;

public class Swap {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1 =scan.nextInt();
		int n2 =scan.nextInt();
		System.out.println(n1+" "+n2);
		
		n1 = n1+n2;
		n2 = n1-n2;
		n1 = n1-n2;
		System.out.printf("Swaped Numbers are : %d %d",n1,n2);
		
	}

}
