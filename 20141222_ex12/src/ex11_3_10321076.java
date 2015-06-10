/*	Author: �����e
 * 	Student ID: 103021076
 * 	Date: 2014/12/22
 * 	Uses: �@�}�C����,�t,�s�A�Ч�X�}�C�s�򤸯��ۭ����̤j��
 *  ex: 	inupt				output
 *  1  -1   5   3  -1  0 =>	-1*5*3*-1=15
 *  Java JDK: 1.8
 */
public class ex11_3_10321076 {
	public static void main(String[] args) {
		int[] data = new int[10];
		rndAry(data);
		showAry(data);
		int i, j, k, mStart=0, mEnd=0, max=0, cal;
		for(i=0;i<data.length;i++){
			for(j=i;j<data.length;j++){
				cal=1;
				for(k=i;k<=j;k++){
					cal*=data[k];
					if(cal>max){
						max=cal;
						mStart = i;
						mEnd = j;
					}
				}
			}
		}
		for(i=mStart;i<=mEnd;i++){
			System.out.print(data[i]+((i==mEnd)?" = ":" * "));
		}
		System.out.println(max);
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
}
