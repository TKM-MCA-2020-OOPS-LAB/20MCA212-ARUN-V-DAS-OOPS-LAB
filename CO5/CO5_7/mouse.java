import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class mouse extends Applet implements MouseListener
{
	String msg="";
	public void init()
	{
		addMouseListener(this);
	}
	public void mouseClicked(MouseEvent me)
	{
		msg = "Mouse Clicked";
		repaint();
	}
	public void mousePressed(MouseEvent me)
	{
		msg = "Mouse Pressed";
		repaint();
	}
	public void mouseReleased(MouseEvent me)
	{
		msg = "Mouse Released";
		repaint();
	}
	public void mouseEntered(MouseEvent me)
	{
		msg = "Mouse Entered";
		repaint();
	}
	public void mouseExited(MouseEvent me)
	{
		msg = "Mouse Exited";
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,50,50);
	}
}
