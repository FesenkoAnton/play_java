package part2.lection8.car3;

public class TestMyCar {
	public static void main(String[] args) {
		MyCar3 mc3 = new MyCar3();

		// Так вже зробити не вийде
		// MyCar3.MyEngine me = MyCar3.new MyEngine("Авто ЗАЗ");
		// MyCar3.MyGearBox mgb = MyCar3.new MyGearBox();

		// Тільки так
		GearBox gb = mc3.getGearBox();
		Engine me = mc3.getEngine("Авто ВАЗ");
	}

}
