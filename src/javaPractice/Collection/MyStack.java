package javaPractice.Collection;

import java.util.LinkedList;

public class MyStack {
private LinkedList  list = new LinkedList();
public void push1(Object o){
	list.addFirst(o);
}

public void push2(Object o){
	list.addLast(o);
}

public Object bottom(){
	return list.getLast();
}

public Object pop(){
	return list.removeFirst();
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car mycar;
		Bird mybird;
		MyStack s= new MyStack();
		s.push1(new Car());
		s.push2(new Bird());
		mycar=(Car) s.pop();
		System.out.println("Fisrt element of the List:" + mycar.car1);
		mybird = (Bird) s.bottom();
		System.out.println("Last element in the list:"+mybird.bird1);
		
		
		

	}

}
