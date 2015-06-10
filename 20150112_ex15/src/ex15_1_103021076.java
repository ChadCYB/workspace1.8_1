/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2015/01/12
 * 	Uses: Class練習(內部類別)
 *  Java JDK: 1.6
 */
public class ex15_1_103021076 {
	public static void main(String[] args) {
		int num=2;							//有幾個Reader
		Reader[] reader = new Reader[num];	//陣列物件
		for(int i=0;i<num;i++){
			reader[i] = dataInput();		//資料輸入，建立物件
			System.out.println("---------------------------");
		}
		System.out.println("===========顯示資料===========");
		dataShow(reader);					//顯示資料
	}
	public static Reader dataInput(){		//資料輸入
		String v1,v2,v3,v4,v5,v6;
		java.util.Scanner scn = new java.util.Scanner(System.in);
		System.out.println("<請輸入資訊>");
		System.out.print("讀者編號: ");
		v1=scn.next();
		System.out.print("姓名: ");
		v2=scn.next();
		System.out.print("電話: ");
		v3=scn.next();
		System.out.print("地址: ");
		v4=scn.next();
		System.out.print("性別: ");
		v5=scn.next();
		System.out.print("書本數量: ");
		v6=scn.next();
		Reader reader = new Reader(v1,v2,v3,v4,v5,v6);	//建立Reader物件
		return reader;	//回傳物件
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
	Book[] books; 		//陣列物件
	public Reader(String v1,String v2,String v3,String v4,String v5,String v6){
		id=v1; name=v2; tel=v3; address=v4; sex=v5; booklist=v6;
		books = new Book[Integer.parseInt(booklist)];
		java.util.Scanner scn = new java.util.Scanner(System.in);
		for(int i=0;i<Integer.parseInt(booklist);i++){
			System.out.println("<請輸入第"+(i+1)+"本書>");
			System.out.print("書本ID: ");
			String v7 = scn.next();
			System.out.print("書本名稱: ");
			String v8 = scn.next();
			books[i] = new Book(v7,v8);	//建立Book物件
		}
	}
	public void ShowInfo(){				//顯示Reader資料
		System.out.println(this.name+"("+this.id+")\t性別:"+this.sex);
		System.out.println("電話:"+this.tel+"\n地址:"+this.address);
		for(int i=0;i<books.length;i++){
			System.out.println("--------------------------");
			books[i].showBookInfo();	//顯示Book資料
		}
	}
	
	class Book{
		private String bookId,bTitle,publisher,time,type,price;
		public Book(String v1,String v2){
			bookId=v1; bTitle=v2;
			setBookInfo();
		}
		public void setBookInfo(){		//Book資料輸入
			java.util.Scanner scn = new java.util.Scanner(System.in);
			System.out.print("出版社: ");
			publisher=scn.next();
			System.out.print("出版時間: ");
			time=scn.next();
			System.out.print("類別(1)資訊(2)文藝(3)休閒: ");
			type=scn.next();
			System.out.print("價格: ");
			price=scn.next();
		}
		public void showBookInfo(){		//Book資料顯示
			System.out.println("書名: "+this.bTitle+"("+this.bookId+")");
			System.out.println("出版社:"+this.publisher);
			System.out.println("出版時間:"+this.time);
			switch(Integer.parseInt(this.type)){
			case 1:
				System.out.println("類別:資訊");
				break;
			case 2:
				System.out.println("類別:文藝");
				break;
			case 3:
				System.out.println("類別:休閒");
				break;
			}
			System.out.println("類別:"+type);
			System.out.println("價格:"+this.price);
		}
	}
}
