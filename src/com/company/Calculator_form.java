package com.company;
                                           // 1.Create JFrame form for using Swing components with helping GUI
import javax.swing.*;                      //2.Create Listener for buttons
import java.awt.*;                         //3.Create ON and OFF methods
import java.awt.event.ActionEvent;         //4.Create an arithmetic operation method
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Calculator_form extends JFrame {

    private JPanel calculatePanel;
    private JTextField textField1;
    private JRadioButton ON;
    private JRadioButton OFF;
    private javax.swing.JButton buttonAdd;
    private JButton cButton;
    private JButton gh;
    private JButton button8;
    private JButton button7;
    private JButton buttonMin;
    private JButton button9;
    private JButton buttonMulti;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton buttonDel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton buttonQwuels;
    private JButton buttonPoint;
    private JButton button0;
    double number, answer;
    int calculation ;

    public Calculator_form(){
      add(calculatePanel);
      setTitle("Calculator");
      setSize(350,300);
      setDefaultCloseOperation(EXIT_ON_CLOSE);





      button0.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              textField1.setText(textField1.getText()+"0");

          }
      });
      button1.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              textField1.setText(textField1.getText()+"1");
          }
      });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"2");
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"3");
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"4");
            }
        });

        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"5");
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"6");
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"7");
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"8");
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"9");
            }
        });

        buttonMin.addActionListener(new ActionListener() {    // subtraction
            @Override
            public void actionPerformed(ActionEvent e) {
                calculation=2;
                textField1.setText(textField1.getText());
                number=Double.parseDouble(textField1.getText());
                textField1.setText("");

            }
        });
        buttonDel.addActionListener(new ActionListener() {   // division
            @Override
            public void actionPerformed(ActionEvent e) {
                calculation=4;
                textField1.setText(textField1.getText());
                number=Double.parseDouble(textField1.getText());
                textField1.setText("");
            }
        });
        buttonMulti.addActionListener(new ActionListener() {  // multiplication
            @Override
            public void actionPerformed(ActionEvent e) {
                calculation=3;
                textField1.setText(textField1.getText());
                number=Double.parseDouble(textField1.getText());
                textField1.setText("");

            }
        });
        buttonAdd.addActionListener(new ActionListener() {    // addition

            @Override
            public void actionPerformed(ActionEvent e) {
                calculation=1;
                textField1.setText(textField1.getText());
                number=Double.parseDouble(textField1.getText());
                textField1.setText("");
            }
        });
        buttonPoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+".");
            }
        });
        buttonQwuels.addActionListener(new ActionListener() {    //get the result
            @Override
            public void actionPerformed(ActionEvent e) {
              Operations();

            }
        });
        cButton.addActionListener(new ActionListener() {    // clean field
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
            }
        });
        gh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int length=textField1.getText().length();
                int number=textField1.getText().length()-1;
                if(length>0){
                    StringBuilder sd=new StringBuilder(textField1.getText());
                    sd.deleteCharAt(number);
                    textField1.setText(sd.toString());
                }

            }
        });
        OFF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                off();
            }
        });
        ON.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ON();
                textField1.setText("");
            }
        });

    }

    public void off(){
        JButton[] btn={button1,button0,button2,button3,button4,button5,button6,button7,button8,button9,cButton,
        gh,buttonQwuels,buttonAdd,buttonMulti,buttonPoint,buttonDel,buttonMin};
        for(JButton bt:btn){
            bt.setEnabled(false);
        }
    }

    public void ON(){
        JButton[] btn={button1,button0,button2,button3,button4,button5,button6,button7,button8,button9,cButton,
                gh,buttonQwuels,buttonAdd,buttonMulti,buttonPoint,buttonDel,buttonMin};
        for(JButton bt:btn){
            bt.setEnabled(true);
        }
    }



    public void Operations(){

        switch(calculation){
            case 1:   // addition
                answer=number+Double.parseDouble(textField1.getText());
                textField1.setText(Double.toString(answer));
                break;
            case 2:   // subtraction
                answer=number-Double.parseDouble(textField1.getText());
                textField1.setText(Double.toString(answer));
                break;
            case 3:   // multiplication
                answer=number*Double.parseDouble(textField1.getText());
                textField1.setText(Double.toString(answer));
                break;
            case 4:   // division
                answer=number/Double.parseDouble(textField1.getText());
                textField1.setText(Double.toString(answer));
                break;
        }
    }


}
