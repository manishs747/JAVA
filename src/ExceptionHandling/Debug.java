package ExceptionHandling;

import java.net.URI;
import java.net.URISyntaxException;


//F5  steps ech line
//F8 each breack point
//f6 goes inside methods
//f7 to get out of method




public class Debug {
	
	public static void main(String[] args) {
		/*try {
			URI url = new URI("http:\\somecomany.com");
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}*/
	int n =0;
	int ns =  1;
		for (int i = 1; i < 8; i++) {
			n = n+i;
			ns = square(n, ns);
		}
		
		
	}

	public static int square(int n, int ns) {
		ns= ns*n;
		return ns;
	}

}
