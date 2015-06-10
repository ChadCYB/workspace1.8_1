class Teacher{
	private String id, name, course, college, department;
	Course[] courses;
	public Teacher(String sID, String sName, String sCourse){	//�غc��
		id = sID;	name = sName;	course = sCourse;
		setCollege();
		setDepartment();
		courses = setCourse();
	}
	public void setCollege(){		//��J�ǰ|
		java.util.Scanner scn = new java.util.Scanner(System.in);
		System.out.print("�ǰ|:");
		college = scn.next();
	}
	public void setDepartment(){	//��J�Ǩt
		java.util.Scanner scn = new java.util.Scanner(System.in);
		System.out.print("�Ǩt:");
		department = scn.next();
	}
	public Course[] setCourse(){		//��J�ҵ{
		java.util.Scanner scn = new java.util.Scanner(System.in);
		Course[] courses = new Course[Integer.parseInt(course)];
		for(int i=0; i<Integer.parseInt(course); i++){
			System.out.print("<��"+(i+1)+"���ҵ{>�п�J �ҵ{�s�� �ҵ{�W�� �׽ҤH��:");
			courses[i] = new Course(scn.next(),scn.next(),scn.next());
		}
		return courses;
	}
	public String getID() {return id;}					//¾�s
	public String getName() {return name;}				//�m�W
	public String getCourse() {return course;}			//�½Ҽ�
	public String getCollege() {return college;}		//�ǰ|
	public String getDepartment() {return department;}	//�Ǩt
	public String getCourseID(int i) {return courses[i].getClassID();}			//�ҵ{�s��
	public String getCourseName(int i) {return courses[i].getClassName();}		//�ҵ{�W��
	public String getCourseStudent(int i) {return courses[i].getClassStudent();}//�׽ҤH��

	class Course {	//�������O
		private String classID, className, classStudent;
		public Course(String cID, String cName, String cStudent){
			classID = cID; className = cName; classStudent = cStudent;
		}
		public String getClassID() {return classID;}			//�ҵ{�s��
		public String getClassName() {return className;}		//�ҵ{�W��
		public String getClassStudent() {return classStudent;}	//�׽ҤH��
	}
}