package myprjct;
import java.io.*;
public class copyfile {
	    public static void main(String[] args) throws IOException{
	        // TODO Auto-generated method stub
	    	try {
	    		FileReader fr= new FileReader("/home/avd/java1/javafolder/file1.txt");
	    		FileWriter wr =new FileWriter("/home/avd/java1/javafolder/file2.txt",true);
	    		int i;
	    		while((i= fr.read()) !=-1){
	    			wr.write(i);
	    		}
	    		System.out.println("Copied Successfully..");
	    		fr.close();
	    		wr.close();
	    	}
	        catch (IOException e){
				System.out.println("An error occurred"+e);
			}

	    }
}