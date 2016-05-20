import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class TimerCaller {


    public void Start(int interval, final boolean beep) {


        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(beep) System.out.println(new Date());
            }
        };
        Timer t = new Timer(interval, listener);
        t.start();

    }
}
