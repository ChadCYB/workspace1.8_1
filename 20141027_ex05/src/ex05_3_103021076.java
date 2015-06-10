/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2014/10/27
 * 	Uses: 輸入生日，輸出星座
 * 	Java JDK: 1.8
 */
import java.util.Scanner;
public class ex05_3_103021076 {
	public static void main(String[] args){
		int date,mm,dd;
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入生日(ex0531):");
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
				str="輸入錯誤";
			}else{
				str=(dd<21)?"魔羯座":"水瓶座";
			}
			break;
		case 2:
			if(dd>29){
				str="輸入錯誤";
			}else{
				str=(dd<20)?"水瓶座":"雙魚座";
			}			
			break;
		case 3:
			if(dd>31){
				str="輸入錯誤";
			}else{
				str=(dd<21)?"雙魚座":"白羊座";
			}			
			break;
		case 4:
			if(dd>30){
				str="輸入錯誤";
			}else{
				str=(dd<20)?"白羊座":"金牛座";
			}			
			break;
		case 5:
			if(dd>31){
				str="輸入錯誤";
			}else{
				str=(dd<21)?"金牛座":"雙子座";
			}			
			break;
		case 6:
			if(dd>30){
				str="輸入錯誤";
			}else{
				str=(dd<22)?"雙子座":"巨蟹座";
			}
			break;
		case 7:
			if(dd>31){
				str="輸入錯誤";
			}else{
				str=(dd<23)?"巨蟹座":"獅子座";
			}	
			break;
		case 8:
			if(dd>31){
				str="輸入錯誤";
			}else{
				str=(dd<23)?"獅子座":"處女座";
			}	
			break;
		case 9:
			if(dd>30){
				str="輸入錯誤";
			}else{
				str=(dd<23)?"處女座":"天秤座";
			}
			break;
		case 10:
			if(dd>31){
				str="輸入錯誤";
			}else{
				str=(dd<24)?"天秤座":"天蠍座";
			}
			break;
		case 11:
			if(dd>30){
				str="輸入錯誤";
			}else{
				str=(dd<22)?"天蠍座":"射手座";
			}
			break;
		case 12:
			if(dd>31){
				str="輸入錯誤";
			}else{
				str=(dd<21)?"射手座":"魔羯座";
			}
				break;
		default:
			str="輸入錯誤";
			break;
		}
		return str;
	}
}
/*
白羊座　　3月21日　～　4月19日　  （又叫牡羊座）

金牛座　　4月20日　～　5月20日

雙子座　　5月21日　～　6月21日　

巨蟹座　　6月22日　～　7月22日

獅子座　　7月23日　～　8月22日

處女座　　8月23日　～　9月22日

天秤座　　9月23日　～　10月23日

天蠍座　　10月24日  ～　11月21日

射手座　　11月22日  ～　12月20日　（又叫人馬座）

魔羯座　　12月21日  ～　1月20日　  （又叫山羊座）

水瓶座　　1月21日    ～　2月19日　  （又叫寶瓶座）

雙魚座　　 2月20日   ～　3月20日
*/
