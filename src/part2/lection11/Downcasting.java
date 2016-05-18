package part2.lection11;

import java.util.*;

class Pet{
	public int id;
}
class Mouse extends Pet{
	
	public void pi(){
		System.out.println("pi pi pi");
	}
}

class Owl extends Pet{
	public void uh(){
		System.out.println("UH UH UH");
	};
}

public class Downcasting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Pet> pets1 = new ArrayList<Pet>();
		pets1.add(new Mouse());
		pets1.add(new Owl());
		pets1.add(new Owl());
		
		for (Pet p:pets1)
			try{
				((Owl)p).uh();
			}catch (ClassCastException e){
				
			}
		
		for (Pet p: pets1)
			if (p instanceof Mouse)
				((Mouse)p).pi();
	}

}
