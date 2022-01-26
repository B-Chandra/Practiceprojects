import java.util.*;
public class OddEven {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number :");
		int a = scan.nextInt();
		
		if (a%2==0) {
			System.out.println("Number is EVEN");
		}
		else {
			System.out.println("Number is ODD");
		}
	}

}
