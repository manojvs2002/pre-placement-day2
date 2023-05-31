package day2;

import java.util.Arrays;

public class RotationaSortedArray {
	public static boolean find(int a[],int sum) {
		int n=a.length;
		int i;
		for(i=0;i<n;i++)
			if(a[i]>a[i+1])
				break;
		int l=(i+1)%n;
		int r=(i-1+n)%n;
		
		while(l!=r) {
			 sum=a[l]+a[r];
			
			if(a[l]+a[r]>sum) {
				l=(l+1)%a.length;
			}
			else if(a[l]+a[r]<sum) {
				r=(r-1+a.length)%a.length;
			}
			else if(a[l]+a[r]==sum) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {11,15,6,8,9,10};
		int sum=16;
		if(find(a,sum))
			System.out.println("true");
		else
			System.out.println("false");
	}

}
