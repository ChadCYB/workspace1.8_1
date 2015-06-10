/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2014/12/08
 * 	Uses: 迴圈練習(找出連續的數列)
 * 	ex 15 >> 1+2+3+4+5,4+5+6
 *  Java JDK: 1.8
 */
import java.util.Scanner;
public class ex10_1_103021076 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入一個整數");
		int inNum = scn.nextInt();
		System.out.println(judge(inNum));
	}

	private static String judge(int maxInt) {
		int i,j,k;
		String ans= maxInt+">>\n";
		for(i=1; i<=(maxInt/2+1); i++) {
			for(j=i; j<=(maxInt/2+1); j++) {
				if(((i+j)*(Math.abs(i-j)+1)/2) == maxInt){
					for(k=i;k<=j;k++){
						ans += k+"+";
					}
					ans = ans.substring(0, ans.length()-1)+"\n";
				}
			}
		}
/*		System.out.println("==============================");
		for(i=1; i<(maxInt-1); i++) {
			for(j=1; j<(maxInt/i); j++) {
				if(((j+1)*i + j*(j+1)/2) == maxInt) {
					for(k=0;k<(j+1);k++) {
						ans += (i+k) + "+";
					}
					ans = ans.substring(0, ans.length()-1)+";\n";
				}
			}
		}*/
		return ans;
	}	
}