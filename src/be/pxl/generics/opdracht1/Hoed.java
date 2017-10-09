package be.pxl.generics.opdracht1;

public class Hoed<T extends Dier> {
	private T dier;
	private boolean eersteKijk;

	
	public Hoed(T dier) {
		eersteKijk = true;
		this.dier = dier;
	}

	public T kijk() {
		if (eersteKijk) {
			eersteKijk = false;
			return null;
		}
		return dier;
	}
}
