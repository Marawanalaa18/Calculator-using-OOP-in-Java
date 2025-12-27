package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyListener implements ActionListener{
    
    static String x = "";
    static String y = "";
    static char op = '+';
    
    @Override
    public void actionPerformed(ActionEvent e) {        
        if(e.getSource() == Keypad.b0){
            Calculator.t.setText(Calculator.t.getText()+"0");            
        }
        else if(e.getSource() == Keypad.b1){
            Calculator.t.setText(Calculator.t.getText()+"1");           
        }
        else if(e.getSource() == Keypad.b2){
            Calculator.t.setText(Calculator.t.getText()+"2");           
        }
        else if(e.getSource() == Keypad.b3){
            Calculator.t.setText(Calculator.t.getText()+"3");           
        }
        else if(e.getSource() == Keypad.b4){
            Calculator.t.setText(Calculator.t.getText()+"4");           
        }
        else if(e.getSource() == Keypad.b5){
            Calculator.t.setText(Calculator.t.getText()+"5");           
        }
        else if(e.getSource() == Keypad.b6){
            Calculator.t.setText(Calculator.t.getText()+"6");           
        }
        else if(e.getSource() == Keypad.b7){
            Calculator.t.setText(Calculator.t.getText()+"7");           
        }
        else if(e.getSource() == Keypad.b8){
            Calculator.t.setText(Calculator.t.getText()+"8");           
        }
        else if(e.getSource() == Keypad.b9){
            Calculator.t.setText(Calculator.t.getText()+"9");           
        }
        else if(e.getSource() == Keypad.bDot){
            Calculator.t.setText(Calculator.t.getText()+".");
        }
        else if(e.getSource() == Keypad.bAdd){
            x = Calculator.t.getText();
            op = '+';
            Calculator.t.setText("");
        }
        else if(e.getSource() == Keypad.bSub){
            x = Calculator.t.getText();
            op = '-';
            Calculator.t.setText("");
        }
        else if(e.getSource() == Keypad.bMul){
            x = Calculator.t.getText();
            op = '*';
            Calculator.t.setText("");            
        }
        else if(e.getSource() == Keypad.bDiv){
            x = Calculator.t.getText();
            op = '/';
            Calculator.t.setText("");            
        }
        else if(e.getSource() == Keypad.bEqual){
            y = Calculator.t.getText();
            float a = Float.parseFloat(x);
            float b = Float.parseFloat(y);
            
            switch(op){
                case '+': Calculator.t.setText(""+(a+b)); break;
                case '-': Calculator.t.setText(""+(a-b)); break;
                case '*': Calculator.t.setText(""+(a*b)); break;
                case '/':
                    if(b == 0)
                        Calculator.t.setText("ERROR");
                    else
                        Calculator.t.setText(""+(a/b)); break;
            }
        }
        else if(e.getSource() == Keypad.bClear){
            Calculator.t.setText("");
        }
        else if(e.getSource() == Keypad.b00){
            Calculator.t.setText(Calculator.t.getText()+"00");            
        }
    }
}