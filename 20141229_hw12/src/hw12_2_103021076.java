/*	Author: �����e
 * 	Student ID: 103021076
 * 	Date: 2014/12/29
 * 	Uses: �Q�i��p�⪺�{���A���N�W�j����ƪ��[�k�P���k
 *  Java JDK: 1.8
 */
import java.math.BigInteger;
import java.util.Scanner;
public class hw12_2_103021076 {
	public static void main(String[] avg){
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�JA:");
		String a = scn.next();
		System.out.print("�п�JB:");
		String b = scn.next();
		System.out.print("�п�ܼҦ�[(1)+ (2)- (3)* (4)/]:");
		int mode = scn.nextInt();
		BigInteger valA = new BigInteger(a);
		BigInteger valB = new BigInteger(b); 
		switch(mode){
		case 1:		// +
			System.out.print("A + B = \n"+valA.add(valB));
			break;
		case 2:		// -
			System.out.print("A - B = \n"+valA.subtract(valB));
			break;
		case 3:		// *
			System.out.print("A * B = \n"+valA.multiply(valB));
			break;
		case 4:		// /
			System.out.print("A / B = \n"+valA.divide(valB));
			break;
		}
	}
}
