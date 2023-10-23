
import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class imgjlabel extends JFrame {
    private Container c;
    private JLabel imglabel;
    private ImageIcon img;
    imgjlabel(){
        initcomponanet();
    
}
    public void initcomponanet(){
        c=this.getContentPane();
        c.setBackground(Color.red);
        img=new ImageIcon(getClass().getResource("IMG_4113.JPG"));
        imglabel=new JLabel(img);
        imglabel.setBounds(20, 20,img.getIconWidth(),img.getIconHeight());
        c.add(imglabel);
        
        
    }
    public static void main(String[] args) {
        imgjlabel frame=new imgjlabel();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("welcome");
        frame.setBounds(200, 20,33,56);
    }
    
}
