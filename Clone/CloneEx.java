package ObjectMetod.Clone;
class Don implements Cloneable {
	int a=90;
	void m() {
		System.out.println("hello My");
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
}
public class CloneEx {
public static void main(String[] args) throws CloneNotSupportedException {
	   System.out.println("Hi Main");
	   System.out.println("Hi Main");
		Don d1=new Don();
		d1.a=30;
		Don d2=(Don)d1.clone();
		d1.a=10;
		System.out.println(d1.a);
		System.out.println(d2.a);
		System.out.println("Bye Main");
}
}
