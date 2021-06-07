package CO_4.Arithmetic;

import java.util.Scanner;

interface math{
	void find(int x,int y);
}

class add implements math{	
	@Override
	public void find(int x,int y) {
		// TODO Auto-generated method stub
		System.out.println("\nADDITION:\t"+(x+y));
	}
}	

 class sub extends add{
	 public void find(int x,int y) {
		super.find(x,y);
		System.out.println("\nSUBTRACTION:\t"+(x-y));
	}
}
 
 class mul extends sub{	 
	 public void find(int x,int y) {
		 super.find(x,y);
		 System.out.println("\nMULTIPLICATION:\t"+(x*y));
	}	
}
 
 class div extends mul{
	 public void find(int x,int y) {
		 super.find(x,y);
		 System.out.println("\nDIVISION:\t"+(x/y));
	}
}
 
public class operation extends div {	
	public void find(int x,int y) {
		super.find(x,y);
	}
}
