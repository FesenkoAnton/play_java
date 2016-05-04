package part2.lection8;

public class MyCar {

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

	public void constructCar(String dev) {
		GearBox gb = new GearBox(4);
		Engine eng = new Engine(dev);
		System.out.println("Ми зібрали машину з " + gb.getMaxGear()
				+ " ступеневою коробкою \n та двигуном від "
				+ eng.getDeveloper());
	}

	public static void main(String[] args) {
		MyCar mc = new MyCar();
		mc.constructCar("Авто ЗАЗ");

	}

}
