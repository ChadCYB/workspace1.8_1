/*	Author: �����e
 * 	Student ID: 103021076
 * 	Date: 2014/12/15
 * 	Uses: ��J��ӥ��N�h�����A�p���Ӧh�������M
 * 	ex: (5X^3+3X^2+2X+6=8),(2X^4+4X^3+0X^2+1X+2=6)�ۥ[
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
		System.out.println("�п�J�Ĥ@�Ӥ�{��:");
		str[0] = scn.nextLine();
		System.out.println("�п�J�ĤG�Ӥ�{��:");
		str[1] = scn.nextLine();
		showArray(DataReverse(null, fuc(str), false));			//����fuc(str)�A����^��DataReverse�A�A��XshowArray
	}
	private static int[] fuc(String[] input){
		String[][] arr = new String[2][];
		arr[0] = DataReverse(input[0].split(" "), null, true);	//�Ĥ@�Ӥ�{��(����)
		arr[1] = DataReverse(input[1].split(" "), null, true);	//�ĤG�Ӥ�{��(����)
		//System.out.println(Arrays.deepToString(arr));
		System.out.print("\n(");
		showArray(DataReverse((arr[0]), null, true));			//�Ĥ@�Ӥ�{���A�A����^�ӿ�X
		System.out.print(") + \n(");
		showArray(DataReverse((arr[1]), null, true));			//�ĤG�Ӥ�{���A�A����^�ӿ�X
		System.out.print(") \n==> ");
		int arr0Len = arr[0].length;							//�Ĥ@�Ӥ�{���Y�ƪ���
		int arr1Len = arr[1].length;							//�ĤG�Ӥ�{���Y�ƪ���
		int[] arrAns = new int[Math.max(arr0Len,arr1Len)];		//����Ӥ�{���̤j���Y�ƬO�X����
		for(int i=0;i<arrAns.length;i++){						//�]�j��Y�ƶ��[
			if(i<arr0Len){										//�P�_�Ĥ@�Ӥ�{�����S���W�L�Y��
				arrAns[i] += Integer.parseInt(arr[0][i]);
			}
			if(i<arr1Len){										//�P�_�ĤG�Ӥ�{�����S���W�L�Y��
				arrAns[i] += Integer.parseInt(arr[1][i]);
			}
		}
		return arrAns;											//�^�ǥ[�`�᪺�Y��
	}
	//�}�C��Ƥ���(Str�}�C,Int�}�C,�Ҧ�)
	private static String[] DataReverse(String[] dataStr, int[] dataInt, boolean mode){	
		int dataLen = ((mode)?dataStr.length:dataInt.length);
		String[] outData = new String[dataLen];
		for(int i=0;i<dataLen;i++){
			if(mode){		//�Ҧ�[true:str/false:int]
				outData[i] = dataStr[dataLen-1-i];						//str�}�C����
			}else{
				outData[i] = String.valueOf(dataInt[dataLen-1-i]);		//int�}�C����
			}			
			//System.out.println(i+"->"+outData[i]);
		}
		return outData;		//�^�Ǥ���᪺�}�C
	}
	
	private static void showArray(String[] data){		//�N�ܼ��ഫ���h������X
		int dataLen = data.length;
		int n = dataLen-2,i;							//n=�`����-���󪺭�-�`�ƶ�
		for(i=0;i<dataLen-2;i++){
			if(Integer.parseInt(data[i])!=0){			//�ư�x=0������
				System.out.print(data[i]);
				if(n>1){								//�P�_�̫�x^n�����X
					System.out.print("x^"+n+" + ");
				}else if(n==1){							//�P�_�̫�x^1 �令 x
					System.out.print("x + ");
				}
			}
			n--;										//x^n������
		}
		System.out.print(data[i]+" = "+data[i+1]);		//��X�`�ƶ��M���󪺭�
	}
}
