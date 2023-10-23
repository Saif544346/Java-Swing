
import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class framedemo extends JFrame {
    private ImageIcon icon;
    framedemo(){
        inicomponents();
        
    }
    public void inicomponents() {
        
        icon=new ImageIcon(getClass().getResource("image.png"));
        this.setIconImage(icon.getImage());
    }
    public static void main(String[] args) {
        framedemo f=new framedemo();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     //   f.setTitle("hellow everyone");
        f.setBounds(500, 400, 300, 200);
        
    }
}
