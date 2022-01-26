import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number :");
		int m;
		
		int s = scan.nextInt();
		for(int i=2;i<s;i++)
		{
			m=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				m=1;
			}
			if(m==0)
				System.out.println(i);
	}

}
}
