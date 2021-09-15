import java.awt.*;
import java.applet.*;
import java.awt.Graphics;
import java.awt.event.*;

public class house extends Applet implements MouseListener{
    	int a,b;
    	public void init()
    		{
        		addMouseListener(this);
    	}
    	public void paint(Graphics gp){ 
		gp.setColor(Color.yellow);
		int [] x = {80, 420, 250};
        		int [] y = {100, 100, 20};
        		gp.fillRect(120, 100, 260, 200); 
       		gp.setColor(Color.blue);
        		gp.fillRect(220, 200, 50, 100); 
        		gp.setColor(Color.black);
		gp.setColor(Color.red);
        		gp.fillPolygon(x, y, 3); 
        		if(a>200 && a<300 && b>200 && b<300){
            		      gp.setColor(Color.red);
            		      gp.fillRect(220, 200, 50, 100); 
        		}
    	}
	public void mousePressed(MouseEvent e) {
       		 a=e.getX();
       		 b=e.getY();
       		 repaint();
	} 
 	public void mouseClicked(MouseEvent e){
	}
    	public void mouseEntered(MouseEvent e){
    	}
    	public void mouseExited(MouseEvent e) {
    	}
 	public void mouseReleased(MouseEvent e){
    	}
}