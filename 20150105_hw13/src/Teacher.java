class Teacher{
	private String id, name, course, college, department;
	Course[] courses;
	public Teacher(String sID, String sName, String sCourse){	//建構元
		id = sID;	name = sName;	course = sCourse;
		setCollege();
		setDepartment();
		courses = setCourse();
	}
	public void setCollege(){		//輸入學院
		java.util.Scanner scn = new java.util.Scanner(System.in);
		System.out.print("學院:");
		college = scn.next();
	}
	public void setDepartment(){	//輸入學系
		java.util.Scanner scn = new java.util.Scanner(System.in);
		System.out.print("學系:");
		department = scn.next();
	}
	public Course[] setCourse(){		//輸入課程
		java.util.Scanner scn = new java.util.Scanner(System.in);
		Course[] courses = new Course[Integer.parseInt(course)];
		for(int i=0; i<Integer.parseInt(course); i++){
			System.out.print("<第"+(i+1)+"門課程>請輸入 課程編號 課程名稱 修課人數:");
			courses[i] = new Course(scn.next(),scn.next(),scn.next());
		}
		return courses;
	}
	public String getID() {return id;}					//職編
	public String getName() {return name;}				//姓名
	public String getCourse() {return course;}			//授課數
	public String getCollege() {return college;}		//學院
	public String getDepartment() {return department;}	//學系
	public String getCourseID(int i) {return courses[i].getClassID();}			//課程編號
	public String getCourseName(int i) {return courses[i].getClassName();}		//課程名稱
	public String getCourseStudent(int i) {return courses[i].getClassStudent();}//修課人數

	class Course {	//內部類別
		private String classID, className, classStudent;
		public Course(String cID, String cName, String cStudent){
			classID = cID; className = cName; classStudent = cStudent;
		}
		public String getClassID() {return classID;}			//課程編號
		public String getClassName() {return className;}		//課程名稱
		public String getClassStudent() {return classStudent;}	//修課人數
	}
}