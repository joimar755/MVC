import Controller.*;
import vista.Frm_Registro;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        Frm_Registro f = new Frm_Registro();

        Controller_guardar ctl = new Controller_guardar(f);

        f.setVisible(true);
        f.setTitle("Registro");
    }
}