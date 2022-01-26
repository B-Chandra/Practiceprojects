package com.chandra.learning;

import java.util.Scanner;

public class LongestIs {
	static int max_ref; 
	  
    static int list(int arr[], int n)
    {
        if (n == 1)
            return 1;
 
        int res, max_end = 1;
  
        for (int i = 1; i < n; i++) {
            res = list(arr, i);
            if (arr[i - 1] < arr[n - 1] && res + 1 > max_end)
                max_end = res + 1;
        }
  
        if (max_ref < max_end)
            max_ref = max_end;
        return max_end;
    }
  
    static int lis(int arr[], int n)
    {
        
        max_ref = 1;
        list(arr, n);
  
        return max_ref;
    }
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[10];
		System.out.println("Enter no.of elements in Array :");
		int n = sc.nextInt();
		System.out.println("Add elements into array :");
		
		for (int i = 0; i<n; i ++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array Elements are :");
		for (int i = 0; i<n; i ++) {
			System.out.println(arr[i]);
		}
		System.out.println("The length of longest length subsequence "+ list(arr,n));
	}

}
