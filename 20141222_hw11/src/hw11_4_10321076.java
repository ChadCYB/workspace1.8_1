/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2014/12/22
 * 	Uses: 將一個集合的所有子集合找出來
 *  Java JDK: 1.8
 */
import java.util.Scanner;
public class hw11_4_10321076 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入要排列的字串: ");
		String str = scn.next();
		Subset(str.toCharArray());
	}
	private static void Subset(char element[]) {
		int length = element.length,i,j,k=1;
		for( i=1;i<(int)(Math.pow(2,length));i++){
			System.out.print((k++)+"\t[");
			for(j=0;j<length;j++){
				if((i & (int)(Math.pow(2,j)))!=0){
					System.out.print(element[j]);
				}
			}
			System.out.print("]\n");
		}    
	}
}
