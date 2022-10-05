package vista;

import javax.swing.*;
import Controller.Controller_guardar;
import java.awt.*;
public class Frm_Registro extends JFrame {
    private JPanel container;
    private JButton boton;
    private JButton Boton_login;
    private JTextField Txt_Nombre;
    private JTextField Txt_apellido;
    private JTextField Txt_Correo;
    private JTextField Txt_Direccion;
    private JPasswordField Txt_Password;
    private Controller_guardar controllerRegistrar;

    public Frm_Registro() {
        setSize(800, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        controllerRegistrar = new Controller_guardar();

        run();

    }

    public void run() {
        container = new JPanel();
        container.setLayout(null);
        

        Formulario(container);
        Fecha(container);
        Boton(container);

        this.getContentPane().add(container);
    }
    public void Formulario(JPanel container) {
       
        GridLayout gl = new GridLayout(30, 20, 45, 5);

        JLabel Lbl_Nombre = new JLabel("Nomnbre: ");
        Txt_Nombre = new JTextField(20);

        JLabel Lbl_Apellido = new JLabel("Apellido: ");
        Txt_apellido = new JTextField(20);

        JLabel Lbl_Password = new JLabel("Contraseña: ");
        Txt_Password = new JPasswordField(20);

        JLabel Correo_Electronico = new JLabel("Correo: ");
        Txt_Correo = new JTextField(20);

        JLabel Direccion = new JLabel("Direccion: ");
        Txt_Direccion = new JTextField(20);

        container.setLayout(gl);

        container.add(Lbl_Nombre);
        container.add(Txt_Nombre);
        container.add(Lbl_Apellido);
        container.add(Txt_apellido);
        container.add(Lbl_Password);
        container.add(Txt_Password);
        container.add(Correo_Electronico);
        container.add(Txt_Correo);
        container.add(Direccion);
        container.add(Txt_Direccion);

    }

    public void Boton(JPanel container) {

        boton = new JButton("agregar");

        Boton_login = new JButton("ir a login");

        controllerRegistrar.items(boton);

        container.add(boton);
        container.add(Boton_login);

    }

    public void Fecha(JPanel container) {
        container.add(new JTextField(2));
        container.add(new JLabel("/"));
        container.add(new JTextField(2));
        container.add(new JLabel("/"));
        container.add(new JTextField(2));
    }

}
