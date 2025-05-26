package ObjectMetod.Clone;
class A {
    int x = 5;
}

class B extends A implements Cloneable {
    int y = 10;

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class CloneEx7 {
public static void main(String[] args) throws CloneNotSupportedException {
	
	 B b1 = new B();
     B b2 = (B) b1.clone();

     b1.x = 100;
     b1.y = 200;

     System.out.println(b2.x + " " + b2.y);
	
}
 
}
