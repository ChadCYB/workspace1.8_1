/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2014/11/21
 * 	Uses: 陣列轉置(行列轉換)
 * 	1 0 1 0	 轉	1 1 0 0 
 * 	1 1 1 1		0 1 0 1 
 * 	0 0 0 0		1 1 0 0 
 * 	0 1 0 1		0 1 0 1 
 * 	Java JDK: 1.8
 */
import java.util.Scanner;
public class exam05 {
	public static void main(String[] arg){
		Scanner scn = new Scanner(System.in);	
		String[] inNum = scn.nextLine().split(" ");	//第一行資料輸入分割
		int i,j,len=inNum.length;					//設定陣列資料大小
		String[][] N = new String[len][len];		//宣告陣列資料大小
		String[][] M = new String[len][len];
		N[0] = inNum;								//第一行資料丟進陣列
		for(i=1;i<len;i++){							//用迴圈跑要輸入幾行	
			if(i==0){scn.nextLine();}				//解決nextLine的BUG
			N[i] = scn.nextLine().split(" ");		//資料輸入分割
		}
		for(i=0;i<len;i++){
			for(j=0;j<len;j++){
				M[j][i] = N[i][j];					//陣列轉置
			}
		}
		System.out.println();
		for(i=0;i<len;i++){
			for(j=0;j<len;j++){
			System.out.print(M[i][j]+" ");
			}
		System.out.println();
		}
	}
}