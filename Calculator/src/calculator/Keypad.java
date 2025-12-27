package calculator;
import java.awt.*;
import javax.swing.*;

public class Keypad extends JPanel{
    static JButton b0 = new JButton("0");
    static JButton b1 = new JButton("1");
    static JButton b2 = new JButton("2");
    static JButton b3 = new JButton("3");
    static JButton b4 = new JButton("4");
    static JButton b5 = new JButton("5");
    static JButton b6 = new JButton("6");
    static JButton b7 = new JButton("7");
    static JButton b8 = new JButton("8");
    static JButton b9 = new JButton("9");
    
    static JButton bDot = new JButton(".");    
    static JButton bAdd = new JButton("+");
    static JButton bSub = new JButton("-");
    static JButton bMul = new JButton("*");
    static JButton bEqual = new JButton("=");    
    static JButton bDiv = new JButton("/");
    
    static JButton bClear = new JButton("C");   
    static JButton b00 = new JButton("00");    
    static JButton b = new JButton("");           
    static JButton bs = new JButton("");           
    
    public Keypad() {
        GridLayout grid = new GridLayout(5,4,5,5);
        setLayout(grid);
        
        add(b7);
        add(b8);
        add(b9);
        add(bMul);
        
        add(b4);
        add(b5);
        add(b6);
        add(bSub);
        
        add(b1);
        add(b2);
        add(b3);
        add(bAdd);
        
        add(b0);
        add(b00);
        add(bDot);
        add(bDiv);  
        
        add(b);
        add(bs);
        add(bEqual);
        add(bClear);
        
        MyListener listener = new MyListener();

        b0.addActionListener(listener);        
        b1.addActionListener(listener);
        b2.addActionListener(listener);
        b3.addActionListener(listener);
        b4.addActionListener(listener);
        b5.addActionListener(listener);
        b6.addActionListener(listener);
        b7.addActionListener(listener);
        b8.addActionListener(listener);
        b9.addActionListener(listener);
        bAdd.addActionListener(listener);
        bSub.addActionListener(listener);
        bMul.addActionListener(listener);
        bDiv.addActionListener(listener);
        bDot.addActionListener(listener);
        bEqual.addActionListener(listener);     
        bClear.addActionListener(listener);                
        b00.addActionListener(listener);                        
    }
}