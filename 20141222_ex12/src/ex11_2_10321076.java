/*	Author: �����e
 * 	Student ID: 103021076
 * 	Date: 2014/12/22
 * 	Uses: �g�X��w�ƧǪk(bubble sort)���{��
 *  Java JDK: 1.8
 */
import java.util.Scanner;
public class ex11_2_10321076 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�}�C����:");
		int n = scn.nextInt();
		System.out.print("�п���(1)�ɾ��Ƨ�(2)�����Ƨ�:");
		int mode = scn.nextInt();
		int[] data = new int[n];
		rndAry(data);
		System.out.println("��w�Ƨǫe:");
		showAry(data);
		System.out.println("��w�Ƨǫ�:");
		bubble(data,mode);
		showAry(data);
	}
	private static void bubble(int[] data, int n){
		int i,j,temp;
		for(i=0 ; i<data.length ; i++){
			for(j=0 ;j<(data.length-i-1) ;j++){
				switch(n){
				case 1:
					if( data[j] > data[j+1]){	//�ɾ��Ƨ�
						temp = data[j];
						data[j] = data[j+1];
						data[j+1] = temp;
					}
					break;
				case 2:
					if( data[j] < data[j+1]){	//�����Ƨ�
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
