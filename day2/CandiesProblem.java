package day2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CandiesProblem {
	
	static int find(int[] a) {
		int maxtype=a.length/2;
		Set<Integer> candies=new HashSet<>();
		
		for(int b:a) {
			candies.add(b);
			
		}
		return Math.min(candies.size(), maxtype);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			 a[i]=scan.nextInt();
		}
		int res=find(a);
		System.out.println(res);
	}

}
