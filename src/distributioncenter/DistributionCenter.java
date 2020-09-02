/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distributioncenter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;


import java.awt.event.WindowEvent;




   
    

    
    public class DistributionCenter extends javax.swing.JFrame implements ActionListener  {
    private javax.swing.JLabel plaine;
    private javax.swing.JLabel plaine0;
    private javax.swing.JLabel plaine1;
    private javax.swing.JLabel plaine2;
    private javax.swing.JLabel plaine3;
    private javax.swing.JLabel plaine4;
    private javax.swing.JLabel plaine5;
    private javax.swing.JLabel plaine6;
    private javax.swing.JLabel plaine7;
    private javax.swing.JLabel plaine8;
    private javax.swing.JLabel plaine9;
    private javax.swing.JLabel plaine10;
    private javax.swing.JLabel plaine11;
    private javax.swing.JLabel plaine12;
    private javax.swing.JLabel plaine13;
    private javax.swing.JLabel plaine14;
    private javax.swing.JLabel plaine15;
    private javax.swing.JLabel plaine16;
    private javax.swing.JLabel plaine17;
    private javax.swing.JLabel plaine18;
    private javax.swing.JLabel plaine19;
    private javax.swing.JLabel plaine20;
    private javax.swing.JLabel plaine21;
    private javax.swing.JLabel plaine22;
    private javax.swing.JLabel plaine23;
    private javax.swing.JLabel plaine24;
    private javax.swing.JLabel plaine25;
    private javax.swing.JLabel plaine26;
    private javax.swing.JLabel plaine27;
    private javax.swing.JLabel plaine28;
    private javax.swing.JLabel plaine29;
    private javax.swing.JLabel title;
    private javax.swing.JButton jBtnExit;
    private javax.swing.JButton jBtnLogin;
    private javax.swing.JLabel register;
    private javax.swing.JPanel PanelNorth;
    private javax.swing.JPanel PanelCenter;
    private javax.swing.JPanel PanelSouth;
    private javax.swing.JLabel jPassword;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField jTextUserName;
    private javax.swing.JLabel jUserName;
    private Font ft;
    private JFrame frame1;
    private JFrame frame;
    


     public DistributionCenter(){ 
         
         
        frame1= new JFrame("Distribution Center");
        PanelNorth = new javax.swing. JPanel();
        PanelCenter = new javax.swing. JPanel();
        PanelSouth = new javax.swing. JPanel();
        jUserName = new javax.swing.JLabel("Username : ");
        jPassword = new javax.swing.JLabel("Password : ");
        jTextUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jBtnExit = new javax.swing.JButton("Exit");
        jBtnLogin = new javax.swing.JButton("Login");
        register = new javax.swing.JLabel("create a new account");
        plaine0 = new javax.swing.JLabel ();
        txtPassword = new javax.swing.JPasswordField();
        ft = new Font("Tahoma", Font.BOLD, 15);
        title = new javax.swing.JLabel ("Login");
        plaine = new javax.swing.JLabel ();
        plaine1 = new javax.swing.JLabel ();
        plaine2 = new javax.swing.JLabel ();
        plaine3 = new javax.swing.JLabel ();
        plaine4 = new javax.swing.JLabel ();
        plaine5 = new javax.swing.JLabel ();
        plaine6 = new javax.swing.JLabel ();
        plaine7 = new javax.swing.JLabel ();
        plaine8 = new  javax.swing.JLabel ();
        plaine9 = new  javax.swing.JLabel ();
        plaine10 = new javax.swing.JLabel ();
        plaine11 = new javax.swing.JLabel ();
        plaine12 = new javax.swing.JLabel ();
        plaine13 = new javax.swing.JLabel ();
        plaine14 = new javax.swing.JLabel ();
        plaine15 = new javax.swing.JLabel ();
        plaine16 = new javax.swing.JLabel ();
        plaine17 = new javax.swing.JLabel ();
        plaine18 = new javax.swing.JLabel ();
        plaine19 = new javax.swing.JLabel ();
        plaine20 = new javax.swing.JLabel ();
        plaine21 = new javax.swing.JLabel ();
        plaine22 = new javax.swing.JLabel ();
        plaine23 = new javax.swing.JLabel ();
        plaine24 = new javax.swing.JLabel ();
        plaine25 = new javax.swing.JLabel ();
        plaine26 = new javax.swing.JLabel ();
        plaine27 = new javax.swing.JLabel ();
        plaine28 = new javax.swing.JLabel ();
        plaine29 = new javax.swing.JLabel ();


    }
   
    public void setGUI() {
        
        frame1.setPreferredSize(new java .awt.Dimension(850, 390));
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setVisible(true);
        frame1.pack();
        
        PanelNorth.setLayout(new GridLayout(1,1));
        PanelNorth.setBackground(Color.darkGray);
        
      
        PanelCenter.setLayout(new GridLayout(5, 3));
       
        
        
        PanelSouth.setLayout(new GridLayout(3, 5));
        
        
        
      
        jUserName.setFont(ft);
        jUserName.setHorizontalAlignment(javax.swing.JLabel.RIGHT);
        
       jTextUserName.setFont(ft);
        jTextUserName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 1));
        jTextUserName .setPreferredSize(new  java .awt. Dimension(60,5));
        
        jPassword.setFont(ft);
        jPassword.setHorizontalAlignment(javax.swing.JLabel.RIGHT);
        
        txtPassword.setFont(ft);
        txtPassword.setFont(ft);
        txtPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 1));
        
        title.setFont(new java.awt.Font("Tahoma", 1, 32));
        title.setForeground(Color.white);
        title.setHorizontalAlignment(javax.swing.JLabel.CENTER);
        
        
        
        jBtnLogin.setFont(ft);
       /* jBtnClear.setFont(ft);*/
        jBtnExit.setFont(ft);
        register.setFont(ft);
        register.setForeground(Color.BLUE);
        PanelNorth.add(title);
        
        PanelCenter.add(plaine1);
        PanelCenter.add(plaine2);
        PanelCenter.add(plaine3);
        PanelCenter.add(jUserName);
        PanelCenter.add(jTextUserName);
        PanelCenter.add(plaine4);
        PanelCenter.add(plaine27);
        PanelCenter.add(plaine28);
        PanelCenter.add(plaine29);
        PanelCenter.add(jPassword);
        PanelCenter.add(txtPassword);
        PanelCenter.add(plaine5);
        PanelCenter.add(plaine6);
        PanelCenter.add(plaine7);
        PanelCenter.add(plaine8);
                
        PanelSouth.add(plaine9);
        PanelSouth.add(jBtnLogin);
            
             
                
        PanelSouth.add(plaine10);
          PanelSouth.add(jBtnExit);
        PanelSouth.add(plaine12);
      
       
        PanelSouth.add(plaine11);
        PanelSouth.add(plaine17);
        PanelSouth.add(plaine0);
        PanelSouth.add(plaine18);
        PanelSouth.add(plaine13);
       
        PanelSouth.add(plaine21);
        PanelSouth.add(plaine22);
        PanelSouth.add(register);
        PanelSouth.add(plaine24);
        PanelSouth.add(plaine25);
       /* PanelSouth.add(plaine26);*/
        
        frame1.add(PanelNorth);
        frame1.add(PanelCenter);
        frame1.add(PanelSouth);
      
      
        
        frame1.add(PanelNorth, BorderLayout.NORTH);
        frame1.add(PanelCenter, BorderLayout.CENTER);
        frame1.add(PanelSouth, BorderLayout.SOUTH);
        
        jBtnLogin.addActionListener(this);
        jBtnLogin.addMouseListener(new MouseAdapter(){
            
        
        });
              
        
        
        jBtnExit.addActionListener(this);
      
  
      
    }
    
    public static void main(String[] args) {
         new DistributionCenter().setGUI();
    }

   @Override
    public void actionPerformed(ActionEvent e) {
            
            
        if (e.getActionCommand().equals("Login")) {
            User u = new User(jTextUserName.getText(), txtPassword.getText());
            if (u.isValidUser()) {
                CenterRegistration setUp = new CenterRegistration ();
                setUp.setVisible(true);
               
                setUp.pack();
                setUp.setLocationRelativeTo(null);
               setUp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.setVisible(false);
                JOptionPane.showMessageDialog(null, "Successfull");
            }
            
            else {
                JOptionPane.showMessageDialog(null, "Invalid user");
                
            }
        }
        /*else if (e.getActionCommand().equals("Clear")) {
            jTextUserName.setText("");
            txtPassword.setText("");
            jTextUserName.requestFocus();
        }*/
        else if (e.getActionCommand().equals("Exit")) {
            System.exit(0);
        }
    }
     
    
private void systemExit()
{
 WindowEvent winClosing = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
    }
}
    

