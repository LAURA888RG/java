import base.Person;

public class App {
    public static void main(String[] args) {

        Person person1 = new Person();

        person1.name = "Laura";
        person1.age = 22;
        person1.greetings();

        Person jefri = new Person();

        jefri.name = "Jefri";
        jefri.age = 23;
        jefri.greetings();

    }
}
