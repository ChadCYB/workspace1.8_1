/*	Author: �����e
 * 	Student ID: 103021076
 * 	Date: 2014/12/15
 * 	Uses: ��JN�Ӥ���(�Ʀr�Φr��)�A��XN�Ҧ��i��ƦC
 *  Java JDK: 1.8
 */
import java.util.*;

public class hw10_1_103021076 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�n�ƦC���r��: ");
		String str = scn.next();
		ArrayList ary = rank("", str);
		String[] arr = (String[]) ary.toArray(new String[0]);
		System.out.println(Arrays.toString(arr));
	}
	
	private static ArrayList rank(String pre, String inStr) {
		ArrayList ary = new ArrayList();
		if (inStr.length() != 1) {
			for (int i=0; i<inStr.length(); i++) {
				String s = pre + inStr.charAt(i);
				StringBuffer sb = new StringBuffer(inStr);
				ary.addAll(rank(s, sb.deleteCharAt(i).toString()));
			}
		}else{
			ary.add(pre + inStr);
		}
		return ary;
	}
}
