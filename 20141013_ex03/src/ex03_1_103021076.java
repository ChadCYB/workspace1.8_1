/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2014/10/13
 * 	Uses: 數字串加總
 */
import java.util.Scanner;
public class ex03_1_103021076 {
	public static void main(String[] args) {
		int num,sum = 0;
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入要計算的數字個數: ");
		int count = scn.nextInt();
		for (int i=0;i<count;i++){
			System.out.print("請輸入第"+(i+1)+"個數字: ");
			num = scn.nextInt();
			sum = sum+num;
		}
		System.out.print("剛剛輸入的數字總合為: "+sum);
	}
}
