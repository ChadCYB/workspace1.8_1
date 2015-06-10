/*	Author: 朝
 * 	Student ID: 103021076
 * 	Date: 2015/01/19
 * 	Uses: т郎ずΤ碭フ璣ゅ计传︽(FileReader.read()セ)
 *  Java JDK: 1.6
 */
import java.io.*;
public class ex_16_103021076_3_2 {
	public static void main(String[] args) {
		String FileName = "TestFile.txt";
		try{
			int data;
			int v1=0, v2=0, v3=0, v4=0;
			FileReader fr = new FileReader(FileName);
			while((data = fr.read()) != -1){
				if(data == ' ') v1++;				//フ
				if((data>=65 && data<=90)||
					(data>=97 && data<=122)) v2++;	//璣ゅ
				if(data>=48 && data<=57) v3++;		//计
				if(data=='\n') v4++;				//传︽
			}
			fr.close();
			System.out.println("フ:"+v1+"\n璣ゅ:"+v2+"\n计:"+v3+"\n传︽:"+(v4));
		}catch(IOException ioE){
			System.out.println("弄郎拜肈:"+ioE.toString());
		}
	}
}
