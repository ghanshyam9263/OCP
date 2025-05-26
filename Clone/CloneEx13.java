package ObjectMetod.Clone;

class A1 implements Cloneable {
    int i = 10;
    B1 b = new B1();

    public A1 clone() throws CloneNotSupportedException {
        A1 a2 = (A1) super.clone();
        a2.b = (B1) b.clone();
        return a2;
    }
}

class B1 implements Cloneable {
    int j = 20;

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class CloneEx13 {
public static void main(String[] args) throws CloneNotSupportedException  {
	 A1 a1 = new A1();
     A1 a2 = a1.clone();
     a2.b.j = 999;

     System.out.println(a1.b.j);
}
 
}
