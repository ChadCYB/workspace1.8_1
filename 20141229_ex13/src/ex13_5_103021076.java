/*	Author: �����e
 * 	Student ID: 103021076
 * 	Date: 2014/12/29
 * 	Uses: �ϥΪ̿�J�r��A�N�Ҧ��Ʀr�ۥ[
 *  input: 1A2BC5	output: 1+2+5=8
 *  Java JDK: 1.8
 */
import java.util.Scanner;
public class ex13_5_103021076 {
	public static void main(String[] avg){
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�@�Ʀr�r��:");
		String str = scn.nextLine();
		String strOut = "";
		char[] data = str.toCharArray();
		int i,sum=0;
		for(i=0;i<str.length();i++){
			if(48<=data[i] && data[i]<=57){
				strOut += data[i]+"+";
				sum += (data[i]-'0');
			}
		}
		System.out.println(strOut.substring(0,strOut.length()-1)+"="+sum);
	}
}
