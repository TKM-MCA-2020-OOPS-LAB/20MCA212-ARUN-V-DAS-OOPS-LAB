package myprjct;
import java.io.*;

public class co6_4 {
	public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
    	try {
    		FileReader fr= new FileReader("/home/avd/java1/javafolder/Numbers.txt");
    		FileWriter fw1 = new FileWriter("/home/avd/java1/javafolder/even.txt");
    		FileWriter fw2 = new FileWriter("/home/avd/java1/javafolder/odd.txt");
    		System.out.println("Update successfully...."); 
    		int i;
    		while((i=fr.read()) != -1){
    			if(i%2==0)
    		    fw1.write(i);
    		    else
    		    fw2.write(i);
    		}
    		     
    		fr.close();
    		fw1.close();
    		fw2.close();
    	}
    	 catch (IOException e){
				System.out.println("An error occurred"+e);
		}
    }

}
