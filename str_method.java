package javaprjvt;

public class str_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Object";
		String str2="Oriented";
		String str3="";
		
     	System.out.println("***String manipulation***");
     	System.out.println("\nString 1: "+str1+"\nString 2: "+str2);

		System.out.println("\n ***concat() Method***");
		System.out.println("Concating String 1 and String 2: "+str1.concat(str2));
		
		System.out.println("\n ***length()method***");
		System.out.println("Length of String 1 : "+str1.length());
		System.out.println("Length of String 2 : "+str2.length());
		
     	System.out.println("\n ***toLowerCase() method***");
		System.out.println("String 1: "+str1.toLowerCase());
		System.out.println("String 2: "+str2.toLowerCase());
		
     	System.out.println("\n ***toUpperCase() method***");
     	System.out.println("String 1: "+str1.toUpperCase());
     	System.out.println("String 2: "+str2.toUpperCase());

     	System.out.println("\n ***compareTO() method***");
		System.out.println("compare String 1 To String 2: "+str1.compareTo(str2));
		System.out.println("compare String 2 To String 2: "+str2.compareTo(str2));
     	
		System.out.println("\n ***isEmpty() method***");
		System.out.println("String 1 is empty: "+str1.isEmpty());
		System.out.println("String 2 is empty: "+str2.isEmpty());
		System.out.println("String 3 is empty: "+str3.isEmpty());

		System.out.println("\n ***replace() method***");
		System.out.println("Replacing String 1: "+str1.replace("b","w"));
		System.out.println("Replacing String 2: "+str2.replace("t","v"));
		

		System.out.println("\n ***charAt() method***");
		char s=str1.charAt(3);
		System.out.println("Character at Index 3 of: "+str1+"is: "+s);	
		
		System.out.println("\n ***contains() method***");
		System.out.println("String 1: "+str1.contains("j"));
		System.out.println("String 2: "+str2.contains("va"));
		
     	System.out.println("\n ***equal() method***");
		System.out.println("String 1 & String 2 is equal: "+str1.equals(str2));
		System.out.println("String 2 & String 2 is equal: "+str2.equals(str2));
		System.out.println("String 2 & String 3 is equal: "+str2.equals(str3));
		
		

	}

}
