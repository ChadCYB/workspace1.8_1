/*	Author: �����e
 * 	Student ID: 103021076
 * 	Date: 2014/11/21
 * 	Uses: �P�_ N �n�h�֦���~�|�j�� 10000
 * 	Java JDK: 1.8
 */
import java.util.Scanner;
public class exam04 {
	public static void main(String[] arg){
		Scanner scn = new Scanner(System.in);
		int n,i=1,ans;
		System.out.print("�п�Jn:");
		n = scn.nextInt();
		do{
			ans = (int)Math.pow(n,i);
			i++;
			System.out.println(n+"��"+i+"���� = "+ans);
		}while(ans<=10000);
	}
}