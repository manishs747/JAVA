package threads;

public class FortuneCookies implements Runnable{
	String first;
	String second;
	int sleepytime;
	
	
	
	public FortuneCookies(String first, String second, int sleepytime) {
		super();
		this.first = first;
		this.second = second;
		this.sleepytime = sleepytime;
	}



	public String getFirst() {
		return first;
	}



	public void setFirst(String first) {
		this.first = first;
	}



	public String getSecond() {
		return second;
	}



	public void setSecond(String second) {
		this.second = second;
	}



	public int getSleepytime() {
		return sleepytime;
	}



	public void setSleepytime(int sleepytime) {
		this.sleepytime = sleepytime;
	}



	public  void run() {
		int count = 0;
		while(count < 7){
			   System.out.println(Thread.currentThread().getName()+ "  start" + count);
			   try {
				Thread.sleep(sleepytime);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+ "  ENDS" + count);
		
			count++;
		}

	}

}
