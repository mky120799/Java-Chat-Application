
package chatting.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Server extends JFrame implements ActionListener {
    JTextField text;
    JPanel a1;
    Server(){
        setLayout(null);
        // green panel code
        
        JPanel p1=new JPanel();
        p1.setBackground(new Color(7, 94,84));
        p1.setBounds(0,0,450,70);
        p1.setLayout(null);
        add(p1);
        
        // back arrow code
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/3.png"));
        Image i2=i1.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel back= new JLabel(i3);
        back.setBounds(5,20,25,25);
        p1.add(back);
        
        back.addMouseListener(new MouseAdapter()
                {
                    @Override
                    public void mouseClicked(MouseEvent ae){
                        System.exit(0);
                    }
                });
        
        // (nawaudin sidique)profile  picture code
        
        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("icons/1.png"));
        Image i5=i4.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT);
        ImageIcon i6= new ImageIcon(i5);
        JLabel profile= new JLabel(i6);
        profile.setBounds(40,10,50,50);
        p1.add(profile);
        
        // video image code
        
        ImageIcon i7=new ImageIcon(ClassLoader.getSystemResource("icons/video.png"));
        Image i8=i7.getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT);
        ImageIcon i9= new ImageIcon(i8);
        JLabel video= new JLabel(i9);
        video.setBounds(300,20,30,30);
        p1.add(video);
        
        //phone image code
        
        ImageIcon i10=new ImageIcon(ClassLoader.getSystemResource("icons/phone.png"));
        Image i11=i10.getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT);
        ImageIcon i12= new ImageIcon(i11);
        JLabel phone= new JLabel(i12);
        phone.setBounds(360,20,30,30);
        p1.add(phone);
        
        //three dote image code
        ImageIcon i13=new ImageIcon(ClassLoader.getSystemResource("icons/3icon.png"));
        Image i14=i13.getImage().getScaledInstance(10,25,Image.SCALE_DEFAULT);
        ImageIcon i15= new ImageIcon(i14);
        JLabel morevert= new JLabel(i15);
        morevert.setBounds(420,20,10,25);
        p1.add(morevert);
        
        //user name code
        JLabel name=new JLabel("Nawazudin");
        name.setBounds(110,15,100,18);
        name.setForeground(Color.WHITE);
        name.setFont(new Font("SAN_SARIF",Font.BOLD,18));
        p1.add(name);
        
        // status code
        JLabel status=new JLabel("Active Now");
        status.setBounds(110,35,100,18);
        status.setForeground(Color.WHITE);
        status.setFont(new Font("SAN_SARIF",Font.BOLD,14));
         p1.add(status);
         
         
         
        //creating second panel for chat section
        
        a1=new JPanel();
        a1.setBounds(5,75,440,570);
        add(a1);
        
        text=new JTextField();
        text.setBounds(5,655,310,40);
        text.setFont(new Font("SAN_SARIF",Font.PLAIN,16));
        add(text);
        
        // send button configure code
        
        JButton send=new JButton("send");
        send.setBounds(320,655,123,40);
        send.setBackground(new Color(7,94,84));
        send.setForeground(Color.WHITE);
        send.setFont(new Font("SAN_SARIF",Font.PLAIN,16));
        add(send);
        
        
        setSize(450,700);
        setLocation(0,0);
       
        setUndecorated(true);
        getContentPane().setBackground(Color.WHITE);
        
        
        
        
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        
     String out=text.getText();
//     System.out.println(out);
    }
    public static void main(String[] args)
    {   
        new Server();
    }
}
