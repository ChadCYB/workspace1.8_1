/*	Author: �����e
 * 	Student ID: 103021076
 * 	Date: 2014/10/20
 * 	Uses: �C�L�Ʀr�}�C
 * 	Java JDK: 1.8
 */
import java.util.Scanner;

public class ex04_2_103021076 {
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�e:");
		int w = scn.nextInt();
		System.out.print("�п�J��:");
		int h = scn.nextInt();
		F(w,h);
	}
	static void F(int w, int h){
		for(int i=1;i<=h;i++){
			for(int j=1;j<=w;j++){
				System.out.print(i*j+"\t");
			}
			System.out.println();
		}	
	}
}