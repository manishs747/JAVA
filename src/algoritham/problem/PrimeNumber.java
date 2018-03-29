package algoritham.problem;

import java.util.ArrayList;

public class PrimeNumber {
	
	//Given a number n, print all primes smaller than or equal to n
	//if n is 10, the output should be “2, 3, 5, 7″. If n is 20, the output should be “2, 3, 5, 7, 11, 13, 17, 19″
	static void SieveOfEratosthenes(int n)
	{
		ArrayList<Integer> prime = new ArrayList<Integer>();
		for(int p=2;p*p<=n;p++){
			if(!prime.contains(p)){
				prime.add(p);
			}
		}	
		System.out.println(prime);
	}

	public static void main(String[] args) {
		
		int n = 10;
	   System.out.println("Following are the prime numbers smaller ");
	   SieveOfEratosthenes(n);
	}

}
