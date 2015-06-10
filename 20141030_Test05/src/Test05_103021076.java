/*	姓名: 陳奕呈
 * 	學號: 103021076
 * 	日期: 2014/10/30
 * 	用途: "lim(1-x^3)/(x-1)"極限計算，"高斯函數計算"
 * 	版本/系統: jdk1.8/linux 
 */
import java.util.Random;
public class Test05_103021076 {
	static float x,y,num;
	static int a1,a2;
	static Random rand = new Random();
	public static void main(String[] args) {
		a1=-3;	//Start
		a2=3;	//End
		System.out.println("lim((1-x^3)/(x-1))->x");
		while(a1<=a2){
			System.out.println("x:"+((a1<0)?a1:("+"+a1))+"\ty:"+((f(a1)<0)?f(a1):("+"+f(a1))));
			a1++;
		}
		System.out.println("\nGaussian(高斯計算)");
		for(int i=0;i<6;i++){
			num = rand.nextFloat()*100-50;
			System.out.println("[|"+num+"|]\t= "+ gaussian(num));	
		}
	}
	public static float f(float x){
		if((x-1)==0){
			float x1,x2;
			x1=(float)(x-0.0000001);
			x2=(float)(x+0.0000001);
			return (f(x2)+f(x1))/2;
		}
		y=(float)(1-Math.pow(x,3))/(x-1);
		return y;
	}
	public static int gaussian(float g){
		int g1=(int)(g);
		int ans=(g<0)?(g1-1):g1;
		return (g-g1!=0)?(ans):g1;
	}
}
