/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2014/12/15
 * 	Uses: 遞迴練習(求費式係數值)
 *  Java JDK: 1.8
 */
import java.util.Scanner;

public class ex11_2_103021076 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Fibonacii,f(n):");
		int num = scn.nextInt();
		System.out.println(fuc(num));
	}
	public static int fuc(int num){
		if(num==1||num==2){
			return 1;
		}else{
			return (fuc(num-1)+fuc(num-2));
		}
	}
}