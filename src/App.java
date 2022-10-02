import javax.swing.JButton;

import Controller.*;
import vista.Frm_Registro;
import vista.Frm_login;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        Frm_Registro f = new Frm_Registro();
        Frm_login login = new Frm_login();
        JButton boton = new JButton();
        // JButton button = new JButton();

        Controller_guardar ctl = new Controller_guardar(f, boton, login);
        ctl.Frm_Registro_1();

        // f.setVisible(true);
        // f.setTitle("Registro");
    }
}
