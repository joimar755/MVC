package vista;

import java.io.IOException;

import javax.swing.*;

import com.toedter.calendar.JDateChooser;

import Controller.Controller_guardar;
import Modelo.Depa;
import Modelo.Json;

public class Frm_Registro extends JFrame {
    private Panel container;
    private JButton boton;
    private JButton Boton_login;
    private JTextField Txt_Nombre;
    private JTextField Txt_apellido;
    private JTextField Txt_Correo;
    private JTextField Txt_Direccion;
    private JPasswordField Txt_Password;
    private JComboBox Genero;
    public JComboBox<String> departamento;
    private JComboBox municipio;
    private Controller_guardar controllerRegistrar;
    private JDateChooser calendar;

    public Frm_Registro() throws IOException {
        setSize(800, 530);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        controllerRegistrar = new Controller_guardar();

        run();

    }

    public void run() throws IOException {
        container = new Panel();
        // container.setLayout(null);

        Formulario(container);
        Fecha(container);
        Listas(container);
        Boton(container);

        this.getContentPane().add(container);
    }

    public void Formulario(JPanel container) {

        // GridLayout gl = new GridLayout(12, 6, 0, 5);

        JLabel Lbl_Nombre = new JLabel("Nombres: ");
        Txt_Nombre = new JTextField(20);
        Lbl_Nombre.setBounds(70, 10, 200, 25);
        Txt_Nombre.setBounds(70, 40, 200, 25);

        JLabel Lbl_Apellido = new JLabel("Apellido: ");
        Txt_apellido = new JTextField(20);
        Lbl_Apellido.setBounds(400, 10, 200, 25);
        Txt_apellido.setBounds(400, 40, 200, 25);

        JLabel Lbl_Password = new JLabel("Contraseña: ");
        Txt_Password = new JPasswordField(20);
        // Txt_Password.setBounds(90, 50, 200, 25);

        JLabel Correo_Electronico = new JLabel("Correo: ");
        Txt_Correo = new JTextField(25);
        Correo_Electronico.setBounds(70, 135, 200, 25);
        Txt_Correo.setBounds(70, 160, 370, 25);

        JLabel Direccion = new JLabel("Direccion: ");
        Txt_Direccion = new JTextField(20);
        Direccion.setBounds(70, 200, 200, 25);
        Txt_Direccion.setBounds(70, 225, 530, 25);

        // Txt_Direccion.setBounds(90, 225, 200, 25);

        // container.setLayout(gl);

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
        controllerRegistrar.setTxt_Nombre(Txt_Nombre);
        controllerRegistrar.setTxt_apellido(Txt_apellido);
        // controllerRegistrar.setTxt_Password(Txt_Password);

    }

    public void Boton(JPanel container) {

        boton = new JButton("agregar");

        Boton_login = new JButton("ir a login");

        controllerRegistrar.items(boton);
        controllerRegistrar.items_1(Boton_login);
        boton.setBounds(500, 330, 85, 20);
        Boton_login.setBounds(400, 330, 85, 20);

        container.add(boton);
        container.add(Boton_login);

    }

    public void Fecha(JPanel container) {
        calendar = new JDateChooser();
        calendar.setBounds(70, 100, 200, 25);
        container.add(calendar);
    }

    public void Listas(JPanel container) throws IOException {
        Depa de = new Depa();
        Json j = new Json();
        j.JsonFile();
        String[] Sexo = { "Seleccione una opcion", "Masculino", "Femenino" };
        String[] Depa = { "Seleccione", "Atlantico" };
        String[] Muni = { "Seleccione", "Barranquilla" };
        JLabel genero = new JLabel("Genero: ");
        Genero = new JComboBox<>(Sexo);
        genero.setBounds(400, 70, 200, 25);
        Genero.setBounds(400, 90, 200, 25);

        JLabel d = new JLabel("departamento: ");
        d.setBounds(70, 250, 200, 25);
        departamento = new JComboBox<String>();

        for (String items : de.getNombre()) {
            departamento.addItem(items);
        }

        departamento.setBounds(70, 270, 100, 25);
        JLabel m = new JLabel("municipio: ");
        m.setBounds(250, 250, 200, 25);
        municipio = new JComboBox<>(Muni);
        municipio.setBounds(250, 270, 100, 25);
        JLabel Barrio = new JLabel("Barrio: ");
        Barrio.setBounds(380, 250, 200, 25);
        JTextField Txt_Barrio = new JTextField(20);
        Txt_Barrio.setBounds(380, 270, 220, 25);
        container.add(genero);
        container.add(Genero);
        container.add(d);
        container.add(departamento);
        container.add(m);
        container.add(municipio);
        container.add(Barrio);
        container.add(Txt_Barrio);
    }

}
