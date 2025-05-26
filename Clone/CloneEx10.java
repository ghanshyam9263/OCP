package ObjectMetod.Clone;
class AA implements Cloneable {
    private int val = 5;

    public Object clone() throws CloneNotSupportedException  {
        return super.clone();
    }
}

public class CloneEx10 {
public static void main(String[] args)  {
	
	 AA a1 = new AA();
    // AA a2 = (AA) a1.clone();	//error
}
 
}
