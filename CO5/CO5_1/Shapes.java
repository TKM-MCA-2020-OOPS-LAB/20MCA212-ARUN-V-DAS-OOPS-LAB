import java.applet.Applet;  
import java.awt.*;  

public class Shapes extends Applet{  
	  
	public void paint(Graphics g){  
	g.drawString("Line:",10,20);  
	g.drawLine(20,40,200,40);
	g.drawString("Circle:",10,70);
	g.drawOval(20,80,90,80);
	g.drawString("Rectangle:",10,190);
	g.drawRect(20,210,170,100);
	}  
}  