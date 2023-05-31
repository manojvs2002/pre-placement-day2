package day2;

import java.util.Arrays;
import java.util.Scanner;

public class ParingMaxSum {
	
	static int sum(int a[]) {
		Arrays.sort(a);
		int sum=0;
		for(int i=0;i<a.length;i+=2) {
			sum+=a[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			 a[i]=scan.nextInt();
		}
		int res=sum(a);
		System.out.println(res);

	}

}
