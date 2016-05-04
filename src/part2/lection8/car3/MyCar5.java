package part2.lection8.car3;

public class MyCar5 {

	// для того, що б використовувати для ініціалізації поля внутрішнього класу
	// змінна має бути final
	public Engine engine(final String name) {
		return new Engine() {
			private String developer = name;
			private boolean status = false;

			@Override
			public String getDeveloper() {
				return developer;
			}

			@Override
			public void start() {
				status = true;
			}

			@Override
			public void stop() {
				status = false;
			}
		};
	}

	public static void main(String[] args) {
		MyCar5 mc5 = new MyCar5();
		Engine e = mc5.engine("Авто ВАЗ");

	}

}
