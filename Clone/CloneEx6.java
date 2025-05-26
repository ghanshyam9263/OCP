package ObjectMetod.Clone;
class Box implements Cloneable {
    int[] items = {1, 2, 3};

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class CloneEx6 {
public static void main(String[] args) throws CloneNotSupportedException {
	 Box b1 = new Box();
     Box b2 = (Box) b1.clone();

     b1.items[0] = 99;

     System.out.println(b2.items[0]);
 }
 
}
