package masina;

public class Dodavanje implements Operacija {
	private int br;
	public Dodavanje(int vrednost) {
		br=vrednost;
	}

	@Override
	public void izvrsi(Stek s) {
		s.dodaj(br);

	}

}
