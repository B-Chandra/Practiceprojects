import java.util.Scanner;

public class SumOfNumber3 {
	
	public static void main(String[] args)   
	{     
	int n,i,sum = 0;  
	
	Scanner scan = new Scanner(System.in);  
	System.out.println("Sum from: ");  
	
	i = scan.nextInt();  
	System.out.println("Sum to: ");  
	n = scan.nextInt();  
	while(i <= n)  
	{  
	
	sum = sum + i;  
	
	i++;  
	}  
	 
	System.out.println("Sum of Numbers : " + sum);  
	}  
}