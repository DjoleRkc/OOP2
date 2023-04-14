package skijanje;

public abstract class Deonica {
	
	private double duzina, nagib;
	
	public Deonica(double d, double n) {
		this.duzina = d;
		this.nagib = n;
	}

	public double duzina() {
		return duzina;
	}



	public double nagib() {
		return nagib;
	}
	
	public double brzina(double pocetna) {
		return Math.sqrt((2*ubrzanje()*duzina) + (pocetna*pocetna));
	}
	
	public double vreme(double pocetna) {
		return (brzina(pocetna) - pocetna)/ubrzanje();
	}

	public abstract char oznaka();
	public abstract double ubrzanje();
	
	


	@Override
	public String toString() {
		return oznaka() + "(" + duzina + "," + nagib + ")";
	}


}
