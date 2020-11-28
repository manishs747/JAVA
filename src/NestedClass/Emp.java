package NestedClass;

public class Emp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  person p =new person(){
	  void eat(){
		  System.out.println("nice fruits");
	  }
  };
  
  p.eat();
	}

}
