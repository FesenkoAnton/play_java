package part2.lection5.cars4;

public class CarTester {
	public static void drive(Car car) {
		// робимо перевірку чи не порожній бак і якщо так заправляємо
		if (car.getTank() == 0)
			car.fillBack(Petrol.P95, 10);
		// їдемо
	}

	public static void driveAll(Car[] cars) {
		for (Car car : cars)
			drive(car);
	}

	public static void main(String[] args) {
		Car[] garage = { new HondaCRV(), new Forza(), new Bmw(), new BmwX5() };
		driveAll(garage);
	}
}
