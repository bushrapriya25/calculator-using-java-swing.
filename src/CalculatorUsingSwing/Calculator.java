package CalculatorUsingSwing;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class Calculator implements ActionListener{

    // String x;
    double operator = 0;
    double a= 0;	
    double b = 0;
    double ans = 0;
    double temp = 0;

    JFrame frame;
    JTextField t;
    
    JPanel p1, p2, p3;
    
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18;
 
    Calculator()
    {

        frame = new JFrame("CALCULATOR");   
        frame. getContentPane().setBackground(Color.BLACK);
     
       
        t = new JTextField(30);
        
       p1 = new JPanel();
       p1.setBounds(30, 30, 330, 60);
       p1.setBackground(Color.darkGray);
        

        p2 = new JPanel(new GridLayout(4, 3));
        p2.setBounds(30, 110, 200,220);
        p1.setBackground(Color.darkGray);
        
        p3 = new JPanel(new GridLayout(6, 1));
        p3.setBounds(231, 110, 80, 220);
        p3.setBackground(Color.darkGray);
       
        
        

        b1 = new JButton("0");
        b2 = new JButton("1");
        b3 = new JButton("2");
        b4 = new JButton("3");
        b5 = new JButton("4");
        b6 = new JButton("5");
        b7 = new JButton("6");
        b8 = new JButton("7");
        b9 = new JButton("8");
        b10 = new JButton("9");
        b11 = new JButton(".");
        b12 = new JButton("CLE");
        b13 = new JButton("+");
        b14 = new JButton("-");
        b15 = new JButton("*");
        b16 = new JButton("/");
        b17 = new JButton("%");
        b18 = new JButton("=");
       
        
        

        b1.setBackground(new Color(165,42,42));
        b2.setBackground(new Color(165,42,42));
        b3.setBackground(new Color(165,42,42));
        b4.setBackground(new Color(165,42,42));
        b5.setBackground(new Color(165,42,42));
        b6.setBackground(new Color(165,42,42));
        b7.setBackground(new Color(165,42,42));
        b8.setBackground(new Color(165,42,42));
        b9.setBackground(new Color(165,42,42));
        b10.setBackground(new Color(165,42,42));
        b11.setBackground(new Color(165,42,42));
        b12.setBackground(new Color(165,42,42));
        b13.setBackground(new Color(165,42,42));
        b14.setBackground(new Color(165,42,42));
        b15.setBackground(new Color(165,42,42));
        b16.setBackground(new Color(165,42,42));
        b17.setBackground(new Color(165,42,42));
        b18.setBackground(new Color(165,42,42));      
        

        frame.add(p1);
        p1.add(t);
        

        frame.add(p2);
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);
        p2.add(b7);
        p2.add(b8);
        p2.add(b9);
        p2.add(b10);
        p2.add(b11);
        p2.add(b12);
       
        frame.add(p3);
        p3.add(b13);
        p3.add(b14);
        p3.add(b15);
        p3.add(b16);
        p3.add(b17);
        p3.add(b18);
        
        

        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setVisible(true);
        Font font1 =((new Font("Arial",Font.BOLD,15)));
        b1.setFont(font1);
        b2.setFont(font1);
        b3.setFont(font1);
        b4.setFont(font1);
        b5.setFont(font1);
        b6.setFont(font1);
        b7.setFont(font1);
        b8.setFont(font1);
        b9.setFont(font1);
        b10.setFont(font1);
        b11.setFont(font1);
        b12.setFont(font1);
        b13.setFont(font1);
        b14.setFont(font1);
        b15.setFont(font1);
        b16.setFont(font1);
        b17.setFont(font1);
        b18.setFont(font1);
       
             

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
       

       
    }

    public void actionPerformed(ActionEvent e){

        if(e.getSource()==b1){
            t.setText(t.getText()+"0");
        }
        if(e.getSource()==b2){
        	t.setText(t.getText()+"1");
        }
           
       
        if(e.getSource()==b3){
        	t.setText(t.getText()+"2");
        }
        if(e.getSource()==b4){
        	t.setText(t.getText()+"3");
        }
        if(e.getSource()==b5){
        	t.setText(t.getText()+"4");
        }
        if(e.getSource()==b6){
        	t.setText(t.getText()+"5");
        }
        if(e.getSource()==b7){
        	t.setText(t.getText()+"6");
        }
        if(e.getSource()==b8){
        	t.setText(t.getText()+"7");
        }
        if(e.getSource()==b9){
        	t.setText(t.getText()+"8");
        }
        if(e.getSource()==b10){
        	t.setText(t.getText()+"9");
        }
        if(e.getSource()==b11){
        	t.setText(t.getText()+".");
        }
        else if(e.getSource()==b12) {
            t.setText("");
        }
 
        

        if(e.getSource()==b13){
            a = Double.parseDouble(t.getText());
            operator = 1;
            t.setText("");
        }
        if(e.getSource()==b14){
            a = Double.parseDouble(t.getText());
            operator = 2;
            t.setText("");
        }
        if(e.getSource()==b15){
            a = Double.parseDouble(t.getText());
            operator = 3;
            t.setText("");
        }
        if(e.getSource()==b16){
            a = Integer.parseInt(t.getText());
            operator = 4;
            t.setText("");
        }
        if(e.getSource()==b17){
        	a = Integer.parseInt(t.getText());
            operator = 5;
            t.setText("");
        }
        

        if(e.getSource()==b18){

        	b = Double.parseDouble(t.getText());

            if(operator == 1){
                ans = a + b;
            }else if(operator == 2){
                ans = a - b;
            }else if(operator == 3){
                ans = a * b;
            }else if(operator == 4){
                ans = a / b;
            }else if(operator == 5){
                temp = a * b;
                ans = temp / 100;
            }

            

            t.setText(""+ans);
            
            
            
          
            

        }

    }



  public static void main(String[] args) {

       new Calculator();
        
        

   }
  
  
}

	
	

