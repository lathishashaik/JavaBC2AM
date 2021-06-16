package Package1;
import Package2.*;
//(1).No modifier (2)public (3)protected (4)private

public class A {
	
public static void main(String[]args) {
	
	//(1).No modifier:Gives ERROR as accessible only within same package
	//C obj1=new C();
	//System.out.println(obj1.default_message+" I'm in A");
	
	//(2)public 
	//VALID ..All packages within the project folder can have the access if public
	  //NOTE:if class is not public only within package is accessible
		//C obj2=new C();
		//System.out.println(obj2.public_message+" I'm in A");
	
		 //4.private
	//ERROR.....DOESNOT belongs to SAME CLASS i.e  within a class;
	//C obj4=new C();
	//System.out.println(obj4.private_message+" I'm in A");

		

  }
	//3.protected
	//protected String protected_message="This is a protected modifier";

}
