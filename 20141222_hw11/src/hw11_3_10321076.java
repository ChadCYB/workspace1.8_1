/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2014/12/22
 * 	Uses: 寫出合併排序法(merge sort)的程式
 *  Java JDK: 1.8
 */
import java.util.Scanner;
public class hw11_3_10321076 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入陣列長度:");
		int n = scn.nextInt();
		System.out.print("請輸選擇(1)升冪排序(2)降冪排序:");
		int mode = scn.nextInt();
		int[] dataA = new int[n];
		int[] dataB = new int[n];
		rndAry(dataA); bubble(dataA,mode);
		rndAry(dataB); bubble(dataB,mode);
		System.out.println("排序前:");
		showAry(dataA); showAry(dataB);
		System.out.println("排序後:");
		showAry(merge(dataA,dataB,mode));
	}
	private static int[] merge(int[] dataA, int[] dataB, int n){
		int[] dataC = new int[dataA.length+dataB.length];
		int i=0, j=0, c=0;
		while(i<dataA.length && j<dataB.length){
			switch(n){
			case 1:
				if(dataA[i]<=dataB[j]){
					dataC[c++] = dataA[i++];
				}else{
					dataC[c++] = dataB[j++];
				}
				break;
			case 2:
				if(dataA[i]>=dataB[j]){
					dataC[c++] = dataA[i++];
				}else{
					dataC[c++] = dataB[j++];
				}
				break;
			}
		}
		while(i<dataA.length){
			dataC[c++] = dataA[i++];
		}
		while(j<dataB.length){
			dataC[c++] = dataB[j++];
		}
		return dataC;
	}
	private static void rndAry(int[] arr){
		for(int i=0;i<arr.length;i++){
			arr[i] = (int)(Math.random()*20)-10;
		}
	}
	private static void showAry(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+((i==arr.length-1)?"\n":"\t"));
		}
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
}