package be.pxl.generics.opdracht1;

public class Goochelaar {

	private Hoed<? extends Dier> hoed;
	
	public void verstopDier() {
		if (Math.random() >= 0.5) {
			hoed = maakHoed(new Konijn());
		} else {
			hoed = maakHoed(new Duif());
		}
	}
	
	private <T extends Dier> Hoed<T> maakHoed(T dier) {
		Hoed<T> aangepasteHoed = new Hoed<>(dier);
		return aangepasteHoed;		
	}
	
	public void kijkInHoed() {
		Dier dier = hoed.kijk();
		if (dier != null) {
			System.out.println(dier.getClass().getSimpleName());
		} else {
			System.out.println("LEEG");
		}
	}
}
