/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2014/12/22
 * 	Uses: 寫出插入排序法(insertion sort)的程式
 *  Java JDK: 1.8
 */
import java.util.Scanner;
public class hw11_1_10321076 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入陣列長度:");
		int n = scn.nextInt();
		System.out.print("請輸選擇(1)升冪排序(2)降冪排序:");
		int mode = scn.nextInt();
		int[] data = new int[n];
		rndAry(data);
		System.out.println("排序前:");
		showAry(data);
		insertion(data,mode);
		System.out.println("排序後:");
		showAry(data);
	}
	private static void rndAry(int[] arr){
		for(int i=0;i<arr.length;i++){
			arr[i] = (int)(Math.random()*10)-5;
		}
	}
	private static void showAry(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+((i==arr.length-1)?"\n":"\t"));
		}
	}
	private static void insertion(int[] data, int n){
		int i,j,temp;
		switch(n){
		case 1:
			for(i=0; i<data.length; i++){
				temp = data[i];
				for(j=i-1; j>=0; j--){
					if(data[j]>temp){	//升冪排序
						data[j+1] = data[j];
					}else{
						break;
					}
				}
				data[j+1] = temp;
			}
			break;
		case 2:
			for(i=0; i<data.length; i++){
				temp = data[i];
				for(j=i-1; j>=0; j--){
					if(data[j]<temp){	//降冪排序
						data[j+1] = data[j];
					}else{
						break;
					}
				}
				data[j+1] = temp;
			}
			break;
		}
		
	}
}