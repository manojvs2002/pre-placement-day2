package day2;

import java.util.Arrays;

public class NextPermutation {
	
	public static void permutation(int a[]) {
		int i=a.length-2;
		while(i>=0 && a[i+1]<=a[i]) {
			i--;
		}
		
		if(i>=0) {
			int j=a.length-1;
			while(a[j]<=a[i]) {
				j--;
			}
			swap(a,i,j);
			
		}
		reverse(a,i+1);
	}

	private static void reverse(int[] a, int start) {
		// TODO Auto-generated method stub
		int i=start,j=a.length-1;
		while(i<j) {
			swap(a,i,j);
			i++;j--;
		}
	}

	private static void swap(int[] a, int i, int j) {
		// TODO Auto-generated method stub
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3};
		System.out.println(Arrays.toString(a));
		permutation(a);
		System.out.println(Arrays.toString(a));

	}

}
