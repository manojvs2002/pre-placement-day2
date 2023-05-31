package day2;

public class Monotonic {
	static boolean check(int[] a) {
		int n=a.length;
		boolean inc=true,dec=true;
		for(int i=1;i<n-1;i++) {
			if( a[i]<a[i-1]) {
				inc=false;
			}
			 if( a[i]>a[i-1]) {
				dec=false;
			}
		}
		return inc||dec;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {1,2,2,3};
		boolean flag=check(a);
		System.out.println(flag);

	}

}
