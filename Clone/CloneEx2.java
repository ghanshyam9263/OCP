package ObjectMetod.Clone;
class Don1  {   // Runtime error (CloneNotSupportedException) , Cloneable   
	int a=90;
	void m() {
		System.out.println("hello My");
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
}
public class CloneEx2 {
public static void main(String[] args) throws CloneNotSupportedException {
	   System.out.println("Hi Main");
	   System.out.println("Hi Main");
		Don1 d1=new Don1();
		d1.a=40;
		Don1 d2=(Don1)d1.clone();
		d1.a=20;
		System.out.println(d1.a);
		System.out.println(d2.a);
		System.out.println("Bye Main");
}
}
