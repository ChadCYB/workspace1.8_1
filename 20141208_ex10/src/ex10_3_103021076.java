/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2014/12/08
 * 	Uses: 亂數4位數，輸出猜中幾位數
 *  Java JDK: 1.8
 */
import java.util.Scanner;
public class ex10_3_103021076 {
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int i,inNum,randNum;
		int[] a = new int[4];
		int[] b = new int[4];
		randNum = (int)(Math.random()*8999)+1000;
		for(i=0;i<4;i++){
			a[i] = digit(randNum, i);
		}
		System.out.println(randNum);
		do{
			System.out.print("猜一四位數整數:");
			inNum = scn.nextInt();
			for(i=0;i<4;i++){
				b[i] = digit(inNum, i);
				if(a[i]==b[i]){
					System.out.println("猜中第"+(i+1)+"位數");
				}
			}
		}while(inNum!=randNum);
		System.out.println("答對");
	}
	public static int digit(int number, int n) {
		return (int) (number / Math.pow(10, n) % 10);
	}
}
