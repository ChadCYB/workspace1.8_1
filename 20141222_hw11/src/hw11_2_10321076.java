/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2014/12/22
 * 	Uses: 寫出快速排序法(quick sort)的程式
 *  Java JDK: 1.8
 */
import java.util.Scanner;
public class hw11_2_10321076 {
	static int mode = 0;
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入陣列長度:");
		int n = scn.nextInt();
		System.out.print("請輸選擇(1)升冪排序(2)降冪排序:");
		mode = scn.nextInt();
		int[] data = new int[n];
		rndAry(data);
		System.out.println("排序前:");
		showAry(data);
		quick(data,0,data.length-1);
		System.out.println("排序後:");
		showAry(data);
	}
	private static void rndAry(int[] arr){
		for(int i=0;i<arr.length;i++){
			arr[i] = (int)(Math.random()*100)+1;
		}
	}
	private static void showAry(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+((i==arr.length-1)?"\n":"\t"));
		}
	}
	private static void quick(int[] data, int left, int right){
		if(left < right){
			int i,j,pivot,temp;
			pivot = data[(left+right)/2];
			//System.out.println("pivot:"+pivot+"/"+(left+right)/2+"\t left:"+left+"\t right:"+right);
			i = left - 1;
			j = right + 1;
			while(true){
				switch(mode){
				case 1:		//升冪排序
					while(data[++i] < pivot);	//左區向右找
					while(data[--j] > pivot);	//右區向左找
					break;
				case 2:		//降冪排序
					while(data[++i] > pivot);	//左區向右找
					while(data[--j] < pivot);	//右區向左找
					break;
				}
				if(i >= j) break;
				temp = data[i];
				data[i] = data[j];
				data[j] = temp;
				//showAry(data);
			}
			quick(data, left, (i-1));
			quick(data, (j+1), right);
		}
	}
}