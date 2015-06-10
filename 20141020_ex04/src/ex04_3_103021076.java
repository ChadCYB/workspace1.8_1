/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2014/10/20
 * 	Uses: 身高體重換算
 * 	Java JDK: 1.8
 */
import java.util.Scanner;

public class ex04_3_103021076 {
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入體重(kg):");
		float kg = scn.nextFloat();
		System.out.print("請輸入身高(cm):");
		float cm = scn.nextFloat();
		Trans(kg,cm);
	}
	static void Trans(float kg, float cm){
		float inch, pound;
		inch = (float)(cm/2.54);
		pound = (float)(kg/0.454);
		System.out.println(kg+"(kg)="+pound+"(pound)");
		System.out.println(cm+"(cm)="+inch+"(inch)");
		
	}
}