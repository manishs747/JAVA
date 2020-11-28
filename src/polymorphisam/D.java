package polymorphisam;

public class D  extends A{
   
	int data = 10;
	int m1(){
		//System.out.println("In B data :" + data);
		System.out.println("B M1 method data:" + data );
		return this.data;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A ab = new B();
		A ad = new D();
		ab.data = 1;
		ad.data=2;
		System.out.println(ab.data);
		System.out.println(ad.data);
		
		
		
		

	}

}

