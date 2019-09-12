package strings;

public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "two";
        switch(str)
        {
            case "one":
                System.out.println("one");
                break;
            case "two":
                System.out.println("two");
            case "three":
                System.out.println("three");
                break;
            default:
                System.out.println("no match");
        }

	}

}
