/*	Author: �����e
 * 	Student ID: 103021076
 * 	Date: 2015/01/12
 * 	Uses: ����n��0~m���üƤ�������
 *  Java JDK: 1.6
 */
public class ex15_2_103021076 {
	public static void main(String[] args) {
		java.util.Scanner scn = new java.util.Scanner(System.in);
		System.out.println("����n��0~m���ü�");
		System.out.print("�п�Jn:");
		int n = scn.nextInt();
		System.out.print("�п�Jm:");
		int m = scn.nextInt();
		System.out.println("\n������"+myrand(n,m));
	}
	public static double myrand(int n, int m){
		int sum=0,rand,i;
		for(i=0;i<n;i++){
			rand = (int)(Math.random()*m);	//�üƲ���
			sum += rand;					//�üƥ[�`
			System.out.print(rand+"\t");
		}
		double avg = sum/(n+0.0);			//�p�⥭��
		return avg;							//�^�ǥ�����
	}
}
