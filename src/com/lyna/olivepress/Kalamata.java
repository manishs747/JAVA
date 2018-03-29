package com.lyna.olivepress;

public class Kalamata extends Olive {

	public Kalamata() {
		super(2);
		this.name = "Kalamata";
		this.flavor = "Grassy";
		this.color = Olive.BLACK;
	}
	
	/* (non-Javadoc)
	 * @see com.lyna.olivepress.Olive#crush()
	 */
	@Override
	public int crush() {
		System.out.println("crush from subclass Kalamata");
		return super.crush();
	}
	
	
	/**
	 * @return
	 */
	public String getOrigin() {
		return "Greece";
	}
	
	

}
