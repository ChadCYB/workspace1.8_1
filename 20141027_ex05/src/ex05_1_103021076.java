/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2014/10/27
 * 	Uses: 判斷是哪一種三角形
 * 	Java JDK: 1.8
 */
import java.util.Scanner;
public class ex05_1_103021076 {
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int val1,val2,val3,temp;
		System.out.print("請輸入第一邊長:");
		val1 = scn.nextInt();
		System.out.print("請輸入第二邊長:");
		val2 = scn.nextInt();
		System.out.print("請輸入第三邊長:");
		val3 = scn.nextInt();
		if(val2>val1){
			temp = val1;
			val1 = val2;
			val2 = temp;
		}
		if(val3>val1){
			temp = val1;
			val1 = val3;
			val3 = temp;
		}
		if(val2>val3){
			temp = val2;
			val2 = val3;
			val3 = temp;
		}
		fuc(val1,val2,val3);
	}
	static void fuc(int a,int b,int c){		
		if(((a+b)>c)&&((b+c)>a)&&((c+a)>b)){
			if((b*b+c*c)==(a*a)){
				System.out.print(a+","+b+","+c+" 是直角三角形");
			}else if((b*b+c*c)<(a*a)){
				System.out.print(a+","+b+","+c+" 是鈍角三角形");
			}else{
				System.out.print(a+","+b+","+c+" 是銳角三角形");
			}
			
		}else{
			System.out.print(a+","+b+","+c+" 不是合法三邊長");
		}
	}
}
