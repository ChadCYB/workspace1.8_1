/*	�m�W: �����e
 * 	�Ǹ�: 103021076
 * 	���: 2014/10/30
 * 	�γ~: "�ɮکw�z�A�ѼƾǤ�{��(x^3-x-1)" 
 * 	����/�t��: jdk1.8/linux
 */
import java.util.Random;
public class Test06_103021076 {
	public static void main(String[] arg){
		double a1 = -3.0;	//Start
		double a2 = 3.0;	//End
		int div = 10000000;	//���βӫ�
		double root[]=new double[div/2];
		root=rootfuc(a1,a2,div);	//��X�Ӯ�
		System.out.println("f(x)=(x^3)-x-1 , (-3<x<3)");
		System.out.print("x=");
		int rtLen=(int)root[0];
		for(int i=1;i<rtLen;i++){
			System.out.print(root[i]+"\t");
		}
		System.out.println();
	}
	public static double[] rootfuc(double a,double b,int d){
		double h=(b-a)/d;	   //X�����ΪŶ�
		double x[]=new double[d];
		double y[]=new double[d];
		double ans[]=new double[d/2];
		int i,count=1;
		for(i=0;i<x.length;i++){
			x[i]=a+i*h;	//����X��
		}	      
		y=cal(x);	//�p��Y
		for(i=0;i<(y.length-1);i++){
			if (y[i]*y[i+1]<0){
				ans[count]=x[i];	//�ڴ��x�s
				count=count+1;
			}
		}
		ans[0]=(double)(count);	   //�ڼƶq
		return ans;
	}
	public static double[] cal(double x[]){
		double f[]=new double[x.length];
		for(int i=0;i<x.length;i++){
			f[i]=Math.pow(x[i], 3)-x[i]-1.0;
	//		System.out.println(i+" : "+f[i]+"\t"+x[i]);		//<<<<<<<
		}
		return f;
	}
}
