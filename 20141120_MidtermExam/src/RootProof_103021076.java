/*	�m�W: �����e
 * 	�Ǹ�: 103021076
 * 	���: 2014/11/20
 * 	�γ~: "LOVE����ҩ��s��"
 * 	����/�t��: jdk1.8/linux
 */
import java.util.Random;
import java.util.Scanner;
public class RootProof_103021076 {
	static double inf = 1.0 / 0;	//Infinity 
	public static void main(String[] arg){
		Scanner scn = new Scanner(System.in);
		int start=-100;	//start
		int end=100;		//end
		double f[]=new double[end-start+1];
		System.out.print("(1)L (2)O (3)V (4)E:");
		double x = 0, y = 0;
		double c = 0.0001;
		int count;
		switch(scn.nextInt()){
		case 1:	//L
			count = 0;
			System.out.println("y = 1/x");
			double err=1;
			for(x=start;x<=end;x++,count++){
				y = 1.0/x;	//<<<<<<<<
				if(y == inf){
					System.out.println("x="+x+"\t 1/x=0 \t <<<<���s�b");
					err = x;
				}else{
					System.out.println("x="+x+"\t y="+y+"\t y=1/x="+y/x);
				}
			}
			System.out.println("����Ʃ�"+err+"���s��");
			break;
		case 2:	//O
			System.out.println("x^2 + y^2 = 9 ");
			for(x=start;x<=end;x=x+0.01){
				for(y=start;y<=end;y=y+0.01){
					if((9.0+c) > Math.pow(x, 2)+Math.pow(y, 2) && (Math.pow(x, 2)+Math.pow(y, 2) > (9.0-c))){
						System.out.println("x="+x+"\t y="+y+"\t ����");
					}
				}
			}
			System.out.println("����ƴN�O�ꫬ");
			break;
		case 3:	//V
			System.out.println("y =|-2x|");
			for(x=start;x<=end;x++){
				y=Math.abs(-2*x);
				System.out.println("x="+x+((x==start)?"\t y=":"\t\t y=")+y);
			}
			System.out.println("����Ƴs��");
			break;
		case 4:	//E
			System.out.println("x = -3|Sin y|");
			double max=0,min=360;
			for(y=start;y<=end;y++){
				x=-3*(double)(Math.sin(y));
				System.out.println("y="+y+((y==start)?"\t x=":"\t\t x=")+x);
				max=(x>max)?x:max;
				min=(x<min)?x:min;
			}
			System.out.println("y>>  max:"+max+"\t min:"+min);
			System.out.println("����Ʃ�"+max+"��"+min+"���s��");
			break;
		}
	}
}
