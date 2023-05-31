package day2;

import java.util.Scanner;

public class CalculatePower {

	public static int pow(int x,int n) {
		if(n==0)
			return 1;
		else if(n<0)
			{
				n=-n;
				x=(1/x);
			}
		return (n%2==0)?pow(x*x,n/2):x*pow(x*x,n/2);	
		}
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);

		int x=scan.nextInt();
		int n=scan.nextInt();
		int res=pow(x,n);
		System.out.println(res);
	}

}
