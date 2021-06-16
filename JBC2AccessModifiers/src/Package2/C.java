package Package2;
import Package1.*;
public class C {
	//1.No modifier
	//	String default_message="This is a default modifier";
	
	//2.public
	public String public_message="This is a public modifier";
//NOTE:if class is not public only within package is accessible
	
	//3.protected
	//ERROR.....belongs to different package and not a subclass
	/*public static void main(String[]args) {
		A obj3=new A();
		System.out.println(obj3.protected_message+" I'm in C");
	}*/
	public static void main(String[]args) {
		//4.private
		//ERROR.....DOESNOT belongs to SAME CLASS i.e  within a class;
		//C obj4=new C();
		//System.out.println(obj4.private_message+" I'm in C");
	}
	

}
