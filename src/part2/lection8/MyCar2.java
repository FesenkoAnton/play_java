package part2.lection8;

public class MyCar2 {
	class GearBox {
		private int maxGear;

		public GearBox(int g) {
			this.maxGear = g;
		}

		public int getMaxGear() {
			return maxGear;
		}
	}

	class Engine {
		private String developer;

		Engine(String dev) {
			this.developer = dev;
		}

		public String getDeveloper() {
			return this.developer;
		}
	}

	public static void main(String[] args) {
		MyCar2 mc = new MyCar2();
		MyCar2.GearBox gb = mc.new GearBox(4);
		MyCar2.Engine eng = mc.new Engine("Авто ЗАЗ");
	}
}
