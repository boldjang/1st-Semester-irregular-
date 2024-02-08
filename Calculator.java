import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener{
   
    JTextArea scr = new JTextArea();
    Font bfont = new Font("Arial", Font.BOLD, 45);
    JButton _7 = new JButton("7");
    JButton _8 = new JButton("8");
    JButton _9 = new JButton("9");
    JButton _4 = new JButton("4");
    JButton _5 = new JButton("5");
    JButton _6 = new JButton("6");
    JButton _1 = new JButton("1");
    JButton _2 = new JButton("2");
    JButton _3= new JButton("3");
    JButton _0 = new JButton("0");
    JButton _add = new JButton("+");
    JButton _sub = new JButton("-");
    JButton _mul = new JButton("x");
    JButton _div = new JButton("/");
    JButton _dall = new JButton("AC");
    JButton _del = new JButton("C");
    JButton _eq = new JButton("=");
    
    public Calculator(){
        
        super("Calculator");
        
        add(scr);
        scr.setBounds(10, 10, 360, 70);
        scr.setBackground(Color.LIGHT_GRAY);
        scr.setFont(bfont);
        scr.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        scr.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        add(_7);
        _7.setBounds(10, 90, 70, 70);
        _7.setFont(bfont);
        _7.addActionListener(this);
        _7.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(_8);
        _8.setBounds(90, 90, 70, 70);
        _8.setFont(bfont);
        _8.addActionListener(this);
        _8.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(_9);
        _9.setBounds(170, 90, 70, 70);
        _9.setFont(bfont);
        _9.addActionListener(this);
        _9.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(_4);
        _4.setBounds(10, 170, 70, 70);
        _4.setFont(bfont);
        _4.addActionListener(this);
        _4.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        add(_5);
        _5.setBounds(90, 170, 70, 70);
        _5.setFont(bfont);
        _5.addActionListener(this);
        _5.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        add(_6);
        _6.setBounds(170, 170, 70, 70);
        _6.setFont(bfont);
        _6.addActionListener(this);
        _6.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        add(_1);
        _1.setBounds(10, 250, 70, 70);
        _1.setFont(bfont);
        _1.addActionListener(this);
        _1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(_2);
        _2.setBounds(90, 250, 70, 70);
        _2.setFont(bfont);
        _2.addActionListener(this);
        _2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(_3);
        _3.setBounds(170, 250, 70, 70);
        _3.setFont(bfont);
        _3.addActionListener(this);
        _3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(_0);
        _0.setBounds(90, 330, 70, 70);
        _0.setFont(bfont);
        _0.addActionListener(this);
        _0.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(_add);
        _add.setBounds(250, 90, 110, 70);
        _add.setFont(bfont);
        _add.setBackground(Color.LIGHT_GRAY);
        _add.addActionListener(this);
        _add.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(_sub);
        _sub.setBounds(250, 170, 110, 70);
        _sub.setFont(bfont);
        _sub.setBackground(Color.LIGHT_GRAY);
        _sub.addActionListener(this);
        _sub.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(_mul);
        _mul.setBounds(250, 250, 110, 70);
        _mul.setFont(bfont);
        _mul.setBackground(Color.LIGHT_GRAY);
        _mul.addActionListener(this);
        _mul.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(_div);
        _div.setBounds(250, 330, 110, 70);
        _div.setFont(bfont);
        _div.setBackground(Color.LIGHT_GRAY);
        _div.addActionListener(this);
        _div.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(_eq);
        _eq.setBounds(10, 410, 350, 40); 
        _eq.setFont(bfont);
        _eq.setBackground(Color.red);
        _eq.addActionListener(this);
        _eq.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(_del);
        _del.setBounds(10, 330, 70, 70);
        _del.setFont(bfont);
        _del.setBackground(Color.red);
        _del.addActionListener(this);
        _del.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(_dall);
        _dall.setBounds(170, 330, 70, 70);
        _dall.setFont(bfont);
        _dall.setBackground(Color.red);
        _dall.addActionListener(this);
        _dall.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
                
        
        this.setSize(400, 500);
        this.setLayout(null);      
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void actionPerformed(ActionEvent e)  {
        if (e.getSource() == _9) {
            scr.append("9");
        } else if (e.getSource() == _8) {
            scr.append("8");
        } else if (e.getSource() == _7) {
            scr.append("7");
        } else if (e.getSource() == _6) {
            scr.append("6");
        } else if (e.getSource() == _5) {
            scr.append("5");
        } else if (e.getSource() == _4) {
            scr.append("4");
        } else if (e.getSource() == _3) {
            scr.append("3");
        } else if (e.getSource() == _2) {
            scr.append("2");
        } else if (e.getSource() == _1) {
            scr.append("1");
        } else if (e.getSource() == _0){
            scr.append("0");            
        } else if (e.getSource() == _add) {
            performOperation('+');
        } else if (e.getSource() == _sub) {
            performOperation('-');
        } else if (e.getSource() == _mul) {
            performOperation('*');
        } else if (e.getSource() == _div) {
            performOperation('/');
        } else if (e.getSource() == _eq) {
            performCalculation();
        } else if (e.getSource() == _del) {
            String expression = scr.getText();
            if (expression.length() > 0) {
                scr.setText(expression.substring(0, expression.length() - 1));
        }
        }else if (e.getSource() == _dall) {
        scr.setText("");
    }
    }

    private void performOperation(char op) {
        String expression = scr.getText();
        if (expression.length() == 0) {
            return;
        }
        if (expression.endsWith(String.valueOf(op))) {
            return;
        }
        scr.append(String.valueOf(op));
    }

    private void performCalculation() {
        String expression = scr.getText();
        if (expression.length() == 0) {
            return;
        }
        String[] operands = expression.split("[+\\-*/]");
        if (operands.length != 2) {
            return;
        }
        double num1 = Double.parseDouble(operands[0]);
        double num2 = Double.parseDouble(operands[1]);
        double result = 0;
        char op = expression.replaceAll("[^+\\-*/]", "").charAt(0);
        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                break;
        }
        scr.setText(String.format("%.2f", result));
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.setVisible(true);
        
    }
    
}