/*	Author: �����e
 * 	Student ID: 103021076
 * 	Date: 2014/12/29
 * 	Uses: �U�~��{���A�ϥΪ̿�J�~���Τ���A��X�Ӥ�����
 *  Java JDK: 1.8
 */
import java.util.Scanner;
public class hw12_1_103021076{
	public static void main(String[] avg){
		Scanner scn = new Scanner(System.in);
		int year,month;
		System.out.print("�п�J�@�~��(�褸):");
		year = scn.nextInt();
		System.out.print("�п�J�@���:");
		month = scn.nextInt();
		showCalendar(getFirstWeek(year,month),getDay(year,month));
	}
	
	private static void showCalendar(int startWeek, int day){	//��ܤ��
		String[] week = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		int i;
		for(i=0;i<week.length;i++){
			System.out.print(week[i]+"\t");
		}
		System.out.println();
		i=1;
		while(i++<=startWeek)	System.out.print("\t");
		for(i=1;i<=day;i++){
			System.out.print(i+"\t");
			if(++startWeek%7 == 0)	System.out.println();
		}
	}
	private static int countLeap(int year){		//�p��ۦ褸1�~�w�g���X�Ӷ|�~
		int count=0,i;
		for(i=1;i<year;i++){
			if(leap(i)) count++;
		}
		return count;
	}
	private static boolean leap(int year){		//�^�Ƿ�~�O�_�^�|�~
		return (year%4==0&&year%100!=0||year%400==0)?true:false;
	}
	private static int getFirstWeek(int year,int month){	//�^�Ƿ�몺�Ĥ@�ѬO�P���X
		int sum=0,i=1,week,startWeek;
		while(i<month)	sum += getDay(year,i++);		//�`�M���@�~�����e�@���X��
		startWeek = ((365*year)+countLeap(year))%7;		//�p���~��1/1�O�P���X
		week = (sum%7+startWeek)%7;						//�p���몺�Ĥ@�ѬO�P���X
		//System.out.println("week:"+week+"\tstart:"+startWeek+"\tsum:"+sum);	//<<<
		return week;
	}
	private static int getDay(int year,int month){	//�^�Ǩ��@�~�������X��
		int day=30;
		switch(month){
		case 1:
			day=31;
			break;
		case 2:
			day=(leap(year)?29:28);
			break;
		case 3:
			day=31;
			break;
		case 4:
			day=30;
			break;
		case 5:
			day=31;
			break;
		case 6:
			day=30;
			break;
		case 7:
			day=31;
			break;
		case 8:
			day=31;
			break;
		case 9:
			day=30;
			break;
		case 10:
			day=31;
			break;
		case 11:
			day=30;
			break;
		case 12:
			day=31;
			break;
		}
		return day;
	}
}