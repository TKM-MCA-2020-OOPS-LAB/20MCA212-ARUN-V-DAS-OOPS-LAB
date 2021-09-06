import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class cal extends Applet implements ActionListener{
	TextField t;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,add,sub,mul,div,clr,eql;
	String s,s1,s2,s3,s4;
 	int a,b,c;
	
	public void init(){
		
		setLayout(null);
		t=new TextField(20);
		
		b0=new Button("0");
		b0.setBounds(10,10,20,10);
		b1=new Button("1");
		b2=new Button("2");
		b3=new Button("3");
		b4=new Button("4");
		b5=new Button("5");
		b6=new Button("6");
		b7=new Button("7");
		b8=new Button("8");
		b9=new Button("9");
		add=new Button("+");
		sub=new Button("-");
		mul=new Button("*");
		div=new Button("/");
		eql=new Button("=");
		clr=new Button("Clear");
		
		add(t);
		add(b1);
		add(b2);
		add(b3);
		add(add);

		add(b4);	
		add(b5);
		add(b6);
		add(sub);

		add(b7);
		add(b8);
		add(b9);
		add(mul);

		add(clr);
		add(b0);
		add(eql);
		add(div);
		
 		t.setBounds(30,30,200,40);
 		b1.setBounds(30,80,44,44);
		b2.setBounds(82,80,44,44);
 		b3.setBounds(134,80,44,44);
 		add.setBounds(186,80,44,44);
			
		b4.setBounds(30,132,44,44);
 		b5.setBounds(82,132,44,44);
  		b6.setBounds(134,132,44,44);
  		sub.setBounds(186,132,44,44);

		b7.setBounds(30,184,44,44);
  		b8.setBounds(82,184,44,44);
  		b9.setBounds(134,184,44,44);
  		mul.setBounds(186,184,44,44);

		clr.setBounds(30,236,44,44);
  		b0.setBounds(82,236,44,44);
  		eql.setBounds(134,236,44,44);
  		div.setBounds(186,236,44,44);
  		
 	 	b0.addActionListener(this);
  		b1.addActionListener(this);
  		b2.addActionListener(this);
  		b3.addActionListener(this);
  		b4.addActionListener(this);
  		b5.addActionListener(this);
  		b6.addActionListener(this);
  		b7.addActionListener(this);
  		b8.addActionListener(this);
  		b9.addActionListener(this);
 
  		div.addActionListener(this);
 		mul.addActionListener(this);
  		add.addActionListener(this);
  		sub.addActionListener(this);
  		eql.addActionListener(this);
		clr.addActionListener(this);		
	}
	public void actionPerformed(ActionEvent e){
   		s=e.getActionCommand();
  		if(s.equals("0")||s.equals("1")||s.equals("2")||s.equals("3")||s.equals("4")||s.equals("5")||s.equals("6")||s.equals("7")||s.equals("8")||s.equals("9")||s.equals("0"))
  		{
   			String s1=t.getText()+s;
   			t.setText(s1);
  		}
  		if(s.equals("+")){
     		   s2=t.getText();
     		   t.setText("");
     		   s3="+";
  		}
  		if(s.equals("-")){
     		   s2=t.getText();
     		   t.setText("");
     		   s3="-";
  		}
  		if(s.equals("*")){
     		   s2=t.getText();
        		   t.setText("");
    		   s3="*";
   		}
  		if(s.equals("/")){
     		   s2=t.getText();
     		   t.setText("");
      		   s3="/";
  		}
  		if(s.equals("=")){
   		   s4=t.getText();
   		   a=Integer.parseInt(s2);
   		   b=Integer.parseInt(s4);
   		   if(s3.equals("+")){
    		      c=a+b;
 		      t.setText(String.valueOf(c));
		   }
   		   if(s3.equals("-")){
   		      c=a-b;
 		      t.setText(String.valueOf(c));
		   }
   		   if(s3.equals("*")){
   		      c=a*b;
		      t.setText(String.valueOf(c));
		   }
   		   if(s3.equals("/")){
   		      c=a/b;			
   		      t.setText(String.valueOf(c));
		   }
  		}
  		if(s.equals("Clear")){
   		   t.setText("");
  		}
	 }
}