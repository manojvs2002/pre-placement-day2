package day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Search {
	
	static int search(int []a,int target) {
	
		int i=0,j=a.length-1;
		int mid=(i+j)/2;
		while(i<=j) {
			if(a[mid]==target)
				return mid;
			else if(a[mid]<target)
				i=mid+1;
			else
				j=mid-1;
		}
		return mid;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {4,3,2,1,4,24,5};
		int x=1;
		int flag=search(a,x);
		System.out.println(flag);

	}

}
