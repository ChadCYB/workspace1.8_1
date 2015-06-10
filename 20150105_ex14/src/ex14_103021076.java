/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2015/01/05
 * 	Uses: 設計一個class包含學號、姓名、國、英、數成績，並可以讓主程式輸入資料並由成績高低輸出
 *  Java JDK: 1.8
 */
public class ex14_103021076 {
	public static void main(String[] avg){
		int sNum = 5, i, j;
		Student[] students = new Student[sNum];	//建立物件陣列
		java.util.Scanner scn = new java.util.Scanner(System.in);
		for(i=0;i<sNum;i++){
			System.out.print("請輸入 學生ID 姓名:");
			students[i] = new Student(scn.next(),scn.next()); //建構元建構出來
		}
		Student tempStud; 		//創一個temp物件(排序交換時需要)
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
		for(i=0;i<3;i++){	//單科目加總
			for(j=0;j<sNum;j++){
				sumScore[i] += students[j].getScore(i);
			}
		}
		for(i=0;i<3;i++){	//單科平均
			sumScore[i] /= sNum;
		}
		System.out.println("學號\t姓名\t國文\t英文\t數學\t平均成績");
		System.out.println("============================================");
		for(i=0;i<sNum;i++){	//輸出資料
			System.out.println(students[i].getID()+"\t"
							+students[i].getName()+"\t"
							+students[i].getScore(0)+"\t"
							+students[i].getScore(1)+"\t"
							+students[i].getScore(2)+"\t"
							+students[i].getAvg());
		}
		System.out.println("============================================");
		System.out.print("各科平均:\t\t");
		for(i=0;i<3;i++){
			System.out.print((Math.round(sumScore[i]*100.0)/100f)+"\t");
		}
	}
}
class Student{
	private String id, name;
	int[] score = new int[3];
	public Student(String sID, String sName){	//建構元
		id = sID;	name = sName;
		setScore();
	}
	public void setScore(){
		java.util.Scanner scn = new java.util.Scanner(System.in);
		System.out.print("請輸入成績 國文 英文 數學:");
		score[0] = scn.nextInt();	//國文
		score[1] = scn.nextInt();	//英文
		score[2] = scn.nextInt();	//數學
	}
	public float getAvg(){
		float avg = (score[0]+score[1]+score[2])/3f;
		return Math.round(avg*100.0)/100f;	//四捨五入到小數點第2位
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
