/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2014/12/22
 * 	Uses: A,B陣列中，算出任兩個元素的距離，找到最小值
 *  Java JDK: 1.8
 */
import java.util.Scanner;
public class ex11_4_10321076 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入陣列長度:");
		int n = scn.nextInt();
		int[] A = new int[n];
		int[] B = new int[n];
		rndAry(A);	rndAry(B);
		System.out.println("A陣列:");
		showAry(A);
		System.out.println("B陣列:");
		showAry(B);
		System.out.println("A-B 陣列的最小距離: "+findAryDis(A,B));
	}
	private static int findAryDis(int[] A,int[] B){
		int min=10,i,j,cal;
		for(i=0;i<A.length;i++){
			for(j=0;j<B.length;j++){
				cal = A[i]-B[j];
				min = (Math.abs(cal)<min)?Math.abs(cal):min;
			}
		}
		return min;
	}
	private static void rndAry(int[] arr){
		for(int i=0;i<arr.length;i++){
			arr[i] = (int)(Math.random()*10)-5;
		}
	}
	private static void showAry(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+((i==arr.length-1)?"\n":"\t"));
		}
	}
}
