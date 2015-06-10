/*	Author: �����e
 * 	Student ID: 103021076
 * 	Date: 2014/12/29
 * 	Uses: �U�~��{���A�ϥΪ̿�J�~���Τ���A��X�Ӥ�����
 *  Java JDK: 1.8
 */
import java.util.Scanner;
import java.util.Calendar;
public class hw12_1_103021076_1{
	public static void main(String[] avg){
		Scanner scn = new Scanner(System.in);
		Calendar rightNow = Calendar.getInstance(); /* ���� ��䤸�� */
		int year,month;
		System.out.print("�п�J�@�~��(�褸):");
		year = scn.nextInt();
		System.out.print("�п�J�@���:");
		month = scn.nextInt();
		rightNow.set(year, month-1, 1);		//year,month,date
		showCalendar(rightNow.get(Calendar.DAY_OF_WEEK)-1,getDay(rightNow));
	}
	private static void showCalendar(int startWeek, int day){	//��ܤ��
		String[] week = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		int i=0;
		while(i<week.length)	System.out.print(week[i++]+"\t");
		System.out.println();
		i=1;
		while(i++<=startWeek%7)	System.out.print("\t");
		for(i=1;i<=day;i++){
			System.out.print(i+"\t");
			if(++startWeek%7 == 0)	System.out.println();
		}
	}
	private static int getDay(Calendar right){	//�^�Ǩ��@�~�������X��
		if (right.MONTH == 11){					/* �p��@�Ӥ릳�X�� */
			right.add(Calendar.YEAR, 1);
			right.set(Calendar.MONTH, 0);
		}else{
			right.add(Calendar.MONTH, 1);
		}
		right.add(Calendar.DATE, -1);
		return right.get(Calendar.DATE);
	}
}
