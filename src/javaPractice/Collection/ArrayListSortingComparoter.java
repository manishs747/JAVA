package javaPractice.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class ArrayListSortingComparoter {
	
	private static class SmartPhone implements Comparable {
        private String brand;
        private String model;
        private int price;

        public SmartPhone(String brand, String model, int price){
            this.brand = brand;
            this.model = model;
            this.price = price;
        }
      
        public int compareTo(SmartPhone sp) {
            return this.brand.compareTo(sp.brand);
        }

        @Override
        public String toString() {
            return "SmartPhone{" + "brand=" + brand + ", model=" + model + ", price=" + price + '}';
        }

		@Override
		public int compareTo(Object o) {
			// TODO Auto-generated method stub
			return 0;
		}
      
    }
  
    private static class PriceComparator implements Comparator<SmartPhone>{

       
        public int compare(SmartPhone sp1, SmartPhone sp2) {
            return (sp1.price < sp2.price ) ? -1: (sp1.price > sp2.price) ? 1:0 ;
        }

	/*	@Override
		public int compare(SmartPhone o1, SmartPhone o2) {
			// TODO Auto-generated method stub
			return 0;
		}
      */
    }

    @SuppressWarnings("unchecked")
	public static void main(String... args) {
      
        //creating objects for arraylist sorting example
        SmartPhone apple = new SmartPhone("Apple", "IPhone4S",1000);
        SmartPhone nokia = new SmartPhone("Nokia", "Lumia 800",600);
        SmartPhone samsung = new SmartPhone("Samsung", "Galaxy Ace",800);
        SmartPhone lg = new SmartPhone("LG", "Optimus",500);
      
        //creating Arraylist for sorting example
        ArrayList<SmartPhone> smartPhones = new ArrayList<SmartPhone>();
      
        //storing objects into ArrayList for sorting
        smartPhones.add(apple);
        smartPhones.add(nokia);
        smartPhones.add(samsung);
        smartPhones.add(lg);
      
        smartPhones.sort(new PriceComparator());
        //Sorting Arraylist in Java on natural order of object
        Collections.sort(smartPhones);
      
        //print sorted arraylist on natural order
        System.out.println(smartPhones);
      
        //Sorting Arraylist in Java on custom order defined by Comparator
        Collections.sort(smartPhones,new PriceComparator());
      
        //print sorted arraylist on custom order
        System.out.println(smartPhones);
        
     
        
    
    }

}
