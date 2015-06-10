/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2015/01/05
 * 	Uses: 設計一個class包含職編、姓名、所屬學院、所屬系所、授課課程，
 * 		    並可以讓主程式輸入資料，使用者可以(1)學院 (2)學系 (特定教師)查詢
 *  Java JDK: 1.8
 */
public class hw13_103021076 {
	public static void main(String[] avg){
		int sNum = 5, i;
		boolean tt=true;
		Teacher[] teachers = new Teacher[sNum];	//建立物件陣列
		java.util.Scanner scn = new java.util.Scanner(System.in);
		for(i=0;i<sNum;i++){
			System.out.print("請輸入 職編 姓名 授課數:");
			teachers[i] = new Teacher(scn.next(),scn.next(),scn.next()); //建構元建構出來
		}
		while(tt){
			System.out.println("==========================================================");
			System.out.println("請輸入要查詢的項目(1)學院教師 (2)學系教師 (3)特定教師資訊:");
			String searchWord;
			switch(scn.nextInt()){
			case 1:	//學院教師
				System.out.print("請輸入要查詢的學院:");
				searchWord = scn.next();
				for(i=0;i<sNum;i++){
					if(teachers[i].getCollege().equals(searchWord)){
						showTeachers(teachers,i);
					}
				}
				break;
			case 2:	//學系教師
				System.out.print("請輸入要查詢的學系:");
				searchWord = scn.next();
				for(i=0;i<sNum;i++){
					if(teachers[i].getDepartment().equals(searchWord)){
						showTeachers(teachers,i);
					}
				}
				break;
			case 3:	//特定教師資訊
				System.out.print("請輸入要查詢的教師姓名:");
				searchWord = scn.next();
				for(i=0;i<sNum;i++){
					if(teachers[i].getName().equals(searchWord)){
						showTeachers(teachers,i);
						break;
					}
				}
				break;
			}
			System.out.print("請問是否繼續(y/n):");
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
		System.out.println("課程編號\t課程名稱\t修課人數");
		for(int j=0 ; j<Integer.parseInt(teachers[i].getCourse()) ; j++){
			System.out.println(teachers[i].getCourseID(j)+"\t"
							+teachers[i].getCourseName(j)+"\t"
							+teachers[i].getCourseStudent(j));
		}
	}
}
