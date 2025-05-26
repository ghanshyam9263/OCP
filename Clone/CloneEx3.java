package ObjectMetod.Clone;
class Address {
    String city;
    int a;
    Address(String city,int a) {
        this.city = city;
    }
}

class Person implements Cloneable {
    int age;
    Address address;

    public Person(int age, Address address) {
        this.age = age;
        this.address = address;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // shallow copy
    }
}

public class CloneEx3 {
public static void main(String[] args) throws CloneNotSupportedException {
	Person p1 = new Person(25, new Address("Delhi",20));
	Person p2 = (Person) p1.clone();
	p1.address.city = "Mumbai";

	System.out.println(p2.address.city); 
 
}
}
