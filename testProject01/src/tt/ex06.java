/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2014/12/15
 * 	Uses: 輸入N個元素(數字或字元)，輸出N所有可能排列
 *  Java JDK: 1.8
 */
package tt;

import java.util.*;

public class ex06 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入要排列的字串: ");
		String str = scn.next();
		int i, n = 1;
		for (i = 1; i <= str.length(); i++) {
			n *= i;
		}
		String[] ary = new String[n];
		rank1("", str, ary, 0);
		showAry(ary);
	}

	private static void rank1(String pre, String inStr, String[] ary, int count) {
		int i, n = 1;
		if (inStr.length() != 1) {
			for (i = 0; i < inStr.length(); i++) {
				String s = pre + inStr.charAt(i);
				String sb = remove(s,inStr.charAt(i)+"",i);
				rank1(s, sb, ary, count);
			}
		} else {
			ary[count] = (pre + inStr);
			count++;
		}
	}

	private static void showAry(String[] ary) {
		for (int i = 0; i < ary.length; i++) {
			System.out.println(ary[i]);
		}
	}

	private static String remove(String s, String string, int i) {
		if (i == 1) {
			int j = s.indexOf(string);
			s = s.substring(0, j) + s.substring(j + 1);
			i--;
			return s;
		} else {
			int j = s.indexOf(string);
			i--;
			return s.substring(0, j + 1)+ remove(s.substring(j + 1), string, i);
		}
	}
}
