package Polymorphisam;

public class Overloading {
	
	void sum(int a,long b){System.out.println(a+b);}  
	  void sum(int a,int b,int c){System.out.println(a+b+c);}  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Overloading obj=new Overloading();  
		 obj.sum(20,20);//now second int literal will be promoted to long  
		 obj.sum(20,20,20);  

	}

}
