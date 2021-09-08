import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class choice extends Applet implements ItemListener{
	Choice c;
	String ch;
	
	public void init(){
		c=new Choice();
		c.addItem("Rectangle");
		c.addItem("Square");
		c.addItem("Circle");
		c.addItem("Triangle");
		c.addItemListener(this);
		c.setBounds(10,30,100,30);
		add(c);
		c.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent e){
 		ch=c.getSelectedItem();
		repaint();
	}
	public void paint(Graphics g){
		g.drawString("Select Any Choice",30,20);
		if (ch.equals("Rectangle")){
			g.setColor(Color.red);
			g.fillRect(200,80,200,150);
		}
		if (ch.equals("Square")){
	 		g.setColor(Color.yellow);
	   		g.fillRect(200,80,200,200);
		}
		if (ch.equals("Circle")){
			g.setColor(Color.green);
			g.fillOval(200,80,200,200);
		}
		if (ch.equals("Triangle")){
			int x[]={300,400,200};
			int y[]={80,300,300};
			g.setColor(Color.blue);
			g.fillPolygon(x,y,3);
		}
	}
}