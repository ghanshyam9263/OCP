package ObjectMetod.Clone;
class Animal1 {
    int legs = 4;
}

class Dog1 extends Animal1 implements Cloneable {
    int tail = 1;

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class CloneEx12 {
public static void main(String[] args) throws CloneNotSupportedException  {
	 Dog1 d1 = new Dog1();
     Dog1 d2 = (Dog1) d1.clone();
     System.out.println(d2.legs + " " + d2.tail); 
}
 
}
