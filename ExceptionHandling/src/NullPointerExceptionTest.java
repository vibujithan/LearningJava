public class NullPointerExceptionTest {


    public static void main(String[] args) {

        Animal alpha=null;

        try {
            System.out.println(alpha.getBorn());
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

    }
}
