package tt;

import java.util.Scanner;
public class ex08 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int v1 = scn.nextInt();
		System.out.println(count(v1,0)+"¦ì¼Æ");
	}
	public static int count(int v2,int a) {
		System.out.println(v2);
		if (v2/10==0) {
			return ++a;
		} else {
			return count(v2/10,++a);
		}
	}
}