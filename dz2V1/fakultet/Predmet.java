package fakultet;

import java.util.ArrayList;
import java.util.List;

public class Predmet {
	private String naziv, sifra;
	List<Osoba> list;
	
	public Predmet(String naziv, String sifra) {
		this.naziv = naziv;
		this.sifra = sifra;
		this.list = new ArrayList<>();
	}

	public String getNaziv() {
		return naziv;
	}
 

	public String getSifra() {
		return sifra;
	}
	
	public Predmet dodajOsobu(Osoba o) throws GViseNastavnika {
		for (Osoba osoba : list) {
			if (osoba.getOznaka() == 'N' && o.getOznaka() == 'N') throw  new GViseNastavnika();
		}
		list.add(o);
		return this;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(naziv + " (" + sifra + ")\n");
		for (Osoba osoba : list) {
			builder.append(osoba + "\n");
		}
		return builder.toString();
	}
	
	

	
	
	
	

}
