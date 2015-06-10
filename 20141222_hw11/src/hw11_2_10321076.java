/*	Author: �����e
 * 	Student ID: 103021076
 * 	Date: 2014/12/22
 * 	Uses: �g�X�ֳt�ƧǪk(quick sort)���{��
 *  Java JDK: 1.8
 */
import java.util.Scanner;
public class hw11_2_10321076 {
	static int mode = 0;
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�}�C����:");
		int n = scn.nextInt();
		System.out.print("�п���(1)�ɾ��Ƨ�(2)�����Ƨ�:");
		mode = scn.nextInt();
		int[] data = new int[n];
		rndAry(data);
		System.out.println("�Ƨǫe:");
		showAry(data);
		quick(data,0,data.length-1);
		System.out.println("�Ƨǫ�:");
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
				case 1:		//�ɾ��Ƨ�
					while(data[++i] < pivot);	//���ϦV�k��
					while(data[--j] > pivot);	//�k�ϦV����
					break;
				case 2:		//�����Ƨ�
					while(data[++i] > pivot);	//���ϦV�k��
					while(data[--j] < pivot);	//�k�ϦV����
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