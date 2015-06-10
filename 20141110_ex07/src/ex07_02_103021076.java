/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2014/11/10
 * 	Uses: [1到100(基數相加),1到100(偶數相加),連加A到B]>>>(全部改用While)
 * 	Java JDK: 1.8
 */
import java.util.Scanner;
public class ex07_02_103021076 {
	public static void main(String[] args) {
		int start=1, end=100, sum=0, i;
		i = start;
		while(i<=end){
			sum+=(i%2==0)?i:0;
			i++;
		}
		System.out.println(start+"加到"+end+"(偶數相加) = "+sum);
		System.out.println("=================================");
		
		sum=0;
		i = start;
		while(i<=end){
			sum+=(i%2==0)?0:i;
			i++;
		}
		System.out.println(start+"加到"+end+"(基數相加) = "+sum);
		System.out.println("=================================");
		
		Scanner scn = new Scanner(System.in);
		sum=0;
		System.out.print("請輸入起始值:");
		start = scn.nextInt();
		System.out.print("請輸入結束值:");
		end = scn.nextInt();
		i=start;
		while(i<=end){
			sum+=i;
			i++;
		}
		System.out.println(start+"加到"+end+" = "+sum);
	}
}