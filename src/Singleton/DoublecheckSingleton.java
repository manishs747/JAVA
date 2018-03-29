package Singleton;

public class DoublecheckSingleton {
	private static volatile DoublecheckSingleton _instance;
	
	public static DoublecheckSingleton getInstance(){
		if(_instance==null){
			synchronized(DoublecheckSingleton.class){
				_instance=new DoublecheckSingleton();
			}
		}
		return _instance;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
