
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class Actiondemo2 extends JFrame  {
    private Container c;
    private JTextField t;
    private JButton b;
    Actiondemo2(){
        initcomponanent();
    }
    public void initcomponanent(){
        c=this.getContentPane();
        c.setBackground(Color.red);
        c.setLayout(null);
        
        t=new JTextField();
        t.setBounds(30, 50, 200, 50);
        c.add(t);
        b=new JButton("Clear");
        b.setBounds(30, 110, 100, 40);
        c.add(b);
        
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
               t.setText("");
            }
        
        
        });
        
    }
    
    public static void main(String[] args) {
        Actiondemo2 farme=new Actiondemo2();
        farme.setVisible(true);
        farme.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        farme.setTitle("JButton ActionListener Demo");
        farme.setBounds(50, 20, 400, 300);
        
    }
    
}
