/*	Author: �����e
 * 	Student ID: 103021076
 * 	Date: 2014/11/10
 * 	Uses: �Τ@�o�������P�_
 * 	Java JDK: 1.8
 */
import java.util.Scanner;
public class hw07_1_103021076 {
	public static void main(String[] arg){
		String[] bingo = {"01272636","39412201","94586356"};
		char[][] num = new char[bingo.length+1][];
		Scanner scn = new Scanner(System.in);
		boolean tt = true;
		while(tt){				//��J�o���P�_�j��
			System.out.print("�п�J�o�����X(8�X):");
			String str = scn.next();
			num[0]=str.toCharArray();
			if((num[0].length)!=8){
				System.out.println("��J���~");
			}else{
				tt = false;
			}
		}
		
		int i,j,a=0;
		for(i=1;i<=bingo.length;i++){	//bingo�}�C�����num�}�CtoCharArray
			num[i]= bingo[i-1].toCharArray();
			for(j=0;j<num[i].length;j++){
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}
		
		for(i=1;i<=bingo.length;i++){	//�P�_�����X�X
			a=0;
			int len = bingo[i-1].length()-1;
			for(j=len;j>=0;j--){
				if(num[i][j]==num[0][j]){
					a++;
				}else{
					break;
				}
			}
			System.out.print("��"+i+"�աA");
			switch(a){
			case 3:
				System.out.println("���T�X�ۦP�A����200��");
				break;
			case 4:
				System.out.println("���|�X�ۦP�A����1000��");
				break;
			case 5:
				System.out.println("�����X�ۦP�A����4000��");
				break;
			case 6:
				System.out.println("�����X�ۦP�A����10000��");
				break;
			case 7:
				System.out.println("���C�X�ۦP�A����40000��");
				break;
			case 8:
				System.out.println("���X�����ۦP�A����200000��");
				break;
			default:
				System.out.println("������");
				break;
			}
		}
	}
}
