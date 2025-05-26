package ObjectMetod.Clone;
class Animal {
    int age = 3;
}

class Dog extends Animal implements Cloneable {
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class CloneEx8 {
public static void main(String[] args) throws CloneNotSupportedException {
	 Dog d1 = new Dog();
     Dog d2 = (Dog) d1.clone();

     d1.age = 5;

     System.out.println(d2.age);	
	
	
}
 
}
