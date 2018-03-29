import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class Invest {
	public static void main(String[] args) {

		Float principalAmount = new Float(0);
		Float interestRate = new Float(0);
		int numYear = 0;

		try {
			InputStreamReader istream = new InputStreamReader(System.in) ;
			BufferedReader bufRead = new BufferedReader(istream) ;
			System.out.print("Enter Principal Amount :");
			System.out.flush();
			String principalString = bufRead.readLine();
			principalAmount = Float.valueOf(principalString);

			System.out.print("Enter Interest Rate :");
			System.out.flush();

			String interestRates = bufRead.readLine();
			interestRate = Float.valueOf(interestRates);

			System.out.print("Enter No of YEAR :");
			System.out.flush();
			String yearString = bufRead.readLine();
			numYear = Integer.parseInt(yearString);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		float value = loan(principalAmount, interestRate, numYear);
		System.out.println("final value " + value);
	}

	static float loan (float p,float r,int n){
		int year = 1;
		float sum = p;
		while (year <= n) {

			sum = sum * (1+ r);
			year =  year + 1;
		}
		return sum;
	}

}


