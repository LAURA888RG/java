package animals;

public class Cat extends Pet {

    public Cat(String name, int age) {
        super(name, age);
    };

    public void eat() {
        super.eat();
        String message = "Como comida para gatos";
        System.out.println(message);

    }

    public void scratch() {
        String message = "Estoy "
    }
}