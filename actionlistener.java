
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class actionlistener extends JFrame {
    private Container c;
    private JTextField t1,t2;
    private JPasswordField p;
    actionlistener(){
    initcomponanent();
}
    public void initcomponanent(){
        c=this.getContentPane();
        c.setBackground(Color.red);
        c.setLayout(null);
        p=new JPasswordField();
        p.setBounds(20, 200, 300, 100);
        c.add(p);
        
        t1=new JTextField();
        t1.setBounds(20, 20, 200, 50);
        c.add(t1);
         t2=new JTextField();
        t2.setBounds(20, 100, 200, 50);
        c.add(t2);
        Handlar handlar=new Handlar();
        
    
}
    Handlar implements ActionListener{
      public void actionperformed(ActionEvent e){
          String s=t1.getText();
          if(s.isEmpty())
          {
              JOptionPane.showMessageDialog(null, "Empty");
          }
          else{
              JOptionPane.showMessageDialog(null, ""+s);
          }
      }
      
  }
    public static void main(String[] args) {
        actionlistener frame=new actionlistener();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(50, 50, 300, 100);
        frame.setTitle("welcome");
        
    }
    
}
