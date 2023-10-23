
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class jbutton extends JFrame{
    private Container c;
    private JButton b1,b2;
    private Cursor s;
    private JPasswordField p;
    private JLabel l;
    private JTextField t;
    private Font f;
    jbutton(){
        initcomponanent();
    
}
    public void initcomponanent(){
        c=this.getContentPane();
        c.setBackground(Color.GREEN);
        c.setLayout(null);
        f=new Font("Arial",Font.ITALIC,20);
        
        s=new Cursor(Cursor.HAND_CURSOR);
        l=new JLabel();
        l.setText("enter your name");
        l.setBounds(20, 200, 200, 50);
        l.setFont(f);
        c.add(l);
        t=new JTextField();
        t.setBounds(50, 300, 400, 100);
        t.setFont(f);
        c.add(t);
        p=new JPasswordField();
        p.setBounds(20, 120, 200, 50);
        p.setEchoChar('*');
        c.add(p);
        b1=new JButton("submit");
        b1.setBounds(20, 50, 100, 40);
        b1.setCursor(s);
        c.add(b1);
        
        b2=new JButton("clear");
        b2.setBounds(150, 50, 100, 40);
        c.add(b2);
        
    }
    public static void main(String[] args) {
        jbutton frame=new jbutton();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("welcome");
        
    }
    
}
