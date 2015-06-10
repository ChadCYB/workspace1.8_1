/*	Author: �����e
 * 	Student ID: 103021076
 * 	Date: 2015/01/12
 * 	Uses: Class�m��(�������O)
 *  Java JDK: 1.6
 */
public class ex15_1_103021076 {
	public static void main(String[] args) {
		int num=2;							//���X��Reader
		Reader[] reader = new Reader[num];	//�}�C����
		for(int i=0;i<num;i++){
			reader[i] = dataInput();		//��ƿ�J�A�إߪ���
			System.out.println("---------------------------");
		}
		System.out.println("===========��ܸ��===========");
		dataShow(reader);					//��ܸ��
	}
	public static Reader dataInput(){		//��ƿ�J
		String v1,v2,v3,v4,v5,v6;
		java.util.Scanner scn = new java.util.Scanner(System.in);
		System.out.println("<�п�J��T>");
		System.out.print("Ū�̽s��: ");
		v1=scn.next();
		System.out.print("�m�W: ");
		v2=scn.next();
		System.out.print("�q��: ");
		v3=scn.next();
		System.out.print("�a�}: ");
		v4=scn.next();
		System.out.print("�ʧO: ");
		v5=scn.next();
		System.out.print("�ѥ��ƶq: ");
		v6=scn.next();
		Reader reader = new Reader(v1,v2,v3,v4,v5,v6);	//�إ�Reader����
		return reader;	//�^�Ǫ���
	}
	public static void dataShow(Reader[] reader){
		for(int i=0;i<reader.length;i++){
			reader[i].ShowInfo();
			System.out.println("==========================");
		}
	}
}

class Reader {
	private String id,name,tel,address,sex,booklist;
	Book[] books; 		//�}�C����
	public Reader(String v1,String v2,String v3,String v4,String v5,String v6){
		id=v1; name=v2; tel=v3; address=v4; sex=v5; booklist=v6;
		books = new Book[Integer.parseInt(booklist)];
		java.util.Scanner scn = new java.util.Scanner(System.in);
		for(int i=0;i<Integer.parseInt(booklist);i++){
			System.out.println("<�п�J��"+(i+1)+"����>");
			System.out.print("�ѥ�ID: ");
			String v7 = scn.next();
			System.out.print("�ѥ��W��: ");
			String v8 = scn.next();
			books[i] = new Book(v7,v8);	//�إ�Book����
		}
	}
	public void ShowInfo(){				//���Reader���
		System.out.println(this.name+"("+this.id+")\t�ʧO:"+this.sex);
		System.out.println("�q��:"+this.tel+"\n�a�}:"+this.address);
		for(int i=0;i<books.length;i++){
			System.out.println("--------------------------");
			books[i].showBookInfo();	//���Book���
		}
	}
	
	class Book{
		private String bookId,bTitle,publisher,time,type,price;
		public Book(String v1,String v2){
			bookId=v1; bTitle=v2;
			setBookInfo();
		}
		public void setBookInfo(){		//Book��ƿ�J
			java.util.Scanner scn = new java.util.Scanner(System.in);
			System.out.print("�X����: ");
			publisher=scn.next();
			System.out.print("�X���ɶ�: ");
			time=scn.next();
			System.out.print("���O(1)��T(2)����(3)��: ");
			type=scn.next();
			System.out.print("����: ");
			price=scn.next();
		}
		public void showBookInfo(){		//Book������
			System.out.println("�ѦW: "+this.bTitle+"("+this.bookId+")");
			System.out.println("�X����:"+this.publisher);
			System.out.println("�X���ɶ�:"+this.time);
			switch(Integer.parseInt(this.type)){
			case 1:
				System.out.println("���O:��T");
				break;
			case 2:
				System.out.println("���O:����");
				break;
			case 3:
				System.out.println("���O:��");
				break;
			}
			System.out.println("���O:"+type);
			System.out.println("����:"+this.price);
		}
	}
}
