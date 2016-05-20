import javax.swing.*;

public class MyInnerClassTest {
    public static void main(String[] args) {

        TimerCaller timerCaller = new TimerCaller();
        timerCaller.Start(2000,true);

        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}

