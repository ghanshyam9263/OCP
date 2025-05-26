package ObjectMetod.Clone;

class A2 implements Cloneable {
    int x = 5;
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class CloneEx14 {
public static void main(String[] args) throws CloneNotSupportedException {
    A2 a1 = new A2();
    A2 a2 = (A2) a1.clone();
    a2.x = 10;
    System.out.println(a1.x);

	
}
 
}
