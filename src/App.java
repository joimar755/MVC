
import Modelo.Depa;
import vista.Frm_Registro;
// import vista.Frm_login;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        Frm_Registro Registro = new Frm_Registro();
        // Json j = new Json();
        // j.JsonFile();
        // Frm_login login = new Frm_login();
        Depa d = new Depa();
        d.Cargar_depa();

        // JButton button = new JButton();

        Registro.setVisible(true);
        // f.setTitle("Registro");
    }
}
