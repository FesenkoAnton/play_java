package part2.lection8.inner;

public class MyMath {

	public Math math(int x) {
		return new Math(x) {
			@Override
			public int value() {
				return super.value() * 10;
			}
		};
	}

	public static void main(String[] args) {
		MyMath mm = new MyMath();
		System.out.println(mm.math(10).value());
		Math math = mm.math(5);
		System.out.println(math.value());

	}

}
