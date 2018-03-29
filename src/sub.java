
public class sub extends parent {
   /* static {
        foo = "bar";
    }*/

    public static void main (String[] args) {
    	sub.foo = "bar";
        System.out.println(parent.foo);
    }
}
