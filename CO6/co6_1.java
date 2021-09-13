package myprjct;
import java.io.File;
import java.util.Scanner;
public class co5_1 {
	
	  public static void main(String[] args) {

	    File file = new File("/home/avd/java1");
	    String[] fileList = file.list();
	   
	    for(String str : fileList) {
	      System.out.println(str);
	    }
	    
	    for(int i=0; i < fileList.length; i++){	
	    	System.out.println("\nSearch a file:");
	    	Scanner sc=new Scanner(System.in);
	    	String name = sc.next();
	    	String filename  = fileList[i];
	    	
			if (filename.equals(name)){
	                System.out.println("Given file is existed");
	                
				}
			else {
				    System.out.println("Given file doest not existed");
				}	
			
	   }
	}
}