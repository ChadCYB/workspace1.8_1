/*	Author: �����e
 * 	Student ID: 103021076
 * 	Date: 2015/01/19
 * 	Uses: ��X�ɮפ����X�ӪťաA�^��A�Ʀr�A����(BufferedReader����)
 *  Java JDK: 1.6
 */
import java.io.*;
public class ex_16_103021076_3_1 {
	public static void main(String[] args) {
		String FileName = "TestFile.txt";
		try{
			String str;
			int v1=0, v2=0, v3=0, v4=0;
			FileReader fr = new FileReader(FileName);
			BufferedReader bfr = new BufferedReader(fr);
			while((str = bfr.readLine()) != null){
				char[] data = str.toCharArray();
				for(int i=0 ; i<str.length() ;i++){
					if(data[i] == ' ') v1++;					//�ť�
					if((data[i]>=65 && data[i]<=90)||
						(data[i]>=97 && data[i]<=122)) v2++;	//�^��
					if(data[i]>=48 && data[i]<=57) v3++;		//�Ʀr
				}
				v4++;
			}
			fr.close();		bfr.close();
			System.out.println("�ť�:"+v1+"\n�^��:"+v2+"\n�Ʀr:"+v3+"\n����:"+(v4));
		}catch(IOException io){
			System.out.println("Ū�ɥX���D:"+io.toString());
		}
	}
}
