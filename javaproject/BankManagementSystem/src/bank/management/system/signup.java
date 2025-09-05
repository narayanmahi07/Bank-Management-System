package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class signup extends JFrame implements ActionListener {

    JRadioButton r1,r2,m1,m2,m3;

    JButton next;

    JTextField textName , textFname, textEmail ,textAdd , textCity,textPCode,textState;
    JDateChooser dateChooser;

    Random ran =new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;

String first = " " + Math.abs(first4);



    signup(){

        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 100, 100);   // Correct bounds
        add(image);

JLabel label1 = new JLabel("APPLICATION FORM NUMBER" + first);
label1.setBounds(160,20,600,40);
label1.setFont(new Font("Raleway",Font.BOLD,28));
add(label1);


JLabel label2 = new JLabel("Page 1");
label2.setFont(new Font("Ralway",Font.BOLD,22));
label2.setBounds(330,70,600,30);
add(label2);

JLabel label3 = new JLabel("Personal Details");
label3.setFont(new Font("Ralway",Font.BOLD,22));
label3.setBounds(290,90,600,30);
add(label3);

JLabel labelName = new JLabel(("Name :"));
labelName.setFont(new Font("Ralway",Font.BOLD,20));
labelName.setBounds(100,190,100,30);
add(labelName);


textName = new JTextField();
textName.setFont(new Font("Ralway",Font.BOLD,14));
textName.setBounds(300,190,400,30);
add(textName);


        JLabel labelfName = new JLabel(("Father's Name :"));
        labelfName.setFont(new Font("Ralway",Font.BOLD,20));
        labelfName.setBounds(100,240,200,30);
        add(labelfName);


        textFname = new JTextField();
        textFname.setFont(new Font("Ralway",Font.BOLD,14));
        textFname.setBounds(300,240,400,30);
        add(textFname);


        JLabel DOB = new JLabel(("Date of Birth :"));
        DOB.setFont(new Font("Ralway",Font.BOLD,20));
        DOB.setBounds(100,340,200,30);
        add(DOB);


        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,340,400,30);
        add(dateChooser);


        JLabel labelG = new JLabel("Gender :");
        labelG.setFont(new Font("Ralway",Font.BOLD,20));
        labelG.setBounds(100,290,200,30);
        add(labelG);

// Male button
        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
//        r1.setBackground(new Color(222, 225, 228));
        r1.setBounds(300, 290, 80, 30);
        r1.setOpaque(false);
        add(r1);

// Female button
        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
//        r2.setBackground(new Color(222, 225, 228)); // ✅ Fixed here
        r2.setBounds(400, 290, 100, 30);
        r2.setOpaque(false);
        add(r2);

// Group the radio buttons (so only one can be selected at a time)
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(r1);
        genderGroup.add(r2);


        JLabel labelEmail = new JLabel("Email address :");
        labelEmail.setFont(new Font("Raleway",Font.BOLD,20));
        labelEmail.setBounds(100,390,200,30);
        add(labelEmail);



        textEmail = new JTextField();
        textEmail.setFont(new Font("Ralway",Font.BOLD,14));
        textEmail.setBounds(300,390,400,30);
        add(textEmail);



        JLabel labelMs = new JLabel("Marital Status :");
        labelMs.setFont(new Font("Raleway",Font.BOLD,20));
        labelMs.setBounds(100,440,200,30);
        add(labelMs);

         m1 = new JRadioButton("Married");
         m1.setBounds(300,440,100,30);
         m1.setFont(new Font("Raleway",Font.BOLD,14));
         m1.setOpaque(false);
         add(m1);



        m2 = new JRadioButton("UN Married");
        m2.setBounds(400,440,120,30);
        m2.setFont(new Font("Raleway",Font.BOLD,14));
        m2.setOpaque(false);
        add(m2);


        m3 = new JRadioButton("Other");
        m3.setBounds(520,440,100,30);
        m3.setFont(new Font("Raleway",Font.BOLD,14));
        m3.setOpaque(false);
        add(m3);


        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);
        buttonGroup1.add(m3);


//        textMs = new JTextField();
//        textMs.setFont(new Font("Ralway",Font.BOLD,14));
//        textMs.setBounds(300,440,400,30);
//        add(textMs);



        JLabel labelAdd = new JLabel("Address :");
        labelAdd.setFont(new Font("Raleway",Font.BOLD,20));
        labelAdd.setBounds(100,490,200,30);
        add(labelAdd);



        textAdd = new JTextField();
        textAdd.setFont(new Font("Ralway",Font.BOLD,14));
        textAdd.setBounds(300,490,400,30);
        add(textAdd);


        JLabel labelCity = new JLabel("City :");
        labelCity.setFont(new Font("Raleway",Font.BOLD,20));
        labelCity.setBounds(100,540,200,30);
        add(labelCity);



        textCity = new JTextField();
        textCity.setFont(new Font("Ralway",Font.BOLD,14));
        textCity.setBounds(300,540,400,30);
        add(textCity);


        JLabel labelPCode = new JLabel("Pin Code :");
        labelPCode.setFont(new Font("Raleway",Font.BOLD,20));
        labelPCode.setBounds(100,590,200,30);
        add(labelPCode);



        textPCode = new JTextField();
        textPCode.setFont(new Font("Ralway",Font.BOLD,14));
        textPCode.setBounds(300,590,400,30);
        add(textPCode);


        JLabel labelState = new JLabel("State :");
        labelState.setFont(new Font("Raleway",Font.BOLD,20));
        labelState.setBounds(100,640,200,30);
        add(labelState);



        textState = new JTextField();
        textState.setFont(new Font("Ralway",Font.BOLD,14));
        textState.setBounds(300,640,400,30);
        add(textState);


        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.black);
        next.setForeground(Color.WHITE);
        next.setBounds(620,710,80,30);
        next.addActionListener(this);
        add(next);



        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args){
        new signup();
    }
}
