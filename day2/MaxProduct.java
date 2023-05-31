package day2;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MaxProduct {
	
	static int product(int []a) {
		Arrays.sort(a);
		int n=a.length;
		 int p1=a[n-1]*a[n-2]*a[n-3];
		 int p2=a[0]*a[1]*a[2];
		 
		 return Math.max(p1, p2);
	}
	public static void main(String... args) {
	
		int a[]= {7,3,5,7,8};
	 	int sum=product(a);
	 	System.out.println(sum);
	}

}
