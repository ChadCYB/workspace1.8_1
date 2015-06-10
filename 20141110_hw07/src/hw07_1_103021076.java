/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2014/11/10
 * 	Uses: 統一發票中獎判斷
 * 	Java JDK: 1.8
 */
import java.util.Scanner;
public class hw07_1_103021076 {
	public static void main(String[] arg){
		String[] bingo = {"01272636","39412201","94586356"};
		char[][] num = new char[bingo.length+1][];
		Scanner scn = new Scanner(System.in);
		boolean tt = true;
		while(tt){				//輸入發票判斷迴圈
			System.out.print("請輸入發票號碼(8碼):");
			String str = scn.next();
			num[0]=str.toCharArray();
			if((num[0].length)!=8){
				System.out.println("輸入錯誤");
			}else{
				tt = false;
			}
		}
		
		int i,j,a=0;
		for(i=1;i<=bingo.length;i++){	//bingo陣列資料轉num陣列toCharArray
			num[i]= bingo[i-1].toCharArray();
			for(j=0;j<num[i].length;j++){
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}
		
		for(i=1;i<=bingo.length;i++){	//判斷中獎幾碼
			a=0;
			int len = bingo[i-1].length()-1;
			for(j=len;j>=0;j--){
				if(num[i][j]==num[0][j]){
					a++;
				}else{
					break;
				}
			}
			System.out.print("第"+i+"組，");
			switch(a){
			case 3:
				System.out.println("末三碼相同，獎金200元");
				break;
			case 4:
				System.out.println("末四碼相同，獎金1000元");
				break;
			case 5:
				System.out.println("末五碼相同，獎金4000元");
				break;
			case 6:
				System.out.println("末六碼相同，獎金10000元");
				break;
			case 7:
				System.out.println("末七碼相同，獎金40000元");
				break;
			case 8:
				System.out.println("號碼全部相同，獎金200000元");
				break;
			default:
				System.out.println("未中獎");
				break;
			}
		}
	}
}
