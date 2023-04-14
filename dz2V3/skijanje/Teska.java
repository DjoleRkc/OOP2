package skijanje;

public class Teska extends Deonica {
	
	public Teska(double d, double n) {
		super(d, n);
	}

	@Override
	public char oznaka() {
		return 'T';
	}

	@Override
	public double ubrzanje() {
		return 9.81 * Math.sin(nagib() * (Math.PI/180));
	}

}
