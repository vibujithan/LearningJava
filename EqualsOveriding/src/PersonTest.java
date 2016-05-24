public class PersonTest {

    public static void main(String[] args) {

        Person alpha = new Person("Alpha", 24);
        Person beta = new Person("Beta", 18);
        Person alphaCopy = new Person("Alpha", 24);
        Person dummy = beta;

        if (alpha == beta) {
            System.out.println("Alpha == Beta");
        } else {
            System.out.println("Alpha != Beta");
        }

        if (beta == dummy) {
            System.out.println("Beta==dummy");
        }

        if (dummy.equals(beta)) {

            System.out.println("dummy equals beta");
        } else {
            System.out.println("dummy not equals beta");
        }
        if (alpha.equals(beta)) {

            System.out.println("Alpha equals beta");
        } else {
            System.out.println("Alpha not equals beta");
        }

        if (alpha.equals(alphaCopy)) {

            System.out.println("Alpha equals AlphaCopy");
            System.out.println("Hash codes \n Alpha :" + alpha.hashCode() + " Alpha copy " + alphaCopy.hashCode());
        } else {
            System.out.println("Alpha not equals AlphaCopy");
        }
    }
}