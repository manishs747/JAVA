package javaPractice.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit pineappale = new Fruit("Pineapple", "Pineapple description",100); 
		Fruit apple = new Fruit("Apple", "Apple description",70); 
		Fruit orange = new Fruit("Orange", "Orange description",80); 
		Fruit banana = new Fruit("Banana", "Banana description",90); 
		
		List<Fruit> list = new ArrayList<Fruit>();
		list.add(pineappale);
		list.add(apple);
		list.add(orange);
		list.add(banana);
		//System.out.println("Original:" + list);
		
		String s ="manish";
		System.out.println(s.intern());
		
		//Collections.sort(list);
		
		//Sort Fruit array based on its “fruitName” property in ascending orde
		//Comparator  var = Collections.reverseOrder();//to reverse in reverse order
		
		//Collections.sort(list);
		
		
		//Collections.sort(list,Fruit.FruitNameComparator);
		Collections.sort(list);//compare is implemented
		
		System.out.println("SortedonName:" + list);
		
		 HashMap<String, String> h = new HashMap<String, String>();
		 h.put("a", "b");
		 h.get("a");
		
	}

}
