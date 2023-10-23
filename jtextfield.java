
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;


public class jtextfield  extends JFrame{
    private Container C;
    private JTextField t1,t2;
    private Font f;
    private JPasswordField p;
    jtextfield (){
    initcomponanent();
}
    public void initcomponanent(){
        C=this.getContentPane();
        C.setBackground(Color.red);
        C.setLayout(null);
        f=new Font("Arial" ,Font.ROMAN_BASELINE+Font.ITALIC+Font.BOLD,18);
        t1=new JTextField();
        t1.setBounds(50, 50, 200, 50);
        t1.setFont(f);
        t1.setForeground(Color.YELLOW);
        t1.setBackground(Color.blue);
        t1.setHorizontalAlignment(JTextField.CENTER);
        p=new JPasswordField();
        p.setBounds(50, 200, 200, 50);
        p.setEchoChar('*');
        p.setFont(f);
        C.add(p);
       
        C.add(t1);
        t2=new JTextField();
        t2.setBounds(50, 120, 200, 50);
        t2.setToolTipText("text field 2");
        t2.setText("saif");
        t2.setFont(f);
        C.add(t2);
        
        
    
}
    public static void main(String[] args) {
        jtextfield frame=new jtextfield ();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("welcome");
        
    }
    
}
