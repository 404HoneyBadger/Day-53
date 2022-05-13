import java.util.ArrayList;
import java.util.Scanner;

public class AnimalApp {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      ArrayList<Animal> animalInputArray = new ArrayList<>();
      System.out.println("Pressing Enter ends the loop");
  
      /* So, String is capatlized cause its not a primitive type, boolean is thats why its lowercase, when "Boolean" its actually an object, same with all primitive types. */
      while (true) {

        System.out.print("What's your pet's name: ");
        String useName = scanner.nextLine();
        if(useName.isBlank()) {
          break;
        }//else is not needed cause if dont need
        System.out.print("Is your pet a dog: ");
        String useDog = scanner.nextLine();

        animalInputArray.add(new Animal(useName, useDog.equals("yes") || useDog.equals("true")));
      } 

      for (Animal animalObject : animalInputArray) {
        System.out.println(animalObject); 
      }
    }
  }
}
