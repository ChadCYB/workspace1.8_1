
public class exam103_1_fin_org
{
   static float deltax;
   
   public static void main(String args[])
   {
      int n=100;
      int a=1;
      int delta=2;
	  float x[]=new float[n];
      int i; 
      float Z[]=new float[n];
      float z;
      double exp;
      double y;  
      double xi=1;
      double h=0.00734;
      double c1[]={0,1,-8,0,8,-1,0};
      double xin[]={xi-3*h,xi-2*h,xi-1*h,xi+0*h,xi+1*h,xi+2*h,xi+3*h};
      double xin1[]={xi+0*h,xi+1*h};
      double fv;    
      int gv;
            
      System.out.print("勘根定理，方程式求解:");
      double a0=-3.0;
      double b0=3.0;
      int m=1000000;
      double rf[]=new double[m/2];
      rf=rootf(a0,b0,m);
      System.out.print("x^2-x-2=0,x=");
      int rf_len=(int)rf[0];
      for(i=1;i<rf_len;i++)
      {    	  
    	  System.out.print(rf[i]+" ");         
      }
      System.out.print("\n");
      
      fv=diff1(xin1,h);
      System.out.print("定義的一階微分值:");
      System.out.println(fv+" "); 
      
      fv=df1(xin,c1,h);
      System.out.print("一階的數值微分值:");
      System.out.println(fv+" ");
      
      
      
      double a1=0.0;
      double b1=1.0;
      double A=0.0;
      int n1=10000;
      A=if1(a1,b1,n1);
      
      System.out.print("積分值:");
      System.out.println(A+" "); 
      
      exp=e(0.0);
      System.out.println(exp+" "); 
      
      System.out.print("x內容:");
      for(i=0;i<x.length;i++)
      {
          deltax=((a+delta)-(a-delta))/(float)(2*delta*n);
    	  x[i]=(a-delta)+deltax*i;
    	  System.out.print(x[i]+" ");         
      }
      Z=f(x);
      System.out.print("\n");
      System.out.print("f(x)內容:");
      for(i=0;i<x.length;i++)
      {
    	 System.out.print(Z[i]+" ");  
      }
      z=f(1);
      y=fx(1);
      System.out.print("\n");
      System.out.print("lim內容:");
      System.out.print(z+" "); 
      
      System.out.print("\n");
      System.out.print("lim(f(1))內容:");      
      System.out.print(y+" "); 
      
      gv=gaussf(1.3);
      System.out.print("\n");
      System.out.print("gauss(1.3):");
      System.out.print(gv+" ");
      
      gv=gaussf(-1.5);
      System.out.print("\n");
      System.out.print("gauss(-1.5):");
      System.out.print(gv+" ");
      
      
      
   }
   
   public static double diff1(double x[],double h)
   {	   
	   double fi[]=new double[x.length];
	   double fv=0;	   
	   fi=fcn(x);
	   fv=(fi[1]-fi[0])/h;	   
	   return fv;
   }
   
   public static double[] rootf(double a,double b,int n)
   {
	   double h=(b-a)/n;	   
	   double x[]=new double[n];
	   double y[]=new double[n];
	   double x1[]=new double[n/2];
	   int i1[]=new int[n/2];
	   for(int i=0;i<x.length;i++)
	   {
	       x[i]=a+i*h;
	   }	      
	   y=equ(x);	   
	   int k=1;
	   for(int i=0;i<(y.length-1);i++)
	   {
	       if (y[i]*y[i+1]<0){
	    	 x1[k]=x[i];
	    	 i1[k]=i;
	    	 k=k+1;
	    	 //System.out.println("k="+k+" ");
	       }
	   }
	   x1[0]=(double)(k);	   
	   return x1;
   }
   
   public static double[] equ(double x[])
   {
	   double fi[]=new double[x.length];
	   for(int i=0;i<x.length;i++){
	     fi[i]=Math.pow(x[i], 3)-x[i]-1.0;	     
	   }
	   return fi;
   }
   
   public static double if1(double a,double b,int n)
   {
	   double h=(b-a)/n;	   
	   double x[]=new double[n];
	   double y[]=new double[n];
	   for(int i=0;i<x.length;i++)
	   {
	       x[i]=a+i*h;
	   }	      
	   y=fcn(x);
	   double sumy=0.0;
	   for(int i=1;i<(y.length-1);i++)
	   {
	       sumy=sumy+y[i];
	   }	
	   double A=((y[0]+y[n-1])/2+sumy)*h;	    
	   return A;
   }
   
   public static double df1(double x[],double c[],double h)
   {
	   
	   double fi[]=new double[x.length];
	   double fv=0;	   
	   fi=fcn(x);
	   for(int i=0;i<x.length;i++)
	   {
	       fv=fv+c[i]*fi[i];
	   }	   
	   fv=fv/(12*Math.pow(h, 1));
	   return fv;
   }
   
   public static double[] fcn(double x[])
   {
	   double fi[]=new double[x.length];
	   for(int i=0;i<x.length;i++){
	     fi[i]=Math.pow(x[i], 9);	     
	   }
	   return fi;
   }
   
   public static int gaussf(double x)
   {
	   int y;
	   if (x>=0.0){
		  y=(int)x;
	   }else{
		  y=(int)(x-1); 
	   }
	   return y;
   }
   
   public static float f(float x)
   {
	   float y;
	   if ((x-1)==0){
		   x=x+deltax;		   
	   }
	   y=(float)((1-Math.pow(x, 3))/(x-1));
	   return y;
   }
   
   public static double fx(double x)
   {
	   double y;
	   if ((x-1)==0){
		   x=x+(1e-10);		   
	   }
	   y=((1-Math.pow(x, 3))/(x-1));
	   return y;
   }
   
   public static double e(double x)
   {
	   double y;
	   if (Math.abs(x)<(1e-10)){
		   x=x+(1e-10);
		   y=Math.pow(1+x,1/x);
		   System.out.print("exp:");
	   }else{
		   y=Math.pow(1+x,1/x);   
	   }
	   return y;
   }
   public static float[] f(float x[])
   {
	   float y[]=new float[x.length];
	   for(int i=0;i<x.length;i++)
	   {
	       if ((x[i]-1)==0){
		       x[i]=x[i]+deltax;		       	       
	       }
	       y[i]=(float)((1-Math.pow(x[i], 3))/(x[i]-1));
	   }
	   return y;
   }
   
}

