/*	Author: �����e
 * 	Student ID: 103021076
 * 	Date: 2015/01/19
 * 	Uses: ��X�ɮפ����X�ӪťաA�^��A�Ʀr�A����(FileReader.read()����)
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
				if(data == ' ') v1++;				//�ť�
				if((data>=65 && data<=90)||
					(data>=97 && data<=122)) v2++;	//�^��
				if(data>=48 && data<=57) v3++;		//�Ʀr
				if(data=='\n') v4++;				//����
			}
			fr.close();
			System.out.println("�ť�:"+v1+"\n�^��:"+v2+"\n�Ʀr:"+v3+"\n����:"+(v4));
		}catch(IOException ioE){
			System.out.println("Ū�ɥX���D:"+ioE.toString());
		}
	}
}
