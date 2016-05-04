package part2.lection8;

public class DotThis {

	void doSmth() {
		System.out.println("Метод doSmth основного класу");
	}

	// публічний внутрішній клас ...
	public class Inner {
		// метод який повертає вказівник на зовнішній об'єкт
		public DotThis outer() {
			return DotThis.this;
		}
	}

	public Inner getInner() {
		return new Inner();
	}

	public static void main(String[] args) {
		// об'єкт зовнішнього класу
		DotThis dt = new DotThis();
		// об'єкт внутрішнього класу
		//DotThis.Inner dti = new DotThis.Inner(); //так зробити ми не можемо
		DotThis.Inner dti = dt.getInner();

		// dti.doSmth(); // помилка, такого методу у внутрішнього класу не існує
		dti.outer().doSmth();

	}

}
