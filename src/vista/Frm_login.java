package vista;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Frm_login extends JFrame {
    private Panel c;

    public Frm_login() {
        setSize(900, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        c = new Panel();

        this.getContentPane().add(c);

    }

}
