package part2.lection8.car3;

public class MyCar4 {

	public Engine getEngine(String name) {
		// клас в середині методу !!!!!!!!!!
		class MyEngine implements Engine {
			private String name;
			private boolean status;

			MyEngine(String name) {
				this.name = name;
			}

			@Override
			public String getDeveloper() {
				return name;
			}

			@Override
			public void start() {
				status = true;

			}

			@Override
			public void stop() {
				status = false;
			}
		}

		return new MyEngine(name);

	}

	public static void main(String[] args) {
		MyCar4 mc4 = new MyCar4();
		Engine eng = mc4.getEngine("Авто ЗАЗ");

	}

}
