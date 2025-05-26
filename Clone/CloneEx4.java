package ObjectMetod.Clone;

class Address1 {
    String city;
    Address1(String city) {
        this.city = city;
    }
}
class Person1 implements Cloneable {
    int age;
    Address1 address;

    public Person1(int age, Address1 address) {
        this.age = age;
        this.address = address;
    }

    public Object clone() throws CloneNotSupportedException {
        Person1 cloned = (Person1) super.clone();
        cloned.address = new Address1(this.address.city); // 🔁 Deep copy
        return cloned;
    }
}


public class CloneEx4 {
public static void main(String[] args) throws CloneNotSupportedException {
	Person1 p1 = new Person1(25, new Address1("Delhi"));
	Person1 p2 = (Person1) p1.clone();
	p1.address.city = "Mumbai";

	System.out.println(p2.address.city); //Delhi (unchanged)


 
}
}
