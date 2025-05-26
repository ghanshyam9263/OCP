package ObjectMetod.Clone;

class SecretData implements Cloneable {
    private String password = "1234";

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getPassword() {
        return password;
    }
}
public class CloneEx11 {
public static void main(String[] args) throws CloneNotSupportedException  {
	  SecretData d1 = new SecretData();
      SecretData d2 = (SecretData) d1.clone();

      System.out.println(d2.getPassword());
	
}
 
}
