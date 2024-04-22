package com.company;

import javax.swing.*;
import java.awt.*;
import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;
import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;
import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;   //Add needed libraries


public class Counter implements NativeKeyListener {                 //Create public class Counter that implements NativeKeyListener to be used when window is unfocused

    JFrame frame;
    JLabel label;
    JLabel label2;
    JLabel label3;
    JLabel label4;
    JLabel label5;
    JLabel label6;
    JTextField textField;
    JTextField textField2;
    JTextField textField3;
    JTextField textField4;
    JTextField textField5;
    JTextField textField6;
    JTextField textField7;
    JTextField text;                                                //Create needed fields for the popup window
    JTextField text2;                                               //Need six of each because of six different fields to alter
    JTextField text3;
    JTextField text4;
    JTextField text5;
    JTextField text6;
    JTextField text7;

    ImageIcon mankeli = new ImageIcon("mankeli.png");       //Copy path to needed picture

    public int count = 0;                                           //Create variables for all of the counters. Default count is 0
    public int count2 = 0;
    public int count3 = 0;
    public int count4 = 0;
    public int count5 = 0;
    public int count6 = 0;
    public int count7 = 0;

    Counter(){
        frame = new JFrame("Mankelilaskuri");
        frame.setSize(800,300);
        frame.setLayout(null);                                       //Create window frame
        frame.setIconImage(mankeli.getImage());


        label = new JLabel();
        label.setBounds(40,150,100, 100);           //Create six labels with the picture and assign them on their spots
        label.setIcon(mankeli);

        label2 = new JLabel();
        label2.setBounds(140,150,100, 100);
        label2.setIcon(mankeli);

        label3 = new JLabel();
        label3.setBounds(240,150,100, 100);
        label3.setIcon(mankeli);

        label4 = new JLabel();
        label4.setBounds(340,150,100, 100);
        label4.setIcon(mankeli);

        label5 = new JLabel();
        label5.setBounds(440,150,100, 100);
        label5.setIcon(mankeli);

        label6 = new JLabel();
        label6.setBounds(540,150,100, 100);
        label6.setIcon(mankeli);


        text = new JTextField();
        text.setBounds(40,20, 60, 30);
        text.setEditable(true);
        text.setBorder(null);
        text.setFont(new Font("Courier", Font.BOLD,15));    //Create text inside the window for each player

        text2 = new JTextField();
        text2.setBounds(140,20, 60, 30);
        text2.setEditable(true);
        text2.setBorder(null);
        text2.setFont(new Font("Courier", Font.BOLD,15));

        text3 = new JTextField();
        text3.setBounds(240,20, 60, 30);
        text3.setEditable(true);
        text3.setBorder(null);
        text3.setFont(new Font("Courier", Font.BOLD,15));

        text4 = new JTextField();
        text4.setBounds(340,20, 60, 30);
        text4.setEditable(true);
        text4.setBorder(null);
        text4.setFont(new Font("Courier", Font.BOLD,15));

        text5 = new JTextField();
        text5.setBounds(440,20, 60, 30);
        text5.setEditable(true);
        text5.setBorder(null);
        text5.setFont(new Font("Courier", Font.BOLD,15));

        text6 = new JTextField();
        text6.setBounds(540,20, 60, 30);
        text6.setEditable(true);
        text6.setBorder(null);
        text6.setFont(new Font("Courier", Font.BOLD,15));

        text7 = new JTextField();
        text7.setBounds(640,20, 100, 30);
        text7.setText("Kirosanoja:");
        text7.setEditable(false);
        text7.setBorder(null);
        text7.setFont(new Font("Courier", Font.BOLD,15));


        textField = new JTextField();
        textField.setBounds(50,70, 100, 110);
        textField.setBorder(null);
        textField.setEditable(false);
        textField.setFont(new Font("Courier", Font.BOLD,35));       //Create a text field that is changeable by keys for each player. Using F9-F20 rigth now
                                                                                //since they are the easiest to use with Stream Deck
        textField2 = new JTextField();
        textField2.setBounds(150,70, 100, 100);
        textField2.setBorder(null);
        textField2.setEditable(false);
        textField2.setFont(new Font("Courier", Font.BOLD,35));

        textField3 = new JTextField();
        textField3.setBounds(250,70, 100, 100);
        textField3.setBorder(null);
        textField3.setEditable(false);
        textField3.setFont(new Font("Courier", Font.BOLD,35));

        textField4 = new JTextField();
        textField4.setBounds(350,70, 100, 100);
        textField4.setBorder(null);
        textField4.setEditable(false);
        textField4.setFont(new Font("Courier", Font.BOLD,35));

        textField5 = new JTextField();
        textField5.setBounds(450,70, 100, 100);
        textField5.setBorder(null);
        textField5.setEditable(false);
        textField5.setFont(new Font("Courier", Font.BOLD,35));

        textField6 = new JTextField();
        textField6.setBounds(550,70, 100, 100);
        textField6.setBorder(null);
        textField6.setEditable(false);
        textField6.setFont(new Font("Courier", Font.BOLD,35));

        textField7 = new JTextField();
        textField7.setBounds(650,70, 100, 100);
        textField7.setBorder(null);
        textField7.setEditable(false);
        textField7.setFont(new Font("Courier", Font.BOLD,35));


        frame.add(label);
        frame.add(label2);
        frame.add(label3);
        frame.add(label4);
        frame.add(label5);
        frame.add(label6);
        frame.add(textField);
        frame.add(textField2);
        frame.add(textField3);
        frame.add(textField4);
        frame.add(textField5);
        frame.add(textField6);
        frame.add(textField7);
        frame.add(text);
        frame.add(text2);
        frame.add(text3);
        frame.add(text4);
        frame.add(text5);
        frame.add(text6);
        frame.add(text7);
        frame.setVisible(true);                                            //Add the created elements to the frame window

    }



    public void nativeKeyPressed(NativeKeyEvent e) {
        System.out.println("Key Pressed: " + NativeKeyEvent.getKeyText(e.getKeyCode()));

        if (e.getKeyCode() == NativeKeyEvent.VC_F9) {
            count++;
            textField.setText(count + "");
            }
        else if (e.getKeyCode() == NativeKeyEvent.VC_F10){                        //Assign buttons to set the text field count up and down when pressed.
             count--;                                                            //Currently using F9-F20. Using NativeKeyEvent to work when unfocused
             textField.setText(count + "");
            }

        else if (e.getKeyCode() == NativeKeyEvent.VC_F11) {
            count2++;
            textField2.setText(count2 + "");
            }
        else if (e.getKeyCode() == NativeKeyEvent.VC_F12){
            count2--;
            textField2.setText(count2 + "");
            }

        else if (e.getKeyCode() == NativeKeyEvent.VC_F13) {
            count3++;
            textField3.setText(count3 + "");
        }
        else if (e.getKeyCode() == NativeKeyEvent.VC_F14){
            count3--;
            textField3.setText(count3 + "");
        }

        else if (e.getKeyCode() == NativeKeyEvent.VC_F15) {
            count4++;
            textField4.setText(count4 + "");
        }
        else if (e.getKeyCode() == NativeKeyEvent.VC_F16){
            count4--;
            textField4.setText(count4 + "");
        }

        else if (e.getKeyCode() == NativeKeyEvent.VC_F17) {
            count5++;
            textField5.setText(count5 + "");
        }
        else if (e.getKeyCode() == NativeKeyEvent.VC_F18){
            count5--;
            textField5.setText(count5 + "");
        }

        else if (e.getKeyCode() == NativeKeyEvent.VC_F19) {
            count6++;
            textField6.setText(count6 + "");
        }
        else if (e.getKeyCode() == NativeKeyEvent.VC_F20){
            count6--;
            textField6.setText(count6 + "");
        }
        else if (e.getKeyCode() == NativeKeyEvent.VC_F21) {
            count7++;
            textField7.setText(count7 + "");
        }
    }
    //Assign buttons to set the text field count up and down when pressed.
    //Currently using F9 for + and F10 for -. Using NativeKeyEvent to work when unfocused


    public void nativeKeyReleased(NativeKeyEvent e) {

    }
                                                                                //Possible to use key release or typed functions here
    public void nativeKeyTyped(NativeKeyEvent e) {

        }


    public static void main(String[] args) {
        try {
            GlobalScreen.registerNativeHook();
        }
        catch (NativeHookException ex) {
            System.err.println("There was a problem registering the native hook.");
            System.err.println(ex.getMessage());

            System.exit(1);                                                     //Error code for nativehook
        }

        GlobalScreen.addNativeKeyListener(new Counter());                               //Add NativeKeyListener to Counter function
    }
}


