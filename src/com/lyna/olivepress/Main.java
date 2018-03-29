package com.lyna.olivepress;

import java.util.ArrayList;
import java.util.List;

/**
 * @author arvind
 *
 */
public class Main {

	/**
	 * @param args
	 * @author Manish
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Olive> olives = new ArrayList<Olive>();
		Olive olive;
		
		olive = new Kalamata();
		System.out.println(olive.name);
		olives.add(olive);
		
		olive = new Ligurian();
		System.out.println(olive.name);
		olives.add(olive);
		
		olive = new Kalamata();
		System.out.println(olive.name);
		olives.add(olive);
		
		
		//Olive[] olives = {new Olive(),new Olive(),new Olive()};
		OlivePress olivepress = new OlivePress();
		
		olivepress.getOil(olives);
		
		System.out.println("You got :"+olivepress.getTotlaOil() + " unit of oil");
		
  /*       olivepress.getOil(olives);
		
		System.out.println("You got :"+olivepress.getTotlaOil() + " unit of oil");*/
		
		
	}

}
