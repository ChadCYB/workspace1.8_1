/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2014/12/15
 * 	Uses: 函數練習(一維陣列平方)
 *  Java JDK: 1.8
 */
import java.util.Scanner;

public class ex11_3_103021076 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr = {1,2,8,6,7,4,5,9,3};
		square(arr);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
	}
	
	public static void square(int[] data){
		for(int i=0;i<data.length;i++){
			data[i] *= data[i];
		}
	}
}