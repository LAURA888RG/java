import base.Dog;
import base.Person;
import base.Pet;

public class AppPets {

    static void playWithDog() {
        Person person1 = new Person("Pepe", 22);
        // Person.countInstances++;

        // person1.name = "Ramon";
        // person1.age = 20;
        person1.greetings();
        person1.setAge(23);
        person1.greetings();

        Person person2 = new Person("Juan", 25);
        // Person.countInstances++;

        // person2.name = "Juan";
        // person2.age = 25;
        person2.greetings();
        System.out.println(Person.countInstances);
    }

  
    public static void playWithCat() {

        Pet pet1 = new Cat("Silvestre", 1);
        System.out.println(pet1 instanceof Dog);
        System.out.println(pet1 instanceof Pet);
        System.out.println(pet1 instanceof Object);

        pet1.sleep();
        pet1.eat();

    }

    public static void main(String[] args) {

        // playWithPersons();
        // prepareGame();
        // playPets();

        Square sq = new Square(10);
        String type = "Cuadrado";
        System.out.println(sq instanceof Object);
        System.out.println(type instanceof Object);
        System.out.println(type); 
        System.out.println(sq.toString());

        Square sq2 = new Square(10);
        System.out.println(sq == sq2);

        System.out.println(sq2);

        System.out.println(sq.equals(sq2));

    }
}