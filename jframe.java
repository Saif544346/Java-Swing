
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class jframe {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //  f.setSize(400, 300);
      //  f.setLocationRelativeTo(null);
       // JOptionPane.showInternalMessageDialog(null, "hellow");
       // f.setLocation(200, 50);
       // f.setSize(300, 500);
       f.setBounds(700, 500, 700, 400);
       f.setTitle("Hello EveryOne");
       f.setResizable(false);
    }
    
}
