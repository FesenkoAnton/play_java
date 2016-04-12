package part2.lection4.cars2;

/**
 * Такий собі типовий автомобіль, здатний їздити на будь якому пальному
 * 
 * @author Andrii
 * 
 */

public class Car {
	private int tank = 0;
	private String name = "";

	public String name() {
		return name;
	}

	public int getTank() {
		return tank;
	}

	public void setTank(int i) {
		tank += i;
		if (tank < 0)
			tank = 0;
	}

	public void fillBack(Petrol petrol, int i) {
		System.out.println("Заправляємо автомобіль бензином марки - " + petrol);
		setTank(i);
	}
}
