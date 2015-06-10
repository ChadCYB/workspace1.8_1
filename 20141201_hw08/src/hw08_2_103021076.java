/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2014/12/01
 * 	Uses: 函數練習(計算C的m取n)，遞迴練習(N階層)
 * 	Java JDK: 1.8
 */
import java.util.Scanner;
public class hw08_2_103021076{
	public static void main(String [] argv){
    	Scanner scn = new Scanner(System.in);
    	System.out.println("請輸入一字串");
    	String inStr = scn.nextLine();
    	decomp(inStr.toCharArray());
	}
	private static void decomp(char[] inData){
		int dataLen = inData.length;
		for(int i=0;i<dataLen;i++){
			System.out.print(inData[i]+" ");
		}
	}
}
