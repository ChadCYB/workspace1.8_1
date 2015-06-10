/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2014/12/22
 * 	Uses: 寫出氣泡排序法(bubble sort)的程式
 *  Java JDK: 1.8
 */
import java.util.Scanner;
public class ex11_2_10321076 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入陣列長度:");
		int n = scn.nextInt();
		System.out.print("請輸選擇(1)升冪排序(2)降冪排序:");
		int mode = scn.nextInt();
		int[] data = new int[n];
		rndAry(data);
		System.out.println("氣泡排序前:");
		showAry(data);
		System.out.println("氣泡排序後:");
		bubble(data,mode);
		showAry(data);
	}
	private static void bubble(int[] data, int n){
		int i,j,temp;
		for(i=0 ; i<data.length ; i++){
			for(j=0 ;j<(data.length-i-1) ;j++){
				switch(n){
				case 1:
					if( data[j] > data[j+1]){	//升冪排序
						temp = data[j];
						data[j] = data[j+1];
						data[j+1] = temp;
					}
					break;
				case 2:
					if( data[j] < data[j+1]){	//降冪排序
						temp = data[j];
						data[j] = data[j+1];
						data[j+1] = temp;
					}
					break;
				}
			}
		}
	}
	private static void rndAry(int[] arr){
		for(int i=0;i<arr.length;i++){
			arr[i] = (int)(Math.random()*10)+1;
		}
	}
	private static void showAry(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+((i==arr.length-1)?"\n":"\t"));
		}
	}
}
