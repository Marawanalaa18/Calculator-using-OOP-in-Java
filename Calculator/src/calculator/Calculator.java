package calculator;

import java.awt.*;
import javax.swing.*;

public class Calculator {

    static JTextField t;
    
    public static void main(String[] args) {
        JFrame f = new JFrame("Calculator");
        
        t = new JTextField(30);
        t.setEnabled(false);
        t.setBackground(new Color(240,240,240));
        t.setFont(new Font("Serief", Font.BOLD,30));
//        t.setForeground(Color.red);
        t.setText("");
        
        Keypad keypad = new Keypad();
        
        f.add(t, BorderLayout.PAGE_START);  
        f.add(keypad, BorderLayout.CENTER);
        f.setSize(250,300);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}