/*	Author: �����e
 * 	Student ID: 103021076
 * 	Date: 2014/12/15
 * 	Uses: ISBN�ˬd�{��
 *  �ѽX����   1 2 3 4 5 6 7 8 9 10
 *  ���W����10 9 8 7 6 5 4 3 2 1
 *  �[�`��Q"11"�㰣�����TISBN
 *  Java JDK: 1.6
 */
import java.util.Scanner;

public class ex11_4_103021076 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�JISBN:");
		String str = scn.next();
		System.out.println(str + (judge(str)?"�����T�s��":"���O���T�s��"));
	}
	
	private static boolean judge(String input){
		input = input.replaceAll("-", "");
		//System.out.println(input);
		int strLen = input.length(), sum=0, i, j=10, num;
		for(i=0;i<strLen;i++){
			num = Integer.parseInt(input.substring(i, i+1));	//�r���ഫInt
			sum += num*j;										//�[�`
			j--;
		}
		if(sum%11==0){	//ISBN �P�_
			return true;
		}else{
			return false;
		}
	}
}
