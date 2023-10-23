
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class jframebg extends JFrame {
    private Container c;
    jframebg(){
        initcomponanent();
    }
    public void initcomponanent(){
        c=this.getContentPane();
        c.setBackground(Color.red);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300, 50, 400, 300);
        setTitle("welcome");
        
        
    }
    public static void main(String[] args) {
        jframebg frame=new jframebg();
        frame.setVisible(true);
       String name=  JOptionPane.showInputDialog("enter your first name");
      String name2= JOptionPane.showInputDialog("enter your last name");
      JOptionPane.showMessageDialog(null, "your full name is "+name+ " "+name2);
       
        
       
        
        
    }
    
}
