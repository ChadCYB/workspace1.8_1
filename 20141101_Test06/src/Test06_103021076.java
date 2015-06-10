/*	姓名: 陳奕呈
 * 	學號: 103021076
 * 	日期: 2014/10/30
 * 	用途: "勘根定理，解數學方程式(x^3-x-1)" 
 * 	版本/系統: jdk1.8/linux
 */
import java.util.Random;
public class Test06_103021076 {
	public static void main(String[] arg){
		double a1 = -3.0;	//Start
		double a2 = 3.0;	//End
		int div = 10000000;	//分割細度
		double root[]=new double[div/2];
		root=rootfuc(a1,a2,div);	//算幾個根
		System.out.println("f(x)=(x^3)-x-1 , (-3<x<3)");
		System.out.print("x=");
		int rtLen=(int)root[0];
		for(int i=1;i<rtLen;i++){
			System.out.print(root[i]+"\t");
		}
		System.out.println();
	}
	public static double[] rootfuc(double a,double b,int d){
		double h=(b-a)/d;	   //X的切割空間
		double x[]=new double[d];
		double y[]=new double[d];
		double ans[]=new double[d/2];
		int i,count=1;
		for(i=0;i<x.length;i++){
			x[i]=a+i*h;	//切割X值
		}	      
		y=cal(x);	//計算Y
		for(i=0;i<(y.length-1);i++){
			if (y[i]*y[i+1]<0){
				ans[count]=x[i];	//根植儲存
				count=count+1;
			}
		}
		ans[0]=(double)(count);	   //根數量
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
