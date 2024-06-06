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
public class login2 extends JFrame implements ActionListener {
    JTextField tname;
    JButton next,back;
    login2(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("icon2/login-icon.jpg"));
        JLabel image = new JLabel(i);
        image.setBounds(600,0,600,500);
        add(image);
        
         JLabel heading=new JLabel("UPGRADE MINDS");
        heading.setBounds(150,60,300,45);
        add(heading); 
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,30));
        heading.setForeground(Color.BLUE);
        
        JLabel name=new JLabel("Enter your name");
       name.setBounds(200,150,300,20);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD,20));
        name.setForeground(new Color(22,99,54));
        add(name);
        
         tname = new JTextField();
        tname.setBounds(150,200,300,25);
        tname.setFont(new Font("Palatino",Font.BOLD,18));
        add(tname);
        
        next = new JButton("Next");
      next.setBounds(150, 270, 120, 25);
      next.setBackground(Color.BLACK);
      next.setForeground(Color.WHITE);
      next.addActionListener(this);
      add(next);
        
       back = new JButton("Back");
      back.setBounds(300, 270, 120, 25);
      back.setBackground(Color.BLACK);
      back.setForeground(Color.WHITE);
      back.addActionListener(this);
      add(back);
        
        setVisible(true);
        setSize(1200,500);
        setLocation(250,200);
    }
        public void actionPerformed(ActionEvent ae){
         if(ae.getSource()==next){
             String name=tname.getText();
           setVisible(false);
           new Rules2(name);
        }else if(ae.getSource()==back){
             setVisible(false);  
         }
     }
    public static void main(String args[]){
        
        new login2();
    }

            
}
