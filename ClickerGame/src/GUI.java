import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener {

    private JLabel label;
    private JFrame frame;
    private JPanel panel;
    private JButton mainButton;
    private JButton upgradeButton;

    

    public GUI() {

        frame = new JFrame("Clicker Game");

        mainButton = new JButton("Click to get cash");
        mainButton.addActionListener(this);

        upgradeButton = new JButton("Upgrade cash per click");
        upgradeButton.addActionListener(this);

        label = new JLabel("Balance: " + Economy.balance);

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(60, 60, 20, 60));

        // objects on window
        panel.add(mainButton);
        panel.add(label);
        panel.add(upgradeButton);
        


        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Clicker Game");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) throws Exception {
        new GUI();
    }

    

    @Override
    public void actionPerformed(ActionEvent e) {
        
        Economy.balance++;
        
        label.setText("Balance: " + Economy.balance);

    }

    

}
