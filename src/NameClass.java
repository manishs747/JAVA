
public class NameClass implements Comparable<NameClass> {
   public  String name;
   
   public NameClass(String name) {
	   this.name=name;
   }
   
  




@Override
public int compareTo(NameClass o) {
	String s1=this.name;
	String s2=o.name;
	System.out.println("s1:"+s1+" s2:"+s2);
	return s1.compareTo(s2);
}  
}
