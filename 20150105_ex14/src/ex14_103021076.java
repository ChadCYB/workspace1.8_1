/*	Author: �����e
 * 	Student ID: 103021076
 * 	Date: 2015/01/05
 * 	Uses: �]�p�@��class�]�t�Ǹ��B�m�W�B��B�^�B�Ʀ��Z�A�åi�H���D�{����J��ƨåѦ��Z���C��X
 *  Java JDK: 1.8
 */
public class ex14_103021076 {
	public static void main(String[] avg){
		int sNum = 5, i, j;
		Student[] students = new Student[sNum];	//�إߪ���}�C
		java.util.Scanner scn = new java.util.Scanner(System.in);
		for(i=0;i<sNum;i++){
			System.out.print("�п�J �ǥ�ID �m�W:");
			students[i] = new Student(scn.next(),scn.next()); //�غc���غc�X��
		}
		Student tempStud; 		//�Ф@��temp����(�Ƨǥ洫�ɻݭn)
		for(i=0;i<sNum;i++){	//bubble sort
			for(j=i+1;j<sNum;j++){
				if(students[i].getAvg() < students[j].getAvg()){
					tempStud = students[i];
					students[i] = students[j];
					students[j] = tempStud;
				}
			}
		}
		float[] sumScore = {0,0,0};
		for(i=0;i<3;i++){	//���إ[�`
			for(j=0;j<sNum;j++){
				sumScore[i] += students[j].getScore(i);
			}
		}
		for(i=0;i<3;i++){	//��쥭��
			sumScore[i] /= sNum;
		}
		System.out.println("�Ǹ�\t�m�W\t���\t�^��\t�ƾ�\t�������Z");
		System.out.println("============================================");
		for(i=0;i<sNum;i++){	//��X���
			System.out.println(students[i].getID()+"\t"
							+students[i].getName()+"\t"
							+students[i].getScore(0)+"\t"
							+students[i].getScore(1)+"\t"
							+students[i].getScore(2)+"\t"
							+students[i].getAvg());
		}
		System.out.println("============================================");
		System.out.print("�U�쥭��:\t\t");
		for(i=0;i<3;i++){
			System.out.print((Math.round(sumScore[i]*100.0)/100f)+"\t");
		}
	}
}
class Student{
	private String id, name;
	int[] score = new int[3];
	public Student(String sID, String sName){	//�غc��
		id = sID;	name = sName;
		setScore();
	}
	public void setScore(){
		java.util.Scanner scn = new java.util.Scanner(System.in);
		System.out.print("�п�J���Z ��� �^�� �ƾ�:");
		score[0] = scn.nextInt();	//���
		score[1] = scn.nextInt();	//�^��
		score[2] = scn.nextInt();	//�ƾ�
	}
	public float getAvg(){
		float avg = (score[0]+score[1]+score[2])/3f;
		return Math.round(avg*100.0)/100f;	//�|�ˤ��J��p���I��2��
	}
	public String getID(){
		return id;
	}
	public String getName(){
		return name;
	}
	public int getScore(int i){
		return score[i];
	}
}
