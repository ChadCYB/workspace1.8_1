/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2015/01/12
 * 	Uses: 計算兩個矩陣的乘法
 * 	A是mxp的矩陣，B是pxn的矩陣，C=AB為mxn的矩陣
 *  Java JDK: 1.6
 */
import java.util.Scanner;
public class ex15_3_103021076 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("A矩陣m*p");
		System.out.print("請輸入m:");
		int m = scn.nextInt();
		System.out.print("請輸入p:");
		int p = scn.nextInt();
		System.out.println("B矩陣p*n");
		System.out.print("請輸入n:");
		int n = scn.nextInt();
		int[][] mxp = new int[m][p];
		int[][] pxn = new int[p][n];
		rndAry(mxp); rndAry(pxn);
		int[][] mxn = times(mxp,pxn);
		System.out.println("A("+m+"x"+p+"):");
		showAry(mxp);
		System.out.println("B("+p+"x"+n+"):");
		showAry(pxn);
		System.out.println("C("+m+"x"+n+")=A*B:");
		showAry(mxn);
	}
	private static int[][] times(int[][] A,int[][] B){
		int[][] C = new int[A.length][B[0].length];
		int i,j;
		for(i=0; i<C.length; i++){
			for(j=0; j<C[i].length; j++){
				int ai=0, bj=0;
				while(ai<A[i].length && bj<B.length){
					C[i][j]+=A[i][ai++]*B[bj++][j];
				}
			}
		}
		return C;
	}
	private static void rndAry(int[][] arr){
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				arr[i][j] = (int)(Math.random()*100)-50;
			}
		}
	}
	private static void showAry(int[][] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
