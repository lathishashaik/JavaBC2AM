package Package2;
import Package1.*;
public class Asub extends A  {
	
	public static void main(String[]args) {
		//1.no modifier
	  //VALID as this class is present in same package
		/*C obj1=new C();
		System.out.println(obj1.default_message+" I'm in Asub");*/
		
		//2.public
		//VALID ..All packages within the project folder can have the access if public
		//NOTE:if class is not public only within package is accessible
		/*C obj2=new C();
		System.out.println(obj2.public_message+" I'm in Asub");*/
		
		//3.protected
		//VALID.....belongs to different package but a SUBCLASS
		/*Asub obj3=new Asub();//Asub not A     !!!!ATTENTION
		System.out.println(obj3.protected_message+" I'm in Asub");*/
		
		//4.private
		//ERROR.....DOESNOT belongs to SAME CLASS i.e  within a class;
		//C obj4=new C();
		//System.out.println(obj4.private_message+" I'm in sub");
		
	
	}
}
