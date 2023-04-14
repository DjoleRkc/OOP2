package skijanje;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Staza {
	private List<Deonica> list;
	private String naziv;
	
	public Staza(String naziv) {
		this.list = new ArrayList<>();
		this.naziv = naziv;
	}
	
	
	
	public Staza dodaj(Deonica d) {
		list.add(d);
		return this;
	}
	
	public int broj() {
		return list.size();
	}
	
	public double duzina() {
		double sum = 0;
		for (Deonica deonica : list) {
			sum += deonica.duzina();
		}
		
		return sum;
	}
	
	public double nagib() {
		double max = Double.MIN_VALUE;
		for (Deonica deonica : list) {
			if (deonica.nagib() > max) max = deonica.nagib();
		}
		
		return max;
	}
	
	public char oznaka() throws GOznaka {
		if(list.isEmpty()) throw new GOznaka();
		int max = Integer.MIN_VALUE;
		char oznaka = ' ';
		for (Deonica deonica : list) {
			if(Collections.frequency(list, deonica) > max) {
				max = Collections.frequency(list, deonica);
				oznaka = deonica.oznaka();
			}
		}
		
		return oznaka;
	}
	
	public double brzina(double pocetna) {
		double krajnja = pocetna;
		for (Deonica deonica : list) {
			krajnja = deonica.brzina(krajnja);
		}
		return krajnja;
	}
	
	public double vreme(double pocetna) {
		double krajnja=  pocetna;
		double krajnjeVreme = 0;
		for (Deonica deonica : list) {
			krajnjeVreme += deonica.vreme(krajnja);
			krajnja = deonica.brzina(krajnja);
		}
		
		return krajnjeVreme;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(naziv + "|" + broj() + "|" + duzina() + "|" + nagib() + "\n");
		builder.append("[");
		for (int i = 0; i < list.size(); i++) {
			builder.append(list.get(i) + (i!=list.size()-1 ? "," : ""));
		}
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
