
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;


public class button extends JFrame {
    private Container c;
    private JButton b1,b2;
    private Font f;
    button(){
        initcomponanent();
    }
    public void initcomponanent(){
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.red);
        f=new Font("Arial",Font.BOLD,18);
        
        b1=new JButton("submit");
        b1.setBounds(100, 50, 200, 100);
        b1.setFont(f);
        c.add(b1);
        
        b2=new JButton("reset");
        b2.setBounds(310, 50, 200, 100);
        b2.setFont(f);
        c.add(b2);
    
}
    public static void main(String[] args) {
        button b=new button();
        b.setVisible(true);
        b.setBounds(100, 50, 200, 100);
        b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b.setBackground(Color.yellow);
        b.setTitle("JButton");
        
    }
    
}
