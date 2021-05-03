package oops;

public class complex {
	    int real;
	    int img;
	    public complex(){}
	    public complex(int r,int i){
	    real=r;
	    img=i;
	    }
	    public void show()
	    {
	         System.out.println(real+"+"+img+"i"); 
	    }
	    public void sum(complex o1,complex o2)
	    
	    {
	    real=o1.real+o2.real;
	    img=o1.img+o2.img;
	     System.out.println("Sum of Two Complex No.:"+real+"+"+img+"i"); 
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 complex c1=new complex(5,3);
	     System.out.println("First Complex No.:"); 
	     c1.show();
	     complex c2= new complex(2,4);
	     System.out.println("Second Complex No:"); 
	     c2.show();
	     complex c3= new complex();
	     c3.sum(c1,c2);
	   }
}
