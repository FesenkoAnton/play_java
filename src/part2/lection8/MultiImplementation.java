package part2.lection8;

class X {
}

abstract class E {
}

class Z extends X {
	E makeE() {
		return new E() {
		};
	}
}

public class MultiImplementation {
	static void takesX(X x) {
	}

	static void takesE(E e) {
	}

	public static void main(String[] args) {
		Z z = new Z();
		takesX(z);
		takesE(z.makeE());
	}
}
