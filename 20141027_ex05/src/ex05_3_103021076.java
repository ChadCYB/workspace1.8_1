/*	Author: �����e
 * 	Student ID: 103021076
 * 	Date: 2014/10/27
 * 	Uses: ��J�ͤ�A��X�P�y
 * 	Java JDK: 1.8
 */
import java.util.Scanner;
public class ex05_3_103021076 {
	public static void main(String[] args){
		int date,mm,dd;
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�ͤ�(ex0531):");
		date = scn.nextInt();
		System.out.print(fuc(date));		
	}
	static String fuc(int date){
		int mm = date/100;
		int dd = date%100;
		String str="";
		switch(mm){
		case 1:
			if(dd>31){
				str="��J���~";
			}else{
				str=(dd<21)?"�]�~�y":"���~�y";
			}
			break;
		case 2:
			if(dd>29){
				str="��J���~";
			}else{
				str=(dd<20)?"���~�y":"�����y";
			}			
			break;
		case 3:
			if(dd>31){
				str="��J���~";
			}else{
				str=(dd<21)?"�����y":"�զϮy";
			}			
			break;
		case 4:
			if(dd>30){
				str="��J���~";
			}else{
				str=(dd<20)?"�զϮy":"�����y";
			}			
			break;
		case 5:
			if(dd>31){
				str="��J���~";
			}else{
				str=(dd<21)?"�����y":"���l�y";
			}			
			break;
		case 6:
			if(dd>30){
				str="��J���~";
			}else{
				str=(dd<22)?"���l�y":"���ɮy";
			}
			break;
		case 7:
			if(dd>31){
				str="��J���~";
			}else{
				str=(dd<23)?"���ɮy":"��l�y";
			}	
			break;
		case 8:
			if(dd>31){
				str="��J���~";
			}else{
				str=(dd<23)?"��l�y":"�B�k�y";
			}	
			break;
		case 9:
			if(dd>30){
				str="��J���~";
			}else{
				str=(dd<23)?"�B�k�y":"�ѯ��y";
			}
			break;
		case 10:
			if(dd>31){
				str="��J���~";
			}else{
				str=(dd<24)?"�ѯ��y":"���Ȯy";
			}
			break;
		case 11:
			if(dd>30){
				str="��J���~";
			}else{
				str=(dd<22)?"���Ȯy":"�g��y";
			}
			break;
		case 12:
			if(dd>31){
				str="��J���~";
			}else{
				str=(dd<21)?"�g��y":"�]�~�y";
			}
				break;
		default:
			str="��J���~";
			break;
		}
		return str;
	}
}
/*
�զϮy�@�@3��21��@��@4��19��@  �]�S�s�d�Ϯy�^

�����y�@�@4��20��@��@5��20��

���l�y�@�@5��21��@��@6��21��@

���ɮy�@�@6��22��@��@7��22��

��l�y�@�@7��23��@��@8��22��

�B�k�y�@�@8��23��@��@9��22��

�ѯ��y�@�@9��23��@��@10��23��

���Ȯy�@�@10��24��  ��@11��21��

�g��y�@�@11��22��  ��@12��20��@�]�S�s�H���y�^

�]�~�y�@�@12��21��  ��@1��20��@  �]�S�s�s�Ϯy�^

���~�y�@�@1��21��    ��@2��19��@  �]�S�s�_�~�y�^

�����y�@�@ 2��20��   ��@3��20��
*/
