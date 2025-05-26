package ObjectMetod.Clone;

class Engine {
    int power = 100;
}

class Car implements Cloneable {
    int speed = 80;
    Engine engine = new Engine();

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class CloneEx5 {
public static void main(String[] args) throws CloneNotSupportedException {
	 Car c1 = new Car();
     Car c2 = (Car) c1.clone();
     
     c1.engine.power = 200;

     System.out.println(c2.engine.power);
 
}
}
