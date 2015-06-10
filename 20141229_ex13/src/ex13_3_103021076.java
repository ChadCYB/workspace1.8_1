/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2014/12/29
 * 	Uses: 使用者輸入整數n，輸出陣列A,B
 * 	input:3
 * 	output:
 * 	A[3][3]=	B[3][3]=
 * 	1	2	3	1	6	7
 * 	6	5	4	2	5	8
 * 	7	8	9	3	4	9
 *  Java JDK: 1.8
 */
import java.util.Scanner;
public class ex13_3_103021076 {
	public static void main(String[] avg){
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入一整數:");
		int n = scn.nextInt();
		int[][] A = new int[n][n];
		int[][] B = new int[n][n];
		int i,j,count=1;
		
		for(i=0;i<n;i++){
			if(i%2==0){	//遞增
				for(j=0;j<n;j++){
					A[i][j] = count++;
				}
			}else{		//遞減
				for(j=n-1;j>=0;j--){
					A[i][j] = count++;
				}
			}			
		}
		count = 1;
		for(i=0;i<n;i++){
			if(i%2==0){	//遞增
				for(j=0;j<n;j++){
					B[j][i] = count++;
				}
			}else{		//遞減
				for(j=n-1;j>=0;j--){
					B[j][i] = count++;
				}
			}			
		}
		System.out.println("A["+n+"]["+n+"]=");
		showAry(A);
		System.out.println("B["+n+"]["+n+"]=");
		showAry(B);
	}
	private static void showAry(int[][] ary){
		int i,j,n=ary.length;
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				System.out.print(ary[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
