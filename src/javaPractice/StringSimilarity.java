package javaPractice;

public class StringSimilarity {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String name = "ababaa";
		char [] A=name.toCharArray();
		char [] B = new char[10];
		/*System.arraycopy(A, 0, B, 0, A.length);
		System.out.println("B"+B[0]+","+B[1]);*/
		calcSimilarity(A);
	}

	
	public static int calcSimilarity(char[] A){
		int count=0;
		for (int i = 0; i < A.length; i++) {
			for (int k=0,j = i; j < A.length; j++,k++) {
				//System.out.println("k:" + k + " j:"+j);
				if(A[k]==A[j]){
					count++;
				}
				else{
					break;
				}
			}
			System.out.println("Count:"+ count);
		}
	
		System.out.println("Final Count:"+ count);
		return count;
	}
}
