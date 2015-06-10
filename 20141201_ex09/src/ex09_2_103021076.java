/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2014/12/01
 * 	Uses: 大小寫轉換器
 * 	Java JDK: 1.8
 */
import java.util.Scanner;
public class ex09_2_103021076{
	public static void main(String [] argv){
    	Scanner scn = new Scanner(System.in);
    	System.out.print("請輸入英文字元:");
    	String strIn = scn.next();
		int asciCode = (int)(strIn.charAt(0));
		if(65<=asciCode && asciCode<=90){
			System.out.println(strIn+"-->"+strIn.toLowerCase());	//轉換成大寫
		}else{
			System.out.println(strIn+"-->"+strIn.toUpperCase());	//轉換成小寫
		}
	}
}
