/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2014/12/22
 * 	Uses: 輸入X，輸出Y
 * 	y=3*x^2		(若 x<-1)
 *  y=x^3+3*x-3	(若 -1<=x<=1)
 *  y=2*x+3		(若 x>1)
 *  Java JDK: 1.8
 */
import java.util.Scanner;
public class ex11_1_10321076 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入x = ");
		int x = scn.nextInt();
		cal(x);
	}
	private static void cal(int x){
		int y;
		if(x<-1){
			y=(int)(3*Math.pow(x,2));
			System.out.println("(x<-1) =>\ny=3*x^2 = "+y);
			
		}else if(x>1){
			y=(int)(Math.pow(x,3)+3*x-3);
			System.out.println("(x>1) =>\ny=2*x+3 = "+y);
		}else{	//-1<=x<=1
			y=2*x+3;
			System.out.println("(-1<=x<=1) =>\ny=x^3+3*x-3 = "+y);
		}
	}
	
}
