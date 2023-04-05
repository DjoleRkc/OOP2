package masina;

public class Stek {
	private int[] vrednosti;
	private int kapacitet;
	private int brElem = 0;
	public Stek(int kap) {
		kapacitet = kap;
		vrednosti = new int[kap];
	}
	
	public int[] getVrednosti() {
		return vrednosti;
	}

	public void setVrednosti(int[] vrednosti) {
		this.vrednosti = vrednosti;
	}

	public int getKapacitet() {
		return kapacitet;
	}

	public void setKapacitet(int kapacitet) {
		this.kapacitet = kapacitet;
	}

	public int getBrElem() {
		return brElem;
	}

	public void setBrElem(int sp) {
		this.brElem = sp;
	}

	public void dodaj(int broj) {
		if(brElem<kapacitet) {
			vrednosti[brElem++] = broj;
		}
		
	}
	
	public int ukloni() {
		if(brElem==0) {
			return -1000;
		}
		return vrednosti[--brElem];
	}
	
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		if (vrednosti != null) {
			for(int i=0;i<brElem;i++) {
				builder.append(vrednosti[i]);
				builder.append((i!=brElem-1 ? ",":""));
				
			}
		}
		builder.append("]");
		return builder.toString();
	}

	public static void main(String[] args) {
		Stek stek = new Stek(3);
		stek.dodaj(1);
		stek.dodaj(2);
		stek.dodaj(3);
		System.out.println(stek);

	}

}
