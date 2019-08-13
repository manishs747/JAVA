package MutliThreading.syncronise.baeldung;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;

public class BaeldungSynchronizedMethods {
	private int sum = 0;
	public synchronized void calculate() {
		setSum(getSum() + 1);
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	
	
	
	@Test
	public void givenMultiThread_whenNonSyncMethod() throws InterruptedException {
	    ExecutorService service = Executors.newFixedThreadPool(3);
	    BaeldungSynchronizedMethods summation = new BaeldungSynchronizedMethods();
	 
	    IntStream.range(0, 1000)
	      .forEach(count -> service.submit(summation::calculate));
	    service.awaitTermination(1000, TimeUnit.MILLISECONDS);
	 
	    assertEquals(1000, summation.getSum());
	}

}
