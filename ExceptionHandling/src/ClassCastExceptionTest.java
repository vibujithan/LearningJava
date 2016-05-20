public class ClassCastExceptionTest {

    public static void main(String[] args) {
        Animal alpha =new Dog("alpha");
        Animal beta = new Animal("beta");


        System.out.println(((Dog)alpha).getName());

        try {
            System.out.println(((Dog)beta).getName());
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
    }



}


