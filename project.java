
import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class project extends JFrame {
    private Container c;
    private JLabel imglabel,textlabel;
    private JTextArea ta;
    private JButton b;
    private JTextField tf;
    
    project(){
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
    }
    public static void main(String[] args) {
        project p=new project();
        p.setVisible(true);
        p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p.setBounds(300, 20, 360, 700);
        p.setTitle("Multiplication Table");
    }
    
}
