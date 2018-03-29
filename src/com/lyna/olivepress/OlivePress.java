package com.lyna.olivepress;

import java.util.List;

public class OlivePress {

	private int totlaOil=0;
	
	public int getTotlaOil() {
		return totlaOil;
	}
	
	private void setTotlaOil(int totlaOil) {
		this.totlaOil += totlaOil;
	}

	public void getOil(List<Olive> olives){
		int oil = 0;
		for (Olive olive : olives) {
			oil += olive.crush();
		}
		
		setTotlaOil(oil);
	}
}
