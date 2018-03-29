package com.lyna.olivepress;

public class Olive {
	
	
	public static final long BLACK = 0X000000;
	public static final long GREEN = 0X0FF000;
	
	public String name = "Kalamata";
	public String flavor = "Grassy";
	public long color = Olive.BLACK;
	private int oil = 3;
	protected boolean crushed=false;
	
	
	
	public Olive(){
		System.out.println("Constructor is called For: OLIVE CLASS");
	}
	
	
	
	public int getOil() {
		return oil;
	}



	public void setOil(int oil) {
		this.oil = oil;
	}



	public Olive(int oil) {
		super();
		this.oil = oil;
	}



	public int crush(){
		System.out.println("ouch From Olive!!");
		return oil;
	}

}
