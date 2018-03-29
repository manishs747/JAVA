package javaPractice.Collection;

import java.util.TreeMap;

public class Romanizer {
	
	private final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();

    static {

        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");

    }

    public final static String toRoman(int number) {
        int l =  map.floorKey(number);
        System.out.println(l);
        if ( number == l ) {
            return map.get(number);
        }
        return map.get(l) + toRoman(number-l);
    }
    
    public static void main(String[] args) {
		
    	//for (int i = 1; i<= 100; i++) {
            System.out.println(6+"\t =\t "+Romanizer.toRoman(11));
       // }
    	
    	
	}

}
