import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {

    JLabel balance;
    int money;
    ClickHandler cHandler = new ClickHandler();
    Font font1;


    public static void main(String[] args) {
        new Main();
        
    }

    public Main() {

        Font();
        GUI();
        
    }

    public void Font() {
        
        font1 = new Font("Comic Sans MS", Font.PLAIN, 32);
        

    }

    public void GUI() {
        JFrame frame = new JFrame();
        frame.setSize(700,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.darkGray);
        frame.setLayout(null);

        JPanel mainPanel = new JPanel();
        mainPanel.setBounds(100, 150, 150, 200);
        mainPanel.setBackground(Color.darkGray);
        frame.add(mainPanel);

        balance = new JLabel("Balance: 0");
        balance.setFont(font1);
        balance.setForeground(Color.white);
        mainPanel.add(balance);

        JButton mainButton = new JButton();
        mainButton.setFocusPainted(false);
        mainButton.setBorder(null);
        mainButton.setIcon(new ImageIcon("C:\\Users\\lyand\\OneDrive\\Pictures\\Saved Pictures\\uwu.png"));
        mainButton.addActionListener(cHandler);
        mainPanel.add(mainButton);

        frame.setVisible(true);
    }

    public class ClickHandler implements ActionListener {
        public void actionPerformed(ActionEvent event) {

            money++;
            balance.setText("Balance: " + money);

        }
    }

}