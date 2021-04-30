package product;
	 public class product {
	  int pcode;
	  String pname;
      int price;
	public static void main(String[] args) {
	  product obj1=new product();
	  obj1.pcode=111;
	  obj1.pname="DELL";
	  obj1.price=45000;
	  product obj2=new product();
	  obj2.pcode=112;
	  obj2.pname="HP";
	  obj2.price=35000;
	  product obj3=new product();
	  obj3.pcode=113;
	  obj3.pname="LENOVO";
	  obj3.price=30000;
	  if(obj1.price<=obj2.price && obj1.price<=obj3.price)
	  System.out.println(obj1.pname+" is cheaper than "+obj2.pname+" and "+obj3.pname);
	  else if(obj2.price<=obj1.price && obj2.price<=obj3.price)
	  System.out.println(obj2.pname+" is cheaper than "+obj1.pname+" and "+obj3.pname);
	  else
	  System.out.println(obj3.pname+" is cheaper than "+obj1.pname+" and "+obj2.pname);
	      // TODO Auto-generated method stub
	}			 
   }
	


