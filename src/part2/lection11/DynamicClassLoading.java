package part2.lection11;

class Dog{
	static {System.out.println("Вантажимо Dog");}
}

class Cat{
	static {System.out.println("Вантажимо Cat");}
}

class Hamster{
	static {
		System.out.println("Вантажимо Hamster");
	}
}
public class DynamicClassLoading {

	public static void main(String[] args){
		System.out.println("запустили main");
	    new Hamster();
	    System.out.println("одразу після створення Hamster");
	    try {
	      //Class.forName("Cat");
	    	Class.forName("ua.com.glybovets.lecture13.Cat");
	    } catch(ClassNotFoundException e) {
	      System.out.println("Не можемо знайти Cat");
	    }
	    System.out.println("після Class.forName(\"Cat\")");
	    new Dog();
	    System.out.println("після створення Dog");
	}
	
}
