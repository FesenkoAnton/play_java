package part2.lection9;
import java.util.ArrayList;
import java.util.List;


class Car{
	public String name;
	Car(String n){
		name = n;
	}
}

class Zaz extends Car{
	public int price;
	Zaz(String n){
		super(n);
	}
	
	public void setPrice(int i){
		price = i;
	}
	
	@Override
	public String toString(){
		return name+" " +price;
	}
}

class Deo extends Car{
	public boolean gerType = false;
	
	Deo(String n){
		super(n);
	}
	
	public void setGerType(boolean b){
		gerType = b;
	}
	@Override
	public String toString(){
		return name+" " +gerType;
	}
}

public class ListFeatures {
	
	public static void main(String[] args) {
		ArrayList<Car> cars = new ArrayList<Car>();
		Zaz z1 = new Zaz("���1");
		Zaz z2 = new Zaz("���2");
		Zaz z3 = new Zaz("���3");
		
		Deo d1 = new Deo("�����1");
		Deo d2 = new Deo("�����2");
		Deo d3 = new Deo("�����3");
		
		cars.add(z1);
		cars.add(z2);
		cars.add(d1);
		cars.add(d2);
		
		System.out.println(cars);
		System.out.println(cars.contains(d2));
		System.out.println(cars.contains(d3));
		System.out.println(cars.indexOf(d2));
		Car c = cars.get(2);
		System.out.println(c);
		System.out.println(cars.remove(d3));
		
		List<Car> cars2 = cars.subList(0, 2);
		System.out.println(cars2);

	}

}
