public class ArrayIdexOutOfBoundTest {

    public static void main(String[] args) {

        Double[] arrayOfDouble = new Double[10];

        for (int i = 0; i < arrayOfDouble.length; i++) {
            arrayOfDouble[i] = Math.pow(i, 2);
            System.out.println(arrayOfDouble[i]);
        }

        for (int i = 0; i < arrayOfDouble.length; i++) {
            try {
                System.out.println(arrayOfDouble[i + 1]);
            } catch (ArrayIndexOutOfBoundsException e ) {
                e.printStackTrace();
            }
        }
    }
}
