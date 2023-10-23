
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;


public class beckround extends JFrame {
    private Container c;{
    c=this.getContentPane();
    c.setBackground(Color.orange);
}
    
    public static void main(String[] args) {
        beckround a=new beckround();
        a.setVisible(true);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        a.setBounds(400, 400, 400, 400);
        
        
    }
    
}
