import java.util.Scanner;
public class Increasing{
       public boolean checkNumber(int num)
       {
              boolean flag=false;
              String str = String.valueOf(num);
              int l = str.length();
              for(int i=0;i<l-1;i++)
              {
                     if(str.charAt(i)<=str.charAt(i+1) )
                           flag=true;
                     else
                           flag=false;
              }
              return flag;
       }
       public static void main(String[] ar)
       {
    	   Increasing a = new Increasing();
              Scanner b = new Scanner(System.in);
              System.out.println("Enter a number:");
              int s = b.nextInt();
              System.out.println("increasing number: "+a.checkNumber(s));
       }
}