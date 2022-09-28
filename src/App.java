import javax.swing.JButton;

import Controller.*;
import vista.Frm_Registro;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        Frm_Registro f = new Frm_Registro();
        // JButton button = new JButton();
        JButton boton = new JButton();

        Controller_guardar ctl = new Controller_guardar(f, boton);
        ctl.Frm_Registro_1();

        f.setVisible(true);
        f.setTitle("Registro");
    }
}
