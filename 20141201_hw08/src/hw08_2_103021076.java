/*	Author: �����e
 * 	Student ID: 103021076
 * 	Date: 2014/12/01
 * 	Uses: ��ƽm��(�p��C��m��n)�A���j�m��(N���h)
 * 	Java JDK: 1.8
 */
import java.util.Scanner;
public class hw08_2_103021076{
	public static void main(String [] argv){
    	Scanner scn = new Scanner(System.in);
    	System.out.println("�п�J�@�r��");
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
