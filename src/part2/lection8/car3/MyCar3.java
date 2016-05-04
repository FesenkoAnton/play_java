package part2.lection8.car3;

public class MyCar3 {

	private class MyEngine implements Engine {

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

	private class MyGearBox implements GearBox {
		private int maxGear, gear;

		@Override
		public int maxGear() {
			return maxGear;
		}

		@Override
		public int gear() {
			return gear;
		}

		@Override
		public void next() {
			gear++;
		}

		@Override
		public void prev() {
			gear--;
		}

	}

	public MyEngine getEngine(String name) {
		return new MyEngine(name);
	}

	public MyGearBox getGearBox() {
		return new MyGearBox();
	}

}
