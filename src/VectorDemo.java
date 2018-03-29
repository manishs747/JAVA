import java.util.Enumeration;
import java.util.Vector;


public class VectorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Vector v =new Vector(3,2);
		
		Vector v= new Vector<Integer>();
		System.out.println("Initial size: "+ v.size());
		System.out.println("Initial capacity: "+ v.capacity());
		v.addElement(new Integer(1));
		v.addElement(new Integer(2)); 
		v.addElement(new Integer(3));
		v.addElement(new Integer(4));
		v.addElement(new Integer(1));
		v.addElement(new Integer(2)); 
		v.addElement(new Integer(3));
		v.addElement(new Integer(4));
		v.addElement(new Integer(1));
		v.addElement(new Integer(2)); 
		v.addElement(new Integer(3));
		v.addElement(new Integer(4));
		System.out.println("Capacity after four additions: "+ v.capacity()); 
		//v.addElement(new DefaultR(5.45)); 
		System.out.println("Current capacity: "+ v.capacity());
		//v.addElement(new DefaultR(6.08));
		v.addElement(new Integer(7));
		
		System.out.println("Current capacity: "+ v.capacity());
		v.addElement(new Float(9.4));
		v.addElement(new Integer(10));
		System.out.println("Current capacity: "+ v.capacity()); 
		v.addElement(new Integer(11));
		v.addElement(new Integer(12));
		System.out.println("First element: "+ (Integer)v.firstElement());
		System.out.println("Last element: "+ (Integer)v.lastElement()); 
		if(v.contains(new Integer(3))) 
			System.out.println("Vector contains 3."); 
		// enumerate the elements in the vector.
		Enumeration vEnum = v.elements();
		System.out.println("\nElements in vector:");
		while(vEnum.hasMoreElements()) 
			System.out.print(vEnum.nextElement()+" "); 
		System.out.println();
		     } 
	

	}


