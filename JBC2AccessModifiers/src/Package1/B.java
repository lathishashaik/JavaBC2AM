package Package1;
import Package2.*;
public class B {

	
	public static void main(String[]args) {
	
	//(1).No modifier:Gives ERROR as accessible only within same package
	/*C obj1=new C();
	System.out.println(obj1.default_message+" I'm in B");*/
	
	//(2)public 
		//VALID ..All packages within the project folder can have the access if public
		//NOTE:if class is not public only within package is accessible
		/*C obj2=new C();
		System.out.println(obj2.public_message+" I'm in B");*/
		
		//3.protected
		//VALID.......belongs to same package no need of being same class
		/*A obj3=new A();
		System.out.println(obj3.protected_message+" I'm in B");*/
		
  }
	//4.private
	//VALID.....belongs to SAME CLASS i.e  within a class
	private String private_message="This is a private modifier";
}
