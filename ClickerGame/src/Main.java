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

        JPanel topPanel = new JPanel();
        topPanel.setBounds(50, 100, 250, 50);
        topPanel.setBackground(Color.darkGray);
        frame.add(topPanel);

        balance = new JLabel("Balance: 0");
        balance.setFont(font1);
        balance.setForeground(Color.white);
        topPanel.add(balance);

        JButton mainButton = new JButton();
        mainButton.setFocusPainted(false);
        mainButton.setBorder(null);
        mainButton.setIcon(new ImageIcon("C:\\Users\\lyand\\OneDrive\\Pictures\\Saved Pictures\\uwu.png"));
        mainButton.addActionListener(cHandler);
        mainPanel.add(mainButton);

        JPanel rightPanel = new JPanel();
        rightPanel.setBounds(500, 50, 150, 350);
        rightPanel.setBackground(Color.blue);
        frame.add(rightPanel);

        frame.setVisible(true);
    }

    public class ClickHandler implements ActionListener {
        public void actionPerformed(ActionEvent event) {

            int test = 5;
            money += test;
            
            balance.setText("Balance: " + money);
            

        }
    }

}