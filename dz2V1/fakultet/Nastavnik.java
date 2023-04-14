package fakultet;

public class Nastavnik extends Osoba {
	
	public enum Zvanje {doc, prof};
	
	private Zvanje z;

	public Nastavnik(String ime, String prezime, Zvanje z) {
		super(ime, prezime);
		this.z = z;
	}

	@Override
	public char getOznaka() {
		return 'N';
	}
	
	

	@Override
	public String toString() {
		return z + ". dr " + super.toString();
	}


}
