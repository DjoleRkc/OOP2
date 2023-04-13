package kafic;

import java.util.ArrayList;
import java.util.List;

public class KartaPica {
	
	List<Pice> list;

	public KartaPica() {
		list = new ArrayList<>();
	}
	
	public KartaPica dodajPice(Pice p) throws GPostoji {
		for (Pice pice : list) {
			if(p.equals(pice)) throw new GPostoji();
		}
		list.add(p);
		return this;
	}
	
	public int getBrojPica() {
		return list.size();
	}
	
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GAZIRANI SOKOVI\n");
		if (list != null) {
			for (Pice pice : list) {
				if (pice.getOznaka() == 'G') {
					builder.append(pice + "\n");
				}
			}
			
			builder.append("NEGAZIRANI SOKOVI\n");
			
			for (Pice pice : list) {
				if (pice.getOznaka() == 'N') {
					builder.append(pice + "\n");
				}
			}
		}
		
		return builder.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
