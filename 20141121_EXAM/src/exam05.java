/*	Author: �����e
 * 	Student ID: 103021076
 * 	Date: 2014/11/21
 * 	Uses: �}�C��m(��C�ഫ)
 * 	1 0 1 0	 ��	1 1 0 0 
 * 	1 1 1 1		0 1 0 1 
 * 	0 0 0 0		1 1 0 0 
 * 	0 1 0 1		0 1 0 1 
 * 	Java JDK: 1.8
 */
import java.util.Scanner;
public class exam05 {
	public static void main(String[] arg){
		Scanner scn = new Scanner(System.in);	
		String[] inNum = scn.nextLine().split(" ");	//�Ĥ@���ƿ�J����
		int i,j,len=inNum.length;					//�]�w�}�C��Ƥj�p
		String[][] N = new String[len][len];		//�ŧi�}�C��Ƥj�p
		String[][] M = new String[len][len];
		N[0] = inNum;								//�Ĥ@���ƥ�i�}�C
		for(i=1;i<len;i++){							//�ΰj��]�n��J�X��	
			if(i==0){scn.nextLine();}				//�ѨMnextLine��BUG
			N[i] = scn.nextLine().split(" ");		//��ƿ�J����
		}
		for(i=0;i<len;i++){
			for(j=0;j<len;j++){
				M[j][i] = N[i][j];					//�}�C��m
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