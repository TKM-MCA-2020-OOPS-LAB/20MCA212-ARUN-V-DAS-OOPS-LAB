import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class key extends Applet implements KeyListener{
	String msg="";
	public void init(){
		 addKeyListener(this);
		requestFocus();
	}
	public void keyTyped(KeyEvent e){
		msg+=e.getKeyChar();
		repaint();
	}
	public void keyReleased(KeyEvent e){
		showStatus("Key Released");	
	}
	public void keyPressed(KeyEvent ke){	
		showStatus("Key Pressed!!!");
	}
	public void paint(Graphics g){
		g.drawString(msg,50,50);
	}
}