package Singleton;

public enum EnumSingleton {
Instance;
public void show(){
	System.out.println("I am Single Enum");
}

public static void main(String[] args) {
	EnumSingleton.Instance.show();
}
}
