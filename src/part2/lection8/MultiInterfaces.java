package part2.lection8;

interface A {
}

interface B {
}

class C implements A, B {
}

class D implements A {
	B makeB() {
		// Anonymous inner class:
		return new B() {
		};
	}
}

public class MultiInterfaces {
	static void takesA(A a) {
	}

	static void takesB(B b) {
	}

	public static void main(String[] args) {
		C c = new C();
		D d = new D();
		takesA(c);
		takesA(d);
		takesB(c);
		takesB(d.makeB());
	}
}
