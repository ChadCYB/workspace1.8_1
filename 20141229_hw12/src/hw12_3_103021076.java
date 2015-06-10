/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2014/12/29
 * 	Uses: 使用者輸入整數n，列舉數列直到超過n，格式如下
 *  1,2,4,7,11,16,22,29...
 *  1,2,2,3,3,3,4,4,4,4,5,5,5,5,5....
 *  Java JDK: 1.8
 */
import java.util.Scanner;
public class hw12_3_103021076 {
	public static void main(String[] avg){
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入一整數:");
		String strA="", strB="";
		int n = scn.nextInt(),sum=1,count=1;
		while(sum <= n){
			strA += (sum+",");
			sum += count++;
		}
		System.out.println(strA.substring(0,strA.length()-1));	//刪除最後一個","
		int i,j;
		for(i=1;i<=n;i++){
			for(j=1;j<=i;j++){
				strB += (i+",");
			}
		}
		System.out.println(strB.substring(0,strB.length()-1));	//刪除最後一個","
	}
}
