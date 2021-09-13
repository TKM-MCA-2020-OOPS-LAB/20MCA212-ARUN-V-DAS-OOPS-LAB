package myprjct;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
public class co6_2 {

	public static void main(String[] args)
	{
		try 
		{
			File file = new File("/home/avd/java1/test.txt");
			FileWriter fw = new FileWriter(file);
			fw.write("Hello World!!");
		
			fw.close();
			
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			System.out.println("file content: "); 
            String line;
            while((line = br.readLine()) != null)
            {
                System.out.println(line);
            }
			fr.close();	
		}
		catch (IOException e)
		{
			System.out.println("An error occurred");
		}
	}
}
