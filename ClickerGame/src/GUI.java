import java.awt.BorderLayout;
import java.awt.LayoutManager;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI {

    public GUI() {

        JFrame frame = new JFrame("Clicker Game");

        JButton button = new JButton("Click to get cash");

        JLabel label = new JLabel("Balance: " + Economy.balance);

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        

        // objects on window
        panel.add(button);
        panel.add(label);


        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Clicker Game");
        frame.pack();
        frame.setVisible(true);
    }


    public static void main(String[] args) throws Exception {
        new GUI();
    }
}
