package com.chandra.learning;

import java.util.Scanner;

public class ValidateEmail {
		public static void main(String[] args) {
		      Scanner a = new Scanner(System.in);
		      
		      System.out.println("Enter your Email: ");
		      String Email = a.next();
		      
		      String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
		      
		      boolean result = Email.matches(regex);
		      
		      if(result) {
		         System.out.println("Email-id is valid");
		      } else {
		         System.out.println("Email-id is not valid");
		      }
		   }
}
