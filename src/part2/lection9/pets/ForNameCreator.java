package part2.lection9.pets;
import java.util.*;

public class ForNameCreator extends PetCreator {
  private static List<Class<? extends Pet>> types =
    new ArrayList<Class<? extends Pet>>();
  // Types that you want to be randomly created:
  private static String[] typeNames = {
    "part2.lection9.pets.Mutt",
    "part2.lection9.pets.Pug",
    "part2.lection9.pets.EgyptianMau",
    "part2.lection9.pets.Manx",
    "part2.lection9.pets.Cymric",
    "part2.lection9.pets.Rat",
    "part2.lection9.pets.Mouse",
    "part2.lection9.pets.Hamster"
  };	
  @SuppressWarnings("unchecked")
  private static void loader() {
    try {
      for(String name : typeNames)
        types.add(
          (Class<? extends Pet>)Class.forName(name));
    } catch(ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
  static { loader(); }
  @Override
public List<Class<? extends Pet>> types() {return types;}
} ///:~