/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.quizapp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
 /*
 * @author luald
 */
public class Quizapp extends JFrame implements ActionListener {
     
    JLabel label;
    JRadioButton radioButtons[] = new JRadioButton[5];
    JButton btnNext, btnResult;
    ButtonGroup bg;
    int count = 0;
    int current = 0;
    int x = 1;
    int y = 1;
    int now = 0;
    int m[] = new int[15];
  
    
    
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
 setData();
 label.setBounds(30, 40, 450, 20);
 radioButtons[0].setBounds(50, 80, 450, 20);
 radioButtons[1].setBounds(50, 110, 200, 20);
 radioButtons[2].setBounds(50, 140, 200, 20);
 radioButtons[3].setBounds(50, 170, 200, 20);
 btnNext.setBounds(100, 240, 100, 30);
 btnResult.setBounds(270, 240, 100, 30);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 setLayout(null);
 setLocation(250, 100);
 setVisible(true);
 setSize(600,350);
 
}
    
   void setData(){
       radioButtons[4].setSelected(true);
       if(current == 0) {
           label.setText("question 1. Who is the 4th prime minister of canada?");
           radioButtons[0].setText("John Sparrow");
         radioButtons[1].setText("dwayne the rock johnson");  
         radioButtons[2].setText("Drake");
         radioButtons[3].setText("Justin Bieber");
       }
       if (current == 1){
           label.setText("Question 2. What year was the movie scarface released?");
           radioButtons[0].setText("1987");
           radioButtons[1].setText("1609");
           radioButtons[2].setText("2009");
           radioButtons[3].setText("1990");
       }
       if (current == 2){
           label.setText("Question 3. How many legs does a spider have?");
           radioButtons[0].setText("8");
           radioButtons[1].setText("20");
           radioButtons[2].setText("12");
           radioButtons[3].setText("40");
       }
       
       if (current == 3) {
           label.setText("Question 4. What is something hit with a hammer?");
           radioButtons[0].setText("A nail.");
           radioButtons[1].setText("An Apple");
           radioButtons[2].setText("A donut");
           radioButtons[3].setText("A laptop");
       }
       if (current == 4) {
           label.setText("Question 5. Whats the name of a place you go to see lots of animals?");
           radioButtons[0].setText("The zoo");
           radioButtons[1].setText("The Library");
           radioButtons[2].setText("The grocery Store");
           radioButtons[3].setText("A school");
       }
       if (current == 5) {
           label.setText("Question 6. What is the name of the fairy in peter pan?");
           radioButtons[0].setText("Tinkerbell");
           radioButtons[1].setText("Celine Dion");
           radioButtons[2].setText("Michael Jordan");
           radioButtons[3].setText("John Cena");
           
       }
       if (current == 6) {
           label.setText("Question 7. If you freeze water what do you get?");
           radioButtons[0].setText("Ice.");
           radioButtons[1].setText("Steam");
           radioButtons[2].setText("Nothing");
           radioButtons[3].setText("Boiling water");
           
       }
       if (current == 7) {
           label.setText("Question 8. How many stars are in the American Flag?");
           radioButtons[0].setText("50");
           radioButtons[1].setText("20");
           radioButtons[2].setText("1 million");
           radioButtons[3].setText("68");
           
       }
       if (current == 8) {
           label.setText("Question 9. Where does the President of the United States Live while in office?");
           radioButtons[0].setText("The White House");
           radioButtons[1].setText("Rehab center");
           radioButtons[2].setText("A mansion");
           radioButtons[3].setText("In The Bahamas");
       }
       if (current == 9) {
           label.setText("Question 10. Which disney Movie is Elsa in?");
           radioButtons[0].setText("Frozen");
           radioButtons[1].setText("Peter Pan");
           radioButtons[2].setText("The Lion king");
           radioButtons[3].setText("Mulan");
       }
       
       if (current == 10) {
           label.setText("Question 11. What are the names of the two actors in The movie Rush Hour?");
           radioButtons[0].setText("Jackie Chan, Chris Tucker");
           radioButtons[1].setText("Vin Diesel, The rock");
           radioButtons[2].setText("Hillary duff, steve o");
           radioButtons[3].setText("Jack nicholson, denzel washington");
       }
       if(current == 11) {
           label.setText("Question 12. Where does santa clause Live?");
           radioButtons[0].setText("Japan");
           radioButtons[1].setText("Mexico");
           radioButtons[2].setText("No where because hes not real");
           radioButtons[3].setText("The North Pole");
           
       }
       if (current == 12) {
           label.setText("Question 13. What is the color of a schoolbus?");
           radioButtons[0].setText("Red");
           radioButtons[1].setText("Yellow");
           radioButtons[2].setText("Blue");
           radioButtons[3].setText("Orange");
       }
       if (current == 13) {
       label.setText("Question 14. Where is the Great Pyramid of Giza?");
       radioButtons[0].setText("America");
       radioButtons[1].setText("Mexico");
       radioButtons[2].setText("Egypt");
       radioButtons[3].setText("Poland");
       
   }
       if (current == 14) {
           label.setText("Question 15. What Does a Bee make?");
           radioButtons[0].setText("Honey");
           radioButtons[1].setText("Cookies");
           radioButtons[2].setText("Spring Rolls");
           radioButtons[3].setText("Pizza");
       }
       label.setBounds(30,40,450,20);
       for(int x = 0, y = 0; x <= 90; x += 30, y ++){
           radioButtons[y].setBounds(50, 80 +x, 200, 20);
       
   }
       
       
   }
   boolean checkAnswer() {
       if(current == 0){
          return(radioButtons[1].isSelected()); 
       }
       if (current == 1){
           return(radioButtons[2].isSelected());
       }
       if (current == 2){
           return(radioButtons[3].isSelected());
       }
       if (current == 3 ){
           return(radioButtons[4].isSelected());
       }
       if (current == 4 ){
           return(radioButtons[5].isSelected());
       }
       if (current == 5){
           return(radioButtons[6].isSelected());
       }
       if (current == 6 ){
           return(radioButtons[7].isSelected());
       }
       if (current == 7 ){
           return(radioButtons[8].isSelected());
       }
       if (current == 8 ){
           return(radioButtons[9].isSelected());
       }
       if (current == 9){
           return(radioButtons[10].isSelected());
       }
       if (current == 10 ){
           return(radioButtons[11].isSelected());
       }
       if (current == 11 ){
           return(radioButtons[12].isSelected());
       }
       if (current == 12){
           return(radioButtons[13].isSelected());
       }
       if (current == 13 ){
           return(radioButtons[14].isSelected());
       }
       if (current == 14 ){
           return(radioButtons[15].isSelected());
       }
       return false;
   }
   
   
   
        public static void main(String[] args) {
            new Quizapp("simple quiz app"); 
           }

           @Override
        public void actionPerformed(ActionEvent e) {
           if (e.getSource()==btnNext){
             if(checkAnswer())  
                 count = count +1;
                 current ++;
                 setData();
             if (current == 14){
                     btnNext.setEnabled(false);
                     btnResult.setVisible(true);
                     btnResult.setText("result");
                 }
             }
             
           if (e.getActionCommand().equals("Result")){
             if (checkAnswer())
            count = count +1;
            current ++;
            JOptionPane.showMessageDialog(this, "Correct Answers are" + count);
            System.exit(0);
           }  
           }
          
           }
           
       
       
       
    

