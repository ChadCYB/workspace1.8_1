/*	Author: �����e
 * 	Student ID: 103021076
 * 	Date: 2014/12/08
 * 	Uses: ��X1�� N �����
 * 	Java JDK: 1.8
 */
import java.util.Scanner;
public class hw09_4_103021076{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num=2,count=0,n;
		System.out.print("�п�Jn:");
		n = scn.nextInt();
		while(num<n){
			if(judge(num)){						//�ݦ^�ǭȧP�_�O�_�����
				System.out.print(num+"\t");
				count++;
				if(count%5==0)System.out.println();
			}
			
			num++;
		}
	}
	static boolean judge(int inNum){
		for(int m=2;m<(inNum);m++){
			if(inNum%m == 0)return false;		//�Y�l�Ƭ��s�A�h�����
		}
	return true;	//�]��for�j��]���S���l�Ƭ��s���A�G����ơA�ҥH�^�ǭ�0���D�{��
	}
}
