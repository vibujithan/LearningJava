public class ArrayStoreExceptionTest {

    public static void main(String[] args) {

        Object[] animals = new Animal[5];
        animals[0] = new Bird(4, "Cukoo");
    }
}
