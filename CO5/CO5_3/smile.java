import java.applet.*;
import java.awt.*;
import java.awt.Graphics; 
import java.awt.event.*;

public class smile extends Applet implements ActionListener {
	Label s,m,l1,l2,l3,l4,l5;
    	TextField t1,t2,t3,t4,t5,t6;
    	Button b;
    	public void init(){
		s=new Label("Subjects");
		s.setBounds(50,20,50,20);
		
    		l1 = new Label("English:"); 
		l1.setBounds(50,50,50,20);
    		l2 = new Label("Hindi:");  
		l2.setBounds(50,80,50,20);
    		l3 = new Label("Maths :"); 
		l3.setBounds(50,110,50,20);
    		l4 = new Label("Science:");  
    		l4.setBounds(50,140,50,20);
    		l5 = new Label("Computer:");  
    		l5.setBounds(50,170,70,20);
    		
    		b = new Button("Avg.Marks");  
		b.setBounds(50,200,70,20);
    		setLayout(null);
		
		m=new Label("Marks");
		m.setBounds(200,20,50,20);
    		t1 = new TextField();  
      		t1.setBounds(200,50,50,20);
      		t2 = new TextField();  
      		t2.setBounds(200,80,50,20);
        		t3 = new TextField();
        		t3.setBounds(200,110,50,20);
    		t4 = new TextField(); 
    		t4.setBounds(200,140,50,20);
    		t5 = new TextField(); 
    		t5.setBounds(200,170,50,20);
		t6 = new TextField(); 
    		t6.setBounds(200,200,50,20);
    		
                  		add(s);
		add(m);
        		add(l1);
       		add(l2);
        		add(l3);
        		add(l4);
    		add(l5);
    		
        		add(t1);
        		add(t2);
        		add(t3);
        		add(t4);
        		add(t5);
        		add(t6);
        		add(b);        
        		b.addActionListener(this);   
	}
	public void actionPerformed(ActionEvent e){
    		float m1, m2,m3, m4,m5,avg;
       
        		m1= Float.parseFloat(t1.getText());
        		m2= Float.parseFloat(t2.getText());
        		m3= Float.parseFloat(t3.getText());
        		m4= Float.parseFloat(t4.getText());
        		m5= Float.parseFloat(t5.getText());
        
        		avg=((m1+m2+m3+m4+m5)*100)/500;
        
        		t6.setText(String.valueOf(avg));
        		repaint();
	}
    	public void paint(Graphics g){
       
       	 	float a;
        		a= Float.parseFloat(t6.getText());
        
        		if(a> 50.0) {
		    g.setColor(Color.yellow);
        		    g.fillOval(300,20,200,200);
        		    g.setColor(Color.black);
        		    g.fillOval(350,95,20,20);
        		    g.fillOval(430,95,20,20);
        		    g.setColor(Color.red);
        		    g.fillArc (350,80,100,120,0,-180);
       	 	}
		else {
        	                 	     g.setColor(Color.yellow);
        		    g.fillOval(300,20,200,200);
        		    g.setColor(Color.black);
        		    g.fillOval(350,95,20,20);
        		    g.fillOval(430,95,20,20);
        		    g.setColor(Color.red);
            		    g.drawArc(350,130,100,90,0,180);

        		}
    	}
}