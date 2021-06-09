package CO_4;

import java.util.Scanner;

class UserException extends Exception{
	public UserException(String a) {
		super(a);
    }
}
class PassException extends Exception{
	public PassException(String a) {
		super();
	}
}

public class CO4_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String usr,pass;
	while(true) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter UserName:");
		usr=sc.nextLine();
		System.out.println("Enter Password:");
		pass=sc.nextLine();
	try {
		
		if(!usr.equals("arun")) 
			throw new UserException("\nInvalid UserName! Try Again !\n");
		else if(!pass.equals("12345")) 
			throw new PassException("\nInvalid Password! Try Again !\n");
		else 
			System.out.println("*****Login Successful*****");
			break;
	}
	catch(UserException u) {
		System.out.println("Exception occured.."+u);
	}
	catch(PassException p) {
		System.out.println("Exception occured.."+p);
	}
   }
  }
}

