package masina;

public class Sabiranje implements Operacija {
	
	@Override
	public void izvrsi(Stek s) {
		if (s.getBrElem()<2) {
			return;
		}
		int br1 = s.ukloni();
		int br2 = s.ukloni();
		s.dodaj(br1+br2);

	}

}
