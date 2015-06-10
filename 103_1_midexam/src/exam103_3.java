/* 姓名: 陳奕呈
 * 學號:	103021076
 * 日期:	2014/10/09
 * 用途: 期中考
 * 版本/系統: jdk1.8/linux
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class exam103_3 {
	public static void main(String[] args) {
		MainFrame3 mFrame3 = new MainFrame3();
		mFrame3.setVisible(true);
	}
}
class MainFrame3 extends JFrame{
	public MainFrame3(){
		initComp();
	}
	private JButton jbtnExit=new JButton("Exit");
	private JButton jbtnDraw=new JButton("Draw");
	private JButton jbtnCls=new JButton("Clear");
	private JLabel jlb = new JLabel("資工數位1A 陳奕呈 103021076");
	private static JRadioButton jrbL=new JRadioButton("L");
	private static JRadioButton jrbO=new JRadioButton("O");
	private static JRadioButton jrbV=new JRadioButton("V");
	private static JRadioButton jrbE=new JRadioButton("E");
	private Container cp;
	private JPanel jplSet = new JPanel();
	private static int width=750, height=500 ,h=height*5/6;;
	
	private void initComp(){
		setTitle("Mid-term Exam (Author: 103021076)");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(50,70,width,height);
		setResizable(false);
		cp = getContentPane();
		cp.setLayout(new BorderLayout());
		jplSet.setLayout(new GridLayout(2,4,3,3));
		jplSet.setBackground(Color.lightGray);

		ButtonGroup group = new ButtonGroup();
		group.add(jrbL);	group.add(jrbO);
		group.add(jrbV);	group.add(jrbE);
		cp.add(jplSet,BorderLayout.SOUTH);
		jplSet.add(jrbL);	jplSet.add(jrbO);
		jplSet.add(jrbV);	jplSet.add(jrbE);
		jplSet.add(jbtnDraw);
		jplSet.add(jbtnCls);
		jplSet.add(jbtnExit);
		jplSet.add(jlb);
		
		jbtnExit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				System.exit(0);
			}
		});
		jbtnCls.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				Graphics g=getGraphics();
				gClear(g);
			}
		});
		jbtnDraw.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				Graphics g=getGraphics();
				gClear(g);
				gDraw(g); 
			}
		});		
	}	
	private static void gClear(Graphics g) {
		g.clearRect(0,0,width,h+5);
	}
	private static void gDraw(Graphics g){
	    int i, x[]={0}, y[]={0};
	    double pi=3.1415926535897932384626433832795/180;
	    if(jrbL.isSelected()){			//<<<<<<<<<<<<<<<<	L
	    	x=new int[width];y=new int[width];
			for(i=0;i<x.length;i++){
				x[i]=i+1;
				y[i]=(int)(-1.0/x[i]*height*16)+(h);
			}
			gPaint(g,x,y);
			
		}else if(jrbO.isSelected()){		//<<<<<<<<<<<<<<<<	O
			x=new int[360];	y=new int[360];
			for(int deg=0;deg<360;deg++){
				x[deg]=(int)((Math.sin(deg*pi))*(h/2-30))+width/2;
				y[deg]=(int)((Math.cos(deg*pi))*(h/2-30))+h/2;
			}
			gPaint(g,x,y);
			g.drawLine(0,30+width/4,width,30+width/4);	//X軸
			g.drawLine(width/2,0,width/2,40+width/2);	//Y軸
			g.drawString("(x,y)=(0,0)",(int)(width/2),width/4+25);
			g.drawString("(x,y)=(0,-3)",(int)(width/2),width/2+25);
			
		}else if(jrbV.isSelected()){		//<<<<<<<<<<<<<<<<  V
			x=new int[width];y=new int[width];
			for(i=0;i<x.length;i++){
				x[i]=i-(x.length/2);
				y[i]=height*5/6-(int)(Math.abs(x[i]*-2));
				x[i]=x[i]+width/2;
			}
			gPaint(g,x,y);
			g.drawLine(width/2,0,width/2,40+width/2);	//Y軸
			g.drawString("(x,y)=(0,0)",width/2-30,h-3);
				
		}else if(jrbE.isSelected()){ 	//<<<<<<<<<<<<<<<<  E
			x=new int[360];y=new int[360];int w = width*3/4+5;
			for(i=0;i<x.length;i++){
				y[i]=i-(y.length/2);
			    x[i]=(height+70)-(int)(Math.abs((0.7*Math.sin(pi*y[i])))*height);
			    y[i]=y[i]+(height/2-33);
			}
			gPaint(g,x,y);
			g.drawLine(0,30+width/4,width,30+width/4);	//X軸
			g.drawLine(w,0,w,40+width/2);	//Y軸
			g.drawString("(x,y)=(0,0)",w,height/2-40);
		}
	}
    private static void gPaint(Graphics g,int x[],int y[]){
    	g.setColor(Color.white);
		g.fillRect(0,0,width,h);
		g.setColor(Color.green);
		g.drawRect(0,0,width,h);
		g.setColor(Color.red);
		g.drawPolyline(x,y,x.length);	//<<<<<<<<<<<<<<<< Draw
		g.setColor(Color.black);
	}
}