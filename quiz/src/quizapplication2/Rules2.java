/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizapplication2;

/**
 *
 * @author shilp
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Rules2 extends JFrame implements ActionListener {
    String name;
    JButton back,start;
    Rules2(String name){
        this.name=name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading=new JLabel("Welcome "+name+ " to Upgrade Minds");
        heading.setBounds(50,20,700,30);
        heading.setFont(new Font("Stencil",Font.BOLD,30));
        heading.setForeground(Color.BLUE);
        add(heading);
        
        JLabel rules=new JLabel();
        rules.setBounds(20,90,700,350);
        rules.setFont(new Font("Times New Roman",Font.PLAIN,16));
        rules.setText(
        "<html>"+ 
                "1. Participation in the quiz is free and open to all persons above 18 years old." + "<br><br>" +
                "2. There are a total 10 questions." + "<br><br>" +
                "3. You have only 30 seconds to answer the question." + "<br><br>" +
                "4. No cell phones or other secondary devices in the room or test area." + "<br><br>" +
                "5. No talking." + "<br><br>" +
                "6. No one else can be in the room with you." + "<br><br>" +
                "7. Participation in the quiz implies that participants accept the integrality of these rules." + "<br><br>" +
                "8. Inaccurate or dishonest declarations, or any fraud, results in the participant’s disqualification." + "<br><br>" +
            "<html>"
        );
        add(rules); 
       
        
       back = new JButton("Back");
      back.setBounds(250, 500, 100, 30);
      back.setBackground(Color.BLACK);
      back.setForeground(Color.WHITE);
      back.addActionListener(this);
      add(back);
       
       start = new JButton("start");
      start.setBounds(400,500, 100, 30);
      start.setBackground(Color.BLACK);
      start.setForeground(Color.WHITE);
      start.addActionListener(this);
      add(start);
      
     
      
       setSize(800,650);
       setLocation(350,100);
       setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
     if(ae.getSource()==start){
        setVisible(false);
        new quiztest(name);
     }   
    else if(ae.getSource()==back){
        setVisible(false);
        new login2();
    }
    }
    public static void main(String args[]){
        new Rules2("user");
    }
}
