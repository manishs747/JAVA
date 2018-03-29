
public class FalseCeilingArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double total = 0;
		System.out.println("*************DINING********************");
		double dinning = getPOPArea(15, 9, 2);
		 System.out.println();
		 System.out.println("*************LIVING********************");
		 double living = getPOPArea(15, 10, 1.5);
		 System.out.println();
		 
		 System.out.println("*************MASTER********************");
		 double master = getPOPArea(11.75, 10.75, 2);
		 System.out.println();
		 
		 System.out.println("*************GUEST********************");
		 double guest = getPOPArea(10.8, 10.5, 2);
		 System.out.println();
		 
		 
		 total =  dinning + living + master + guest ;
		 System.out.println("FINAL AREA:"+total);
	}
	
	
	
	public static double  getPOPArea(double l,double b,double d){
		
		double area = 0;
		double sidelen = b-(2*d);
		double SQT = (l*d*2) +(sidelen*d*2);
		
		double rftl = l - (2*d);
		double rftb =	sidelen;		
		double RFT = (rftl +rftb)*2*2;
		area = SQT + RFT ;
		System.out.println("SQT AREA: "+SQT);
		System.out.println("RFT AREA: "+RFT);
		System.out.println("TOTAL AREA: " + area);
		return area;
		
	}

}
