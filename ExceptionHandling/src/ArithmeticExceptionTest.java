public class ArithmeticExceptionTest {

    public static void main(String[] args) {

        int number = 1234;
        int remainder = 0;
        for (int i = 5; i >= 0; i--) {
            try {
                remainder = number / i;
                System.out.println(remainder);
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        }
    }
}
