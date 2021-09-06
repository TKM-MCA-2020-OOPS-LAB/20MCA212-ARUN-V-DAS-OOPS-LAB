import java.applet.*;  
import java.awt.*;
import java.awt.event.*;  

public class Max extends Applet implements ActionListener{  
	TextField n1,n2,n3,rslt;
	Button b;
	public void init(){
		setLayout(null);
		n1=new TextField(10);
		n2=new TextField(10);
		n3=new TextField(10);
		rslt=new TextField(10);
		b=new Button("Find");
		n1.setBounds(40,60,50,30);
		n2.setBounds(100,60,50,30);
		n3.setBounds(160,60,50,30);
		rslt.setBounds(140,120,50,30);
		b.setBounds(60,120,50,30);
		add(n1);
		add(n2);
		add(n3);
		add(rslt);
		add(b);
		n1.setText("");
		n2.setText("");	
		n3.setText("");
		b.addActionListener(this);				
	} 
	public void actionPerformed(ActionEvent e){  
		int a,b,c;	
		String str;
		str=n1.getText();
		a=Integer.parseInt(str);
		str=n2.getText();
		b=Integer.parseInt(str);
		str=n3.getText();
		c=Integer.parseInt(str);
		
		if (a>b){
		   if(b>c)
		      rslt.setText(""+a);
		   else
		     rslt.setText(""+c);
		}
		else{
		   if(b>c)
		     rslt.setText(""+b);
		   else
		      rslt.setText(""+c);
		}							
	}  
}  
