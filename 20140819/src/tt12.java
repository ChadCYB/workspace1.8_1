import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
//�Q�Q�٦��S����L���F��nimport
public class tt12 extends JFrame implements ActionListener,MouseMotionListener,MouseListener //�W�٧�@��
{
Container c;
//�]�wUI����
JButton bot;
JLabel lab1,lab2;
//�]�w�@�Ϊ��ܼƻP���O
java.util.Random rg;
int x1,y1,x2,y2,mode,ms;//mt�ɶ�,ms����
double mt;
javax.swing.Timer t;
public tt12() //�غc���A�W�٧�@��
{
super("���a��"); 
//��l�Ʀ@���ܼ�
x1=200;x2=400;
y1=200;y2=200;mode=0;
rg=new Random();
c=getContentPane();//���oContentPane
//�]�w�����]�w
c.setLayout(new FlowLayout());
//��l��UI����
bot=new JButton("�}�l");
lab1=new JLabel("�ѤU:60��");
lab2=new JLabel("���Z:0");

//�NUI����[�JContentPane
c.add(lab1);c.add(bot);c.add(lab2);
//�]�wUI����P�ƹ����ƥ�Ĳ�o��ť��
bot.addActionListener(this);
addMouseMotionListener(this);
addMouseListener(this);
t=new javax.swing.Timer(500,this);
setSize(640,480);//�]�wsize�A��ܥX�h
setVisible(true);
}
public void paint(Graphics g) 
{
super.paint(g);//�e�X����

g.drawOval(x1-50,y1-50,100,100);
g.drawOval(x2-50,y2-50,100,100);
//�B�~���e�ϵ{���g�b�o��

if(mode==1)
g.fillOval(x1-50,y1-50,100,100);
else
g.drawOval(x1-50,y1-50,100,100);
if(mode==2)
g.fillOval(x2-50,y2-50,100,100);
else
g.drawOval(x2-50,y2-50,100,100);
}
public void mouseDragged(MouseEvent xxx) { };
public void mouseMoved(MouseEvent e){ };
//UI����ƥ�B�z���O�g�b�o��
public void actionPerformed(ActionEvent e)
{
if (e.getSource()==bot)
{
mt=60;
ms=0;
t.start();
}
else if (e.getSource()==t)
{
mt=mt-0.5;
mode=rg.nextInt(2)+1;
lab1.setText("�ѤU:"+mt+"��");
repaint();
}
}
public void mouseEntered(MouseEvent e){ }; 
public void mouseExited(MouseEvent e){ }; 
public void mousePressed(MouseEvent e)
{
int mx,my;
mx=e.getX();my=e.getY();
if (mode==1)
{
if ((x1-mx)*(x1-mx)+(y1-my)*(y1-my)<2500)
{
ms=ms+1;
lab2.setText("���Z:"+ms);
mode=0;
repaint();
}
}
else if (mode==2)
{
if ((x2-mx)*(x2-mx)+(y2-my)*(y2-my)<2500)
{
ms=ms+1;
lab2.setText("���Z:"+ms);
mode=0;
repaint();
}
}

};
public void mouseReleased(MouseEvent e){ };
public void mouseClicked(MouseEvent e){ };

//�ƹ��ƥ�B�z���O�g�b�o��
/***�D�{��***/
public static void main(String args[]) //�{���_�I
{
tt12 app=new tt12(); //�W�٧�@��A�Ұ�UI����
app.addWindowListener(new WindowAdapter(){ 
public void windowClosing(WindowEvent e)
{
System.exit(0);
}
}); //�B�z���������n�D
}
}