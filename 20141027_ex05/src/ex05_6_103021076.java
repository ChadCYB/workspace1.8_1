/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2014/10/27
 * 	Uses: 計算n*(n+1)
 * 	Java JDK: 1.8
 */
import java.util.Scanner;
public class ex05_6_103021076 {
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		boolean tt = true;
		while(tt){
			System.out.print("計算n*(n+1)，請輸入n:");
			int n = scn.nextInt();
			System.out.println(fuc(n));
			System.out.print("是否繼續(y/n)?");
			String str = scn.next();
			tt=(str.equals("n")||str.equals("N"))?false:true;
		}
		System.out.print("Bye Bye!!");
	}
	static int fuc(int n){
		int sum=1,i=n,num=0;
		while(i>0){
			num = i*(i+1);
			sum = sum+num;
			System.out.print((num)+((i==1)?" = ":" + "));
			i--;
		}
		return sum;
	}
}