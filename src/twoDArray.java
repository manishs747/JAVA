
public class twoDArray {
	public static void main(String[] args) {
		
		String [][]  states =new String[3][2];
		states[0][0] ="bihar";
		states[0][1] ="patna";
		states[1][0] ="Karnataka";
		states[1][1] ="banglore";
		states[2][0] ="tamilnadu";
		states[2][1] ="chennai";
		
		for (int i = 0; i < states.length; i++) {
			StringBuilder sb =new StringBuilder();
			for (int j = 0; j < states[i].length; j++) {
				if(j==0){
					sb.append("the capital of ");
				}
				else{
					sb.append(" is ");
				}
				sb.append(states[i][j])	;
			}
			System.out.println(sb);
		}
		
		
		
		
		
		
		
		
		
	}

}
