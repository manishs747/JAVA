package javaPractice;

public class CombinationABC {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [] chararr ={'A','B','C'};
       //System.out.println(chararr);
       permute(chararr, 0, 2);
      // System.out.println(chararr);
	}
	
	 public static void  swap(char [] chararr,int x, int y)
	{
	    char temp;
	    temp = chararr[x];
	    chararr[x]= chararr[y];
	    chararr[y] = temp;
	}
	 
	public static void permute(char [] chararr, int i, int n) 
	 {
		 int j;
		 if(i==n){
			 System.out.println(chararr);
		 }
		 else{
			 for(j=i;j<=n;j++){
				 swap(chararr, i, j);
				 permute(chararr, i+1, n);
				 swap(chararr, i, j);//backTrack
			 }
		 }
	 }
	 

}
