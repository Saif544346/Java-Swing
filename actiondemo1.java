
import java.awt.Color;
import java.awt.Container;



import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;


public class actiondemo1 extends JFrame{
    private Container c;
    
    private JTextField t1,t2;
    actiondemo1(){
    initcomponanet();
}
    public void  initcomponanet(){
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.orange);
        
        t1=new JTextField();
        t1.setBounds(50, 50, 150, 50);
        c.add(t1);
        
        t2=new JTextField();
        t2.setBounds(50, 120, 150, 50);
        c.add(t2);
        
     //   t1.addActionListener(new ActionListener(){
            
      //      public void actionperformed(ActionEvent e)
        //    {
           // String s=t1.getText();
           // JOptionPane.showMessageDialog(null, "t1"+s);
           // }
        
        
        
      //  });
        
      
        
        
        
    }
    
    public static void main(String[] args) {
        actiondemo1 frame=new actiondemo1();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 50, 200, 150);
        frame.setTitle("Wellcome");
        
    }
    
}
