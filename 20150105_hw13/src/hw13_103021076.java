/*	Author: �����e
 * 	Student ID: 103021076
 * 	Date: 2015/01/05
 * 	Uses: �]�p�@��class�]�t¾�s�B�m�W�B���ݾǰ|�B���ݨt�ҡB�½ҽҵ{�A
 * 		    �åi�H���D�{����J��ơA�ϥΪ̥i�H(1)�ǰ| (2)�Ǩt (�S�w�Юv)�d��
 *  Java JDK: 1.8
 */
public class hw13_103021076 {
	public static void main(String[] avg){
		int sNum = 5, i;
		boolean tt=true;
		Teacher[] teachers = new Teacher[sNum];	//�إߪ���}�C
		java.util.Scanner scn = new java.util.Scanner(System.in);
		for(i=0;i<sNum;i++){
			System.out.print("�п�J ¾�s �m�W �½Ҽ�:");
			teachers[i] = new Teacher(scn.next(),scn.next(),scn.next()); //�غc���غc�X��
		}
		while(tt){
			System.out.println("==========================================================");
			System.out.println("�п�J�n�d�ߪ�����(1)�ǰ|�Юv (2)�Ǩt�Юv (3)�S�w�Юv��T:");
			String searchWord;
			switch(scn.nextInt()){
			case 1:	//�ǰ|�Юv
				System.out.print("�п�J�n�d�ߪ��ǰ|:");
				searchWord = scn.next();
				for(i=0;i<sNum;i++){
					if(teachers[i].getCollege().equals(searchWord)){
						showTeachers(teachers,i);
					}
				}
				break;
			case 2:	//�Ǩt�Юv
				System.out.print("�п�J�n�d�ߪ��Ǩt:");
				searchWord = scn.next();
				for(i=0;i<sNum;i++){
					if(teachers[i].getDepartment().equals(searchWord)){
						showTeachers(teachers,i);
					}
				}
				break;
			case 3:	//�S�w�Юv��T
				System.out.print("�п�J�n�d�ߪ��Юv�m�W:");
				searchWord = scn.next();
				for(i=0;i<sNum;i++){
					if(teachers[i].getName().equals(searchWord)){
						showTeachers(teachers,i);
						break;
					}
				}
				break;
			}
			System.out.print("�аݬO�_�~��(y/n):");
			tt = (scn.next().equals("y"))?true:false;
		}
	}
	public static void showTeachers(Teacher[] teachers,int i){
		System.out.println("============================================");
		System.out.println("ID: "+teachers[i].getID());
		System.out.println("Name: "+teachers[i].getName());
		System.out.println("College: "+teachers[i].getCollege());
		System.out.println("Department: "+teachers[i].getDepartment());
		System.out.println("--------------------------------------------");
		System.out.println("�ҵ{�s��\t�ҵ{�W��\t�׽ҤH��");
		for(int j=0 ; j<Integer.parseInt(teachers[i].getCourse()) ; j++){
			System.out.println(teachers[i].getCourseID(j)+"\t"
							+teachers[i].getCourseName(j)+"\t"
							+teachers[i].getCourseStudent(j));
		}
	}
}
