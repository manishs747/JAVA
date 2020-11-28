package inheritance.lynda;

import java.util.List;

public class OlivePress {

	public int getOil(List<Olive> olives) {
		int totalOil = 0;
		for (Olive o : olives) {
			totalOil += o.crush();
		}
		return totalOil;
	}

}
