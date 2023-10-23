
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class LoginFrame extends JFrame {
    private JLabel userlabel,passwordlabel;
    private JPasswordField p;
    private JTextField t;
    private JButton b1,b2;
    private Container c;
    private Font f;
    private Cursor cur;
    LoginFrame(){
        this.setBounds(100, 40, 300, 100);
        this.setTitle("Login Frome");
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE );
        f=new Font("Arial",Font.BOLD,20);
        cur=new Cursor(Cursor.HAND_CURSOR);
        
        userlabel=new JLabel("UserName:");
        userlabel.setBounds(50, 50, 150, 50);
        userlabel.setFont(f);
        c.add(userlabel);
        
        t=new JTextField();
        t.setBounds(160, 50, 250, 50);
        t.setFont(f);
        c.add(t);
        
        passwordlabel=new JLabel("Password:");
        passwordlabel.setBounds(50, 120, 150, 50);
        passwordlabel.setFont(f);
        c.add(passwordlabel);
        
      p=new JPasswordField();
      p.setBounds(160, 120, 250, 50);
      p.setFont(f);
      c.add(p);
      
      b1=new JButton("Submit");
      b1.setBounds(50, 200, 150, 50);
      b1.setBackground(Color.PINK);
      b1.setCursor(cur);
      c.add(b1);
      b1.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent ae){
              String username=t.getText();
              String password=p.getText();
              
              if(username.equals("saif")&&(password.equals("123")))
              {
                  JOptionPane.showMessageDialog(null, "sucssfully login thank you ");
                  
                  newframe fr=new newframe();
                  fr.setVisible(true);
              }else
              {
                  JOptionPane.showMessageDialog(null, "Invalid Password or Username Please Try Agin");
              }
              
                      
          }
          
      });
   
      
      
        b2=new JButton("clear");
      b2.setBounds(250, 200, 150, 50);
      b2.setBackground(Color.PINK);
      b2.setCursor(cur);
      c.add(b2);
     b2.addActionListener(new ActionListener(){
         @Override
         public void actionPerformed(ActionEvent e){
             p.setText("");
             t.setText("");
         }
         
     
     });
        
        
        
        
        
        
        
    }
    
    
    public static void main(String[] args) {
        LoginFrame l=new LoginFrame();
        l.setVisible(true);
        
        
    }
    
}
