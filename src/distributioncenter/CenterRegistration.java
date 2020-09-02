/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distributioncenter;


import java.awt.event.ActionListener;



import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

/**
 *
 * @author clara
 */
public class CenterRegistration extends javax.swing.JFrame implements ActionListener{
    
     private JFrame frame;
    private javax.swing.JPanel PanelNorth;
    private javax.swing.JPanel PanelCenter;
    private javax.swing.JPanel PanelSouth;
    private javax.swing.JLabel title;
    private javax.swing.JLabel centerCode;
    private javax.swing.JLabel centerName;
    private javax.swing.JLabel centerAddress;
    private javax.swing.JLabel centerArea;
    private javax.swing.JLabel centerAreaCode;
    private javax.swing.JLabel centerCity;
    private javax.swing.JLabel phoneNumber;
    private javax.swing.JTextField TextCenterCode;
    private javax.swing.JTextField TextName;
    private javax.swing.JTextField TextAddress;
    private javax.swing.JTextField TextArea;
    private javax.swing.JComboBox City;
    private javax.swing.JTextField TextPhoneNumber;
    private javax.swing.JButton jBtnSave;
    private Font ft;
    private JLabel plaine0;
    private JLabel Plainlabel;
    private JLabel Plainlabe2;
    private JLabel Plainlabe3;
    private JLabel Plainlabe4;
    private JLabel Plainlabe5;
    private JLabel Plainlabe6;
    private JLabel Plainlabe7;
    private JLabel Plainlabe8;
    private JLabel Plainlabe9;
    private JLabel Plainlabel0;
    private JLabel Plainlabel1;
    private JLabel Plainlabel2;
    private JLabel Plainlabel3;
    private JLabel Plainlabel4;
    private JLabel Plainlabel5;
    private JLabel Plainlabe16;
    private JLabel Plainlabel7;
    private JLabel Plainlabel8;
    private JLabel Plainlabel9;
    private JLabel Plainlabel20;
    private JLabel Plainlabe21;
    private JLabel Plainlabe22; 
    private JLabel Plainlabe23;
    private JLabel Plainlabe24;
     private JLabel Plainlabe26;
    private JLabel Plainlabe27;
    private JLabel Plainlabe28;
    
    
    
    
    String[] cities ={"Cape Town","Johannesburg","Durban"};
    
    public CenterRegistration(){

        frame= new JFrame("Distribion Center");
        PanelNorth = new javax.swing. JPanel();
        PanelCenter = new javax.swing. JPanel();
        PanelSouth = new javax.swing. JPanel();
        title = new javax.swing.JLabel ("CENTER REGISTRATION");
        centerCode = new javax.swing.JLabel("Center Code: ");
        centerName = new javax.swing.JLabel("Center Name: ");
        centerAddress = new javax.swing.JLabel("Street Address: ");
        centerArea= new javax.swing.JLabel("Area Name: ");
        centerCity = new javax.swing.JLabel("City: ");
        phoneNumber = new javax.swing.JLabel("Phone: ");
        TextCenterCode = new javax.swing.JTextField();
        TextName = new javax.swing.JTextField();
        TextAddress = new javax.swing.JTextField();
        TextArea = new javax.swing.JTextField();
        City = new javax.swing.JComboBox(cities);
        TextPhoneNumber = new javax.swing.JTextField();
        jBtnSave = new javax.swing.JButton("Save");
        plaine0 = new javax.swing.JLabel ();
        ft = new Font("Tahoma", Font.BOLD, 15);
        Plainlabel= new javax.swing.JLabel ();
        Plainlabe2= new javax.swing.JLabel ();
        Plainlabe3=new javax.swing.JLabel ();
        Plainlabe4= new javax.swing.JLabel ();
        Plainlabe5 = new javax.swing.JLabel ();
        Plainlabe6 =new javax.swing.JLabel ();
        Plainlabe7 = new javax.swing.JLabel ();
        Plainlabe8 =new javax.swing.JLabel ();
        Plainlabe9 =new javax.swing.JLabel ();
        Plainlabel0 =new javax.swing.JLabel ();
        Plainlabel1 = new javax.swing.JLabel ();
        Plainlabel2 = new javax.swing.JLabel ();
        Plainlabel3 = new javax.swing.JLabel ();
        Plainlabel4 = new javax.swing.JLabel ();
        Plainlabel5 = new javax.swing.JLabel ();
        Plainlabe16 = new javax.swing.JLabel ();
        Plainlabel7 = new javax.swing.JLabel ();
        Plainlabel8 = new javax.swing.JLabel ();
        Plainlabel9 = new javax.swing.JLabel ();
        Plainlabel20 = new javax.swing.JLabel ();
        Plainlabe21 = new javax.swing.JLabel ();
        Plainlabe22 = new javax.swing.JLabel ();
        Plainlabe23 = new javax.swing.JLabel ();
        Plainlabe24 = new javax.swing.JLabel ();
        Plainlabe26 = new javax.swing.JLabel ();
        Plainlabe27 = new javax.swing.JLabel ();
        Plainlabe28 = new javax.swing.JLabel ();
        

        
    }
         public void setGUI() {
        
        frame.setPreferredSize(new java .awt.Dimension(850, 390));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();
        
        PanelNorth.setLayout(new GridLayout(1,1));
        PanelNorth.setBackground(Color.darkGray);
        
      
        PanelCenter.setLayout(new GridLayout(13, 3));
       
       PanelSouth.setLayout(new GridLayout(2, 3));
        
        
        title.setFont(new java.awt.Font("Tahoma", 1, 32));
        title.setForeground(Color.white);
        title.setHorizontalAlignment(javax.swing.JLabel.CENTER);
        centerCode.setFont(ft);
        centerCode.setHorizontalAlignment(javax.swing.JLabel.RIGHT);
        
        TextCenterCode.setFont(ft);
        TextCenterCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 1));
        TextCenterCode .setPreferredSize(new  java .awt. Dimension(60,5));
        
        centerName.setFont(ft);
        centerName.setHorizontalAlignment(javax.swing.JLabel.RIGHT);
        
        TextName.setFont(ft);
        TextName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 1));
        TextName .setPreferredSize(new  java .awt. Dimension(60,5));
        
        
        centerAddress.setFont(ft);
        centerAddress.setHorizontalAlignment(javax.swing.JLabel.RIGHT);
        
        TextAddress.setFont(ft);
        TextAddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 1));
        TextAddress .setPreferredSize(new  java .awt. Dimension(60,5));
        
        centerArea.setFont(ft);
        centerArea.setHorizontalAlignment(javax.swing.JLabel.RIGHT);
        
        TextArea.setFont(ft);
        TextArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 1));
        TextArea .setPreferredSize(new  java .awt. Dimension(60,5));
        
        centerCity.setFont(ft);
        centerCity.setHorizontalAlignment(javax.swing.JLabel.RIGHT);
        
        City.setFont(ft);
        City.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 1));
        City.setPreferredSize(new  java .awt. Dimension(60,5));
        
        phoneNumber.setFont(ft);
        phoneNumber.setHorizontalAlignment(javax.swing.JLabel.RIGHT);
        
        TextPhoneNumber.setFont(ft);
        TextPhoneNumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 1));
        TextPhoneNumber .setPreferredSize(new  java .awt. Dimension(60,5));
        
        jBtnSave.setFont(ft);
        
        PanelNorth.add(title);
        
        PanelCenter.add(plaine0);
        PanelCenter.add(Plainlabel);
        PanelCenter.add(Plainlabe2);
        PanelCenter.add(centerCode);
        PanelCenter.add(TextCenterCode);
        PanelCenter.add(Plainlabe3);
        PanelCenter.add(Plainlabe4);
        PanelCenter.add(Plainlabe5);
        PanelCenter.add(Plainlabe6);
        PanelCenter.add(centerName);
        PanelCenter.add(TextName);
        PanelCenter.add(Plainlabe7);
        PanelCenter.add(Plainlabe8);
        PanelCenter.add(Plainlabe9);
        PanelCenter.add(Plainlabel0);
        PanelCenter.add(centerAddress);
        PanelCenter.add(TextAddress);
        PanelCenter.add(Plainlabel1);
        PanelCenter.add(Plainlabel2);
        PanelCenter.add(Plainlabel3);
        PanelCenter.add(Plainlabel4);
        PanelCenter.add(centerArea);
        PanelCenter.add(TextArea);
        PanelCenter.add(Plainlabel5);
        PanelCenter.add(Plainlabe16);
        PanelCenter.add(Plainlabel7);
        PanelCenter.add(Plainlabel8);
        PanelCenter.add(centerCity);
        PanelCenter.add(City);
        PanelCenter.add(Plainlabel9);
         PanelCenter.add(Plainlabel20);
        PanelCenter.add(Plainlabe21);
        PanelCenter.add(Plainlabe22);
        PanelCenter.add(Plainlabe23);
        PanelCenter.add(phoneNumber);
        PanelCenter.add(TextPhoneNumber);
        PanelCenter.add(Plainlabe24);
        
        PanelSouth.add(Plainlabe26);
        PanelSouth.add(jBtnSave);
        PanelSouth.add(Plainlabe27);
        PanelSouth.add(Plainlabe28);
        
        
         PanelSouth.add(Plainlabel9);
        PanelSouth.add(Plainlabel9);
         PanelSouth.add(Plainlabel9);
        
        

        
        this.add(PanelNorth,BorderLayout.NORTH);
        this.add(PanelCenter,BorderLayout.CENTER);
        this.add(PanelSouth,BorderLayout.SOUTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        jBtnSave.addActionListener(this);
        
    }
  
         
    public static void main(String[] args) {
        new CenterRegistration().setGUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
