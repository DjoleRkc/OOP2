package kafic;

public class Sok extends Pice {
	
	public enum Vrsta {GAZIRAN, NEGAZIRAN};
	private Vrsta v;

	public Sok(String naziv, float zapremina, int cenaPoLitru, Vrsta v) {
		super(naziv, zapremina, cenaPoLitru);
		this.v = v;
	}
	

	public Vrsta getVrsta() {
		return v;
	}


	@Override
	public char getOznaka() {
		if (v==Vrsta.GAZIRAN) return 'G';
		return 'N';
	}

}
