/*	Author: �����e
 * 	Student ID: 103021076
 * 	Date: 2014/12/29
 * 	Uses: �ϥΪ̿�J���n�A�C�|�ƦC����W�Ln�A�榡�p�U
 *  1,2,4,7,11,16,22,29...
 *  1,2,2,3,3,3,4,4,4,4,5,5,5,5,5....
 *  Java JDK: 1.8
 */
import java.util.Scanner;
public class hw12_3_103021076 {
	public static void main(String[] avg){
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�@���:");
		String strA="", strB="";
		int n = scn.nextInt(),sum=1,count=1;
		while(sum <= n){
			strA += (sum+",");
			sum += count++;
		}
		System.out.println(strA.substring(0,strA.length()-1));	//�R���̫�@��","
		int i,j;
		for(i=1;i<=n;i++){
			for(j=1;j<=i;j++){
				strB += (i+",");
			}
		}
		System.out.println(strB.substring(0,strB.length()-1));	//�R���̫�@��","
	}
}
