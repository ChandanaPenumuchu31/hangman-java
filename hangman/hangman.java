import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
 import javax.swing.JPanel;
 import javax.swing.JFrame;
 import javax.swing.JButton;
 import javax.swing.ImageIcon;
  import javax.swing.Timer;
  import javax.swing.JTextField;
 
public class hangman extends JPanel implements KeyListener,ActionListener
{
	int i,j,x1,g=0,z=1;
	private Random r1=new Random();
	char c1,c2;
	String[] guess={"apple","banana","choclate","kiwi","orange","water","lemon","rose","danger","peace","infinity",
		"assemble","arrange","friend","love"};
	String word=guess[r1.nextInt(15)-1];
	String s;
	
	 int l=word.length();
	char[] c= new char[l];
	int chance=5;
	JTextField t1;
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27;
private ImageIcon h1;
private ImageIcon h2;
private ImageIcon h3;
private ImageIcon h4;
private ImageIcon h5;
private ImageIcon h6;
public hangman()
{
	for(i=0;i<l;i++)
	{
		c[i]='_';
	}
t1=new JTextField(1);
t1.setBounds(200,250,60,30);
add(t1);	
b1=new JButton("A");
b1.setBounds(10,300,50,30);
add(b1);
b1.addActionListener(this);
b2=new JButton("B");
b2.setBounds(100,300,50,30);
add(b2);
b2.addActionListener(this);
b3=new JButton("C");
b3.setBounds(200,300,50,30);
add(b3);
b3.addActionListener(this);
b4=new JButton("D");
b4.setBounds(300,300,50,30);
add(b4);
b4.addActionListener(this);
b5=new JButton("E");
b5.setBounds(400,300,50,30);
add(b5);
b5.addActionListener(this);
b6=new JButton("F");
b6.setBounds(10,350,50,30);
add(b6);
b6.addActionListener(this);
b7=new JButton("G");
b7.setBounds(100,350,50,30);
add(b7);
b7.addActionListener(this);
b8=new JButton("H");
b8.setBounds(200,350,50,30);
add(b8);
b8.addActionListener(this);
b9=new JButton("I");
b9.setBounds(300,350,50,30);
add(b9);
b9.addActionListener(this);
b10=new JButton("J");
b10.setBounds(400,350,50,30);
add(b10);
b10.addActionListener(this);
b11=new JButton("K");
b11.setBounds(10,400,50,30);
add(b11);
b11.addActionListener(this);
b12=new JButton("L");
b12.setBounds(100,400,50,30);
add(b12);
b12.addActionListener(this);
b13=new JButton("M");
b13.setBounds(200,400,50,30);
add(b13);
b13.addActionListener(this);
b14=new JButton("N");
b14.setBounds(300,400,50,30);
add(b14);
b14.addActionListener(this);
b15=new JButton("O");
b15.setBounds(400,400,50,30);
add(b15);
b15.addActionListener(this);
b16=new JButton("P");
b16.setBounds(10,450,50,30);
add(b16);
b16.addActionListener(this);
b17=new JButton("Q");
b17.setBounds(100,450,50,30);
add(b17);
b17.addActionListener(this);
b18=new JButton("R");
b18.setBounds(200,450,50,30);
add(b18);
b18.addActionListener(this);
b19=new JButton("S");
b19.setBounds(300,450,50,30);
add(b19);
b19.addActionListener(this);
b20=new JButton("T");
b20.setBounds(400,450,50,30);
add(b20);
b20.addActionListener(this);
b21=new JButton("U");
b21.setBounds(10,500,50,30);
add(b21);
b21.addActionListener(this);
b22=new JButton("V");
b22.setBounds(100,500,50,30);
add(b22);
b22.addActionListener(this);
b23=new JButton("W");
b23.setBounds(200,500,50,30);
add(b23);
b23.addActionListener(this);
b24=new JButton("X");
b24.setBounds(300,500,50,30);
add(b24);
b24.addActionListener(this);
b25=new JButton("Y");
b25.setBounds(400,500,50,30);
add(b25);
b25.addActionListener(this);
b26=new JButton("Z");
b26.setBounds(200,550,50,30);
add(b26);
b26.addActionListener(this);
b27=new JButton("OK");
b27.setBounds(300,550,70,30);
add(b27);
b27.addActionListener(this);

setLayout(null);
setSize(1000,700);
setVisible(true);

}

public void paintComponent(Graphics g)
{
	
	
	// background colour
	g.setColor(Color.BLACK);
	g.fillRect(500,0,500,700);
	
	g.setColor(Color.gray);
	g.fillRect(0,0,500,700);
	
	g.setColor(Color.RED);
	g.setFont(new Font("arial",Font.BOLD,40));
	g.drawString("HANG MAN",150,35);
	
	g.setColor(Color.YELLOW);
	g.setFont(new Font("arial",Font.BOLD,20));
	g.drawString("MAKE A GUESS",10,100);
	
	g.setColor(Color.orange);
	g.setFont(new Font("arial",Font.BOLD,25));
	g.drawString("CHANCES  :  "+chance,600,50);
	// printing characters
	x1=10;
	for(i=0;i<l;i++)
	{
		g.setColor(Color.blue);
	g.setFont(new Font("arial",Font.BOLD,30));
	g.drawString(""+c[i],x1,150);
	x1=x1+30;
		
	}
	
	if(chance==5)
	{
	h1=new ImageIcon("h1.png");
	h1.paintIcon(this,g,560,200);
}
	if(chance==4)
	{
	h2=new ImageIcon("h2.png");
	h2.paintIcon(this,g,560,200);
}
if(chance==3)
	{
	h3=new ImageIcon("h3.png");
	h3.paintIcon(this,g,560,200);
}
if(chance==2)
	{
	h4=new ImageIcon("h4.png");
	h4.paintIcon(this,g,560,200);
}
if(chance==1)
	{
	h5=new ImageIcon("h5.png");
	h5.paintIcon(this,g,560,200);
}
if(chance==0)
	{
	h6=new ImageIcon("h6.png");
	h6.paintIcon(this,g,560,200);
	g.setColor(Color.red);
	g.setFont(new Font("arial",Font.BOLD,30));
	g.drawString("YOU ARE HANGED!!",600,150);
}
if(z==0)
{
	g.setColor(Color.GREEN);
	g.setFont(new Font("arial",Font.BOLD,50));
	g.drawString("YOU WON!!",600,150);
}
	
}

public void actionPerformed(ActionEvent e)
 {
	 if(e.getSource()==b1)
{
t1.setText("a");
}
	 if(e.getSource()==b2)
{
t1.setText("b");
}
	 if(e.getSource()==b3)
{
t1.setText("c");
}
	 if(e.getSource()==b4)
{
t1.setText("d");
}
	 if(e.getSource()==b5)
{
t1.setText("e");
}
	 if(e.getSource()==b6)
{
t1.setText("f");
}
	 if(e.getSource()==b7)
{
t1.setText("g");
}
	 if(e.getSource()==b8)
{
t1.setText("h");
}
	 if(e.getSource()==b9)
{
t1.setText("i");
}
	 if(e.getSource()==b10)
{
t1.setText("j");
}
	 if(e.getSource()==b11)
{
t1.setText("k");
}
	 if(e.getSource()==b12)
{
t1.setText("l");
}
	 if(e.getSource()==b13)
{
t1.setText("m");
}
	 if(e.getSource()==b14)
{
t1.setText("n");
}
	 if(e.getSource()==b15)
{
t1.setText("o");
}
	 if(e.getSource()==b16)
{
t1.setText("p");
}
	 if(e.getSource()==b17)
{
t1.setText("q");
}
	 if(e.getSource()==b18)
{
t1.setText("r");
}
	 if(e.getSource()==b19)
{
t1.setText("s");
}
	 if(e.getSource()==b20)
{
t1.setText("t");
}
	 if(e.getSource()==b21)
{
t1.setText("u");
}
	 if(e.getSource()==b22)
{
t1.setText("v");
}
	 if(e.getSource()==b23)
{
t1.setText("w");
}
	 if(e.getSource()==b24)
{
t1.setText("x");
}
	 if(e.getSource()==b25)
{
t1.setText("y");
}
	 if(e.getSource()==b26)
{
t1.setText("z");
}
	 if(e.getSource()==b27)
{
s=t1.getText();
c1=s.charAt(0);
for(i=0;i<l;i++)
{
c2=word.charAt(i);
if(c2==c1)
{
c[i]=c2;
 g++;
}
}
if(g==0)
{
	chance--;
	
}
g=0;
z=0;
for(i=0;i<l;i++)
{
	if(c[i]=='_')
	{
		z++;
	}
}
repaint();
}

 }
public void keyPressed(KeyEvent e)
    {
	}
public void keyReleased(KeyEvent e)
    {
       
    }
    public void keyTyped(KeyEvent e)
    {
      
    }


public static void main(String[] args) 
{
            JFrame mainFrame = new JFrame();
            JPanel p=new JPanel();
            hangman h=new hangman();
           
            mainFrame.setBounds(0,0,1000,700);
            mainFrame.setBackground(Color.WHITE);
            mainFrame.setTitle("HANG MAN");
            mainFrame.setResizable(false);
            mainFrame.setVisible(true);
            mainFrame.setLocationRelativeTo(null);
            mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mainFrame.add(new hangman());
   }
   
 }
