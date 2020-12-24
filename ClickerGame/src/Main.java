import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {

    //int for buttons
    int money;
    int power = 1;
    int powerCost = 10;

    //labels
    JLabel balance;

    //buttons
    JButton mainButton;
    JButton powerUpgrade;

    //fonts
    Font font1;
    Font upgradesFont;
    
    //for action listener
    ClickHandler cHandler = new ClickHandler();
    PowerUpgrader pUpgrader = new PowerUpgrader();

    public static void main(String[] args) {
        new Main();
        
    }

    public Main() {

        Font();
        GUI();
        
    }

    public void Font() {
        
        font1 = new Font("Comic Sans MS", Font.PLAIN, 32);
        upgradesFont = new Font("Comic Sans MS", Font.PLAIN, 18);
        

    }

    public void GUI() {
        //window
        JFrame frame = new JFrame();
        frame.setSize(700,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.darkGray);
        frame.setLayout(null);

        //panel main button
        JPanel mainPanel = new JPanel();
        mainPanel.setBounds(100, 150, 150, 200);
        mainPanel.setBackground(Color.darkGray);
        frame.add(mainPanel);

        //panel for balance status
        JPanel topPanel = new JPanel();
        topPanel.setBounds(50, 100, 250, 50);
        topPanel.setBackground(Color.darkGray);
        frame.add(topPanel);

        //label for balance status
        balance = new JLabel("Balance: 0");
        balance.setFont(font1);
        balance.setForeground(Color.white);
        topPanel.add(balance);

        //main clicker button
        mainButton = new JButton();
        mainButton.setFocusPainted(false);
        mainButton.setBorder(null);
        mainButton.setIcon(new ImageIcon("C:\\Users\\lyand\\OneDrive\\Pictures\\Saved Pictures\\uwu.png"));
        mainButton.addActionListener(cHandler);
        mainPanel.add(mainButton);

        //shop panel 
        JPanel shopPanel = new JPanel();
        shopPanel.setBounds(500, 50, 150, 350);
        shopPanel.setBackground(Color.blue);
        shopPanel.setLayout(new GridLayout(6,1));
        frame.add(shopPanel);

        //button to upgrade power per click
        powerUpgrade = new JButton("Power" + "(" + power + ")");
        powerUpgrade.setFocusPainted(false);
        powerUpgrade.setFont(upgradesFont);
        powerUpgrade.addActionListener(pUpgrader);
        shopPanel.add(powerUpgrade);

        frame.setVisible(true);
    }

    public class ClickHandler implements ActionListener {
        public void actionPerformed(ActionEvent event) {

            String action = event.getActionCommand();

            switch(action) {

            }
            money += power;
            
            balance.setText("Balance: " + money);
            

        }
    }

    public class PowerUpgrader implements ActionListener {
        public void actionPerformed(ActionEvent event) {

            if (powerCost <= money) {
                power++;
                money -= powerCost;
                balance.setText("Balance: " + money);
            } 

            
            powerUpgrade.setText("Power" + "(" + power + ")");
            

        }
    }


}