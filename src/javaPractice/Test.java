package javaPractice;

import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Vector;

public class Test {
	 int i;
	 Integer I;
	 boolean b;
	 long l;
	 double d;
	 
	public  class testchild{
		 public void p(){
			 System.out.println("hello Child");
		 }
	 }
	
	public static final void main(String[] args) {
		
		
		Test t = new Test();
		Test.testchild  tc =t.new testchild();
		
		
		
		
		 HashMap<String, String> hash = new HashMap<String, String>();
		 hash.put("a", "b");
		 hash.remove("b");
		 hash.get("a");
		 System.out.println(hash);
		 Iterator it =hash.keySet().iterator();
		  Set<String> u = hash.keySet();
		  Set<Entry<String, String>> v = hash.entrySet();
		 
		 
		 LinkedList<String> l= new LinkedList<String>();
		 l.add("manish");
		 l.add("raj");
		 l.contains("raj");
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("Integer:" + t.i+ " INT CLASS:"+t.I + " bool:"+t.b+" long:"+t.l+"double:"+t.d);
		Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
		Vector vt = new Vector<Integer>();
		String s = null;
		//s=s+"";
		if(s==null)
		{
			System.out.println("S is NULL");
		}
		
		
		Object o=new Object();
		System.out.println(" clas:"+ o.toString());
		
		ThreadMain k = new ThreadMain();
		boolean vk = t instanceof Test;
		System.out.println(t instanceof Test);
		int [] num = {1,2,3,4,5,6,7,8};
		
		
		HashMap h = new HashMap<String, String>();
		h.put("raj","singh");
		
		String  m = "Manish";
		m.contains("ani");
		
		for (int i = 0; i < num.length; i++) {
			if(num[i]==5){
				break;
			}
			num[i]=num[i]*10;
			printArray(num);
		}
	}

	
	
	 static void printArray(int[] ar) {
         for(int n: ar){
            System.out.print(n+" ");
         }
           System.out.println("");
      }
}
