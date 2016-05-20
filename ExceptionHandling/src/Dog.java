import java.lang.*;

public class Dog extends Animal {

    Dog(String name) {
        super(name);
    }

    String getName() {
        String name = "My dog's name is " + super.getName();

        return name;
    }

    String  Bark() {
        return "BOW, BOW ";
    }


}
