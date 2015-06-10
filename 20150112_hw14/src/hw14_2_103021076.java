/*	Author: �����e
 * 	Student ID: 103021076
 * 	Date: 2015/01/12
 * 	Uses: n�Ӥ������}�Cx[n]�Ax[0]+...+x[i]���e�q�M�Ax[j]+...+x[n-1]����q�M�A��X���X�իe�q�M�P��q�M�ۦP
 *  ex:
 *   5 9 8 0 2 3 7 5 9 1 
 *   5+9+8=22		5+9+8+0=22		5+9+8+0+2+3=27			5+9+8+0+2+3=27		5+9+8+0+2+3+7+5+9+1=49
 *	 7+5+9+1=22		7+5+9+1=22		0+2+3+7+5+9+1=27		2+3+7+5+9+1=27		5+9+8+0+2+3+7+5+9+1=49
 *  Java JDK: 1.8
 */
public class hw14_2_103021076 {
	public static void main(String[] args) {
		java.util.Scanner scn = new java.util.Scanner(System.in);
		System.out.println("��J�X�Ӥ����An:");
		int n = scn.nextInt();
		int[] x = new int[n];	int[] sumA = new int[n];	int[] sumB = new int[n];
		int i,j,start,end;
		for(i=0;i<n;i++){
			x[i]= (int) (Math.random()*10);
			System.out.print(x[i]+" ");
		}
		System.out.println("\n====================");
		for(start=0;start<n;start++){	//�p��n�[�`�ܲĴX��
			i = 0;
			while(i<=start) sumA[start] += x[i++];	//�e�q�M(0 ~ start)
			end = n-1-start;			//�p��n�[�`�ܭ˼ƲĴX��
			j = end;
			while(j<n) sumB[end] += x[j++];	//��q�M(end ~ n-1)
		}
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				if(sumA[i] == sumB[j]){		//�p�G���@��
					showAB(x,i,j,sumA[i]);	//�I�s���show�X��
					System.out.println("---------------------");
				}
			}
		}
	}
	public static void showAB(int[] x,int a,int b,int sum){
		int i,j;
		for(i=0;i<a;i++){
			System.out.print(x[i]+"+");
		}
		System.out.println(x[i]+"="+sum);
		for(j=b;j<x.length-1;j++){
			System.out.print(x[j]+"+");
		}
		System.out.println(x[j]+"="+sum);
	}
}