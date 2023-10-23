
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class jlabel2 extends JFrame {
    private Container c;
    private JLabel label,label2;
    private Font f;
    private ImageIcon img;
    jlabel2(){
        initcomponanent();
    }
    public void initcomponanent(){
        c=this.getContentPane();
        c.setBackground(Color.red);
        c.setLayout(null);
        img=new ImageIcon(getClass().getResource("png.png"));
        f=new Font ("Arial",Font.BOLD,18);
        label=new JLabel();
        label2=new JLabel();
        label.setText("Enter your First name");
        label.setBounds(300, 50, 200, 50);
        label.setFont(f);
        label.setForeground(Color.GREEN);
        label.setOpaque(true);
        label.setBackground(Color.YELLOW);
        label.setToolTipText("enter your first name");
        label=new JLabel(img);
        
        c.add(label);
        
        label2.setText("Enter your last name ");
        label2.setBounds(300, 120, 200, 50);
        label2.setFont(f);
        label2.setForeground(Color.MAGENTA);
        label2.setBackground(Color.YELLOW);
        label2.setOpaque(true);
        label2.setToolTipText("enter your last name");
        c.add(label2);
        
        
    }
    public static void main(String[] args) {
        jlabel2 frame=new jlabel2();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 20, 300, 120);
        frame.setTitle("Welcome");
        
    }
    
}
