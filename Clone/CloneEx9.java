package ObjectMetod.Clone;
class Vehicle implements Cloneable {
    private int id;

    public Vehicle(int id) {
        this.id = id;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public int getId() {
        return id;
    }
}

public class CloneEx9 {
public static void main(String[] args) throws CloneNotSupportedException {
	 Vehicle v1 = new Vehicle(1);
     Vehicle v2 = (Vehicle) v1.clone();

     System.out.println(v2.getId());
	
}
 
}
