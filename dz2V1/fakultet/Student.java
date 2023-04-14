package fakultet;

public class Student extends Osoba {
	
	private int godinaUpisa;
	
	private static int id = 0;
	private int brIndeksa;
	
	

	public Student(String ime, String prezime, int godinaUpisa) {
		super(ime, prezime);
		this.godinaUpisa = godinaUpisa;
		this.brIndeksa = id++;
	}

	@Override
	public char getOznaka() {
		return 'S';
	}

	
	@Override
	public String toString() {
		return godinaUpisa + "/" + String.format("%04d", brIndeksa) + " - " + super.toString();
	}
}
