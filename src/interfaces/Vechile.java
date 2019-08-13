package interfaces;

public interface Vechile {
	// all are the abstract methods. 
	int price = 50;  //by default data member in interface is final and static and public
    public abstract void changeGear(int a);  //method abstract and public
    void speedUp(int a); 
    void applyBrakes(int a);
}
