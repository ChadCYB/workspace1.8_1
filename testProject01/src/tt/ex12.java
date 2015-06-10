package tt;

import java.util.Scanner;
public class ex12 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.print( new StringBuffer(str).reverse().toString());
	}
	public static int gcd(int m, int n){
		if(n==0){
			return m;
		}else{
			return gcd(n,m%n);
		}
		
	}
}