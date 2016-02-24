import javax.swing.*;
import java.awt.*;


public class Head {

    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("Frame");
        frame.setSize(640,480);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());
        frame.setLocationRelativeTo(null);
        JMenuBar bar = new JMenuBar();
        frame.add(bar);
        JProgressBar pb =new JProgressBar();
        frame.add(pb);
        pb.setMinimum(0);
        pb.setMaximum(100);
        JMenu menu =new JMenu("menu");

        bar.add(menu);
        frame.setVisible(true);
        for (int i=0;i<100;i++){
            pb.setValue(i);
            Thread.sleep(300);
        }
        frame.setBackground(Color.YELLOW);
    }

}
