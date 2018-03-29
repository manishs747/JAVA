package javaPractice;

public class SimpleQuestion {

	static boolean yesOrNO(String s){
		s=s.toLowerCase();
		if(s.equals("yes")||s.equals("y")||s.equals("t")){
			s="true";
		}
		return Boolean.getBoolean(s);
		//return Boolean.parseBoolean(s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(System.getenv("TMP"));
      System.out.println(yesOrNO("true") + " :" + yesOrNO("yes"));
	}

}
