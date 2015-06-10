/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2014/10/20
 * 	Uses: 判斷三角形三邊長是否合法
 * 	Java JDK: 1.8
 */
import java.util.Scanner;

public class ex04_5_103021076 {
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入第一邊長:");
		int val1 = scn.nextInt();
		System.out.print("請輸入第二邊長:");
		int val2 = scn.nextInt();
		System.out.print("請輸入第三邊長:");
		int val3 = scn.nextInt();
		fuc(val1,val2,val3);
	}
	static void fuc(int a,int b,int c){
		if(((a+b)>c)&&((b+c)>a)&&((c+a)>b)){
			System.out.print(a+","+b+","+c+" 為合法三邊長");
		}else{
			System.out.print(a+","+b+","+c+" 不是合法三邊長");
		}
	}
}