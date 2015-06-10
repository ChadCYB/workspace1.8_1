package tt;
import java.util.Scanner;
public class ex04 {
	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		System.out.println("請輸入方程式(1)：");
		String str1 = scn.nextLine();
		String [] str11=str1.split(" ");
		for(int i=0;i<=str11.length-3;i++){
			System.out.print(str11[i]+"X^"+(str11.length-(i+2))+"+");
		}
		System.out.print(str11[(str11.length)-2]+"="+str11[(str11.length-1)]);
		System.out.println("\n請輸入方程式(2)：");
		String str2 = scn.nextLine();
		String [] str21=str2.split(" ");
		for(int i=0;i<=str21.length-3;i++){
			System.out.print(str21[i]+"X^"+(str21.length-(i+2))+"+");
		}
		System.out.println(str21[(str21.length)-2]+"="+str21[(str21.length-1)]);
		System.out.print("相加結果如下。\n");
		if(str11.length>str21.length){
			int len = str11.length-str21.length;
			for(int j=0;j<len;j++){
				System.out.print(str11[j]+"X^"+(str11.length-(j+2))+"+");
			}
			for(int i=0;i<str21.length-2;i++){
				System.out.print((Integer.valueOf(str11[len+i])+Integer.valueOf(str21[i]))+"X^"+(str21.length-i-2)+"+");
			}
			System.out.println((Integer.valueOf(str11[str11.length-2])+Integer.valueOf(str21[str21.length-2]))+"="+(Integer.valueOf(str11[str11.length-1])+Integer.valueOf(str21[str21.length-1])));
		}
		if(str11.length<str21.length){
			int len = str21.length-str11.length;
			for(int j=0;j<len;j++){
				System.out.print(str21[j]+"X^"+(str21.length-(j+2))+"+");
			}
			for(int i=0;i<str11.length-2;i++){
				System.out.print((Integer.valueOf(str21[len+i])+Integer.valueOf(str11[i]))+"X^"+(str11.length-i-2)+"+");
			}
			System.out.println((Integer.valueOf(str21[str21.length-2])+Integer.valueOf(str11[str11.length-2]))+"="+(Integer.valueOf(str21[str21.length-1])+Integer.valueOf(str11[str11.length-1])));
		}
		if(str11.length==str21.length){
			for(int i=0;i<str11.length-2;i++){
				System.out.print((Integer.valueOf(str11[i])+Integer.valueOf(str21[i]))+"X^"+(str11.length-i-2)+"+");
			}
			System.out.println((Integer.valueOf(str11[str11.length-2])+Integer.valueOf(str21[str21.length-2]))+"="+(Integer.valueOf(str11[str11.length-1])+Integer.valueOf(str21[str21.length-1])));
		}
	}
}