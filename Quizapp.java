/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.quizapp;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
 /*
 * @author luald
 */
public abstract class Quizapp extends JFrame implements ActionListener {
     
    JLabel label;
    
    JRadioButton radioButtons[] = new JRadioButton[5];
    JButton btnNext, btnResult;
    ButtonGroup bg;
    int count = 0;
    int current = 0;
    int x = 1;
    int y = 1;
    int now = 0;
    int m[] = new int[10];
  
    
    
    Quizapp(String s){
        super(s);
        label = new JLabel();
        add(label); 
        bg = new ButtonGroup();
    
     for (int i = 0; i <5; i++){
    
    radioButtons[i] = new JRadioButton();
    add(radioButtons[i]);
    bg.add(radioButtons[i]);
          
}
 btnNext = new JButton("Next");
 btnResult = new  JButton("Result");
 btnResult.setVisible(false);
 btnResult.addActionListener(this);
 btnNext.addActionListener(this);
 add(btnNext);
 add(btnResult);
}
    
   void setData(){
       
   }
    
public static void main(String[] args) {
       Quizapp("simple quiz app");
       
    }
}
