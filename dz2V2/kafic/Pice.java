package kafic;

import java.util.Locale;
import java.util.Objects;

public abstract class Pice {
   
	protected String naziv;
	protected float zapremina;
	protected int cenaPoLitru;
	
	public Pice(String naziv, float zapremina, int cenaPoLitru) {
		this.naziv = naziv;
		this.zapremina = zapremina;
		this.cenaPoLitru = cenaPoLitru;
	}
	
	public String getNaziv() {
		return naziv;
	}
	
	public float getZapremina() {
		return zapremina;
	}
	
	public float getCena() {
		return cenaPoLitru*zapremina;
	}
	
	public abstract char getOznaka();
	
	@Override
	public String toString() {
		return naziv + " (" + String.format(Locale.US, "%.2f", zapremina) + " L)" + " : " + String.format(Locale.US,"%.2f", getCena()) + " RSD";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Pice))
			return false;
		Pice other = (Pice) obj;
		return Objects.equals(naziv, other.naziv) && Double.doubleToLongBits(zapremina) == Double.doubleToLongBits(other.zapremina);
	}
	

}
