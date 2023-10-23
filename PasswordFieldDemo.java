
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPasswordField;


public class PasswordFieldDemo extends JFrame {
    private Container c;
    private JPasswordField p;
    private Font f;
    PasswordFieldDemo(){
        initcomponent();
    }
    public void initcomponent(){
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.red);
        f=new Font("Arial",Font.BOLD,26);
        
        p=new JPasswordField();
        p.setBounds(100, 50, 200, 100);
        p.setEchoChar('*');
        p.setFont(f);
        p.setForeground(Color.BLACK);
        p.setBackground(Color.GREEN);
        c.add(p);
        
       
            
    }
    
    public static void main(String[] args) {
        PasswordFieldDemo p=new PasswordFieldDemo();
        p.setVisible(true);
        p.setBounds(50, 50, 200, 100);
        p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
