/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2014/12/15
 * 	Uses: 輸入兩個任意多項式，計算兩個多項式的和
 * 	ex: (5X^3+3X^2+2X+6=8),(2X^4+4X^3+0X^2+1X+2=6)相加
 * 	input			output
 * 	5 3 2 6 8		2X^4+9X^3+3X^2+3X+8=14
 * 	2 4 0 1 2 6
 *  Java JDK: 1.8
 */
import java.util.Arrays;
import java.util.Scanner;

public class ex11_5_103021076 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String[] str = new String[2];
		System.out.println("請輸入第一個方程式:");
		str[0] = scn.nextLine();
		System.out.println("請輸入第二個方程式:");
		str[1] = scn.nextLine();
		showArray(DataReverse(null, fuc(str), false));			//答案fuc(str)，反轉回來DataReverse，再輸出showArray
	}
	private static int[] fuc(String[] input){
		String[][] arr = new String[2][];
		arr[0] = DataReverse(input[0].split(" "), null, true);	//第一個方程式(反轉)
		arr[1] = DataReverse(input[1].split(" "), null, true);	//第二個方程式(反轉)
		//System.out.println(Arrays.deepToString(arr));
		System.out.print("\n(");
		showArray(DataReverse((arr[0]), null, true));			//第一個方程式，再反轉回來輸出
		System.out.print(") + \n(");
		showArray(DataReverse((arr[1]), null, true));			//第二個方程式，再反轉回來輸出
		System.out.print(") \n==> ");
		int arr0Len = arr[0].length;							//第一個方程式係數長度
		int arr1Len = arr[1].length;							//第二個方程式係數長度
		int[] arrAns = new int[Math.max(arr0Len,arr1Len)];		//取兩個方程式最大的係數是幾次方
		for(int i=0;i<arrAns.length;i++){						//跑迴圈係數項加
			if(i<arr0Len){										//判斷第一個方程式有沒有超過係數
				arrAns[i] += Integer.parseInt(arr[0][i]);
			}
			if(i<arr1Len){										//判斷第二個方程式有沒有超過係數
				arrAns[i] += Integer.parseInt(arr[1][i]);
			}
		}
		return arrAns;											//回傳加總後的係數
	}
	//陣列資料反轉(Str陣列,Int陣列,模式)
	private static String[] DataReverse(String[] dataStr, int[] dataInt, boolean mode){	
		int dataLen = ((mode)?dataStr.length:dataInt.length);
		String[] outData = new String[dataLen];
		for(int i=0;i<dataLen;i++){
			if(mode){		//模式[true:str/false:int]
				outData[i] = dataStr[dataLen-1-i];						//str陣列反轉
			}else{
				outData[i] = String.valueOf(dataInt[dataLen-1-i]);		//int陣列反轉
			}			
			//System.out.println(i+"->"+outData[i]);
		}
		return outData;		//回傳反轉後的陣列
	}
	
	private static void showArray(String[] data){		//將變數轉換成多項式輸出
		int dataLen = data.length;
		int n = dataLen-2,i;							//n=總長度-等於的值-常數項
		for(i=0;i<dataLen-2;i++){
			if(Integer.parseInt(data[i])!=0){			//排除x=0的項目
				System.out.print(data[i]);
				if(n>1){								//判斷最後x^n次方輸出
					System.out.print("x^"+n+" + ");
				}else if(n==1){							//判斷最後x^1 改成 x
					System.out.print("x + ");
				}
			}
			n--;										//x^n次遞減
		}
		System.out.print(data[i]+" = "+data[i+1]);		//輸出常數項和等於的值
	}
}
