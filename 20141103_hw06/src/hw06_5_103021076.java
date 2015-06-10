/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2014/11/03
 * 	Uses: 計算(2^n)
 * 	Java JDK: 1.8
 */
import java.util.Scanner;
public class hw06_5_103021076 {
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		boolean tt = true;
		while(tt){
			System.out.print("計算2^n，請輸入n:");
			int n = scn.nextInt();
			System.out.println(fuc(n));
			System.out.print("是否繼續(y/n)?");
			String str = scn.next();
			tt=(str.equals("n")||str.equals("N"))?false:true;
		}
		System.out.print("Bye Bye!!");
	}
	static double fuc(int n){
		double sum=0,num=0;
		int i=n;
		while(i>0){
			num = Math.pow(2,i);
			sum = sum+num;
			System.out.print((num)+((i==1)?" = ":" + "));
			i--;
		}
		return sum;
	}
}