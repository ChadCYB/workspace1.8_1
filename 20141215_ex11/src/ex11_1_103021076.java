/*	Author: ³¯«³§e
 * 	Student ID: 103021076
 * 	Date: 2014/12/15
 * 	Uses: ¨ç¼Æ½m²ß(©î¶}¦r¦ê)
 *  Java JDK: 1.8
 */
import java.util.Scanner;

public class ex11_1_103021076 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("½Ð¿é¤J¦r¦ê:");
		String str = scn.next();
		System.out.println(decomp(str));
	}
	private static String decomp(String input){
		String output = "";
		int strLen = input.length();
		for(int i=0;i<strLen;i++){
			output += (input.substring(i,i+1)+((i==strLen-1)?"":" "));
		}
		return output;
	}
}
