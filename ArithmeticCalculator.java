package com.chandra.learning;

import java.util.Scanner;
import java.lang.Math;
import java.lang.*;
import java.io.*;

public class ArithmeticCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1,num2;
		System.out.println("Enter the numbers :");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.println("Enter the Operator(+,-,*,/)");
		char operator = sc.next().charAt(0);
		double out = 0;
		switch(operator) {
		case '+':
			out = num1 + num2;
		break;
		case '-':
			out = num1 - num2;
		break;
		case '*':
			out = num1 * num2;
		break;
		case '/':
			out = num1 / num2;
		
			
		}
		System.out.println("The result is :");
		System.out.println(num1 +" "+ operator + " " + num2 + " = " + out);
	}
	

}
