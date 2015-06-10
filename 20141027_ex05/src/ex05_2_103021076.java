/*	Author: 朝
 * 	Student ID: 103021076
 * 	Date: 2014/10/27
 * 	Uses: 参璸タ计璽计箂Τ碭
 * 	Java JDK: 1.8
 */
import java.util.Scanner;
public class ex05_2_103021076 {
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int a=0,b=0,c=0,num;
		for(int i=0;i<6;i++){
			System.out.print("叫块材"+(i+1)+"计:");
			num = scn.nextInt();
			if(num>0)a++;
			if(num<0)b++;
			if(num==0)c++;
		}
		System.out.println("タ计:"+a+" ; 璽计:"+b+" ; 箂:"+c+"");
	}
}
