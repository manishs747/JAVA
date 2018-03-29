
public class DobleCheckSingleton {

	
	private static volatile DobleCheckSingleton _instance; 
	public static DobleCheckSingleton getInstance()
	{ if(_instance == null)
	{ synchronized(DobleCheckSingleton.class){ if(_instance == null)
		_instance = new DobleCheckSingleton();
	} 
	} 
	return _instance; }
	
	public static void main(String[] args) {
		
		DobleCheckSingleton d =DobleCheckSingleton.getInstance();
		
	}
}

	

