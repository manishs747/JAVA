package javaPractice;

public class Calculation {
	void sum(int a,long b){
	System.out.println("method 1");	
	}
     void sum(long a,int b){
	System.out.println("method 1");	
	}
     
     void sum(double d){
    	 System.out.println("double");
     }
     

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation c = new Calculation();
		//c.sum(5, 6);gives errror 
		c.sum(4);//works
	}

}
