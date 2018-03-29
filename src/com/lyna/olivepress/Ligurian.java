package com.lyna.olivepress;

public class Ligurian extends Olive {

	public Ligurian() {
		super(1);
		this.name = "Ligurian";
		this.flavor = "Yummy";
		this.color = Olive.GREEN;
	}

	@Override
	public int crush() {
		System.out.println("crush from subclass Ligurian");
		return super.crush();
	}
	
	public String getOrigin() {
		return "England";
	}
}
