package vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Controller.Controller_guardar;

import java.awt.*;
import java.awt.event.*;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

//import java.util.concurrent.Flow;

public class Frm_Registro extends JFrame {
    public JButton boton;
    private JButton Boton_login;
    private JTextField Txt_Nombre;
    private JTextField Txt_apellido;
    private JTextField Txt_Correo;
    private JTextField Txt_Direccion;
    private JTextField Txt_Barrio;
    private JLabel genero;
    private JPasswordField Txt_Password;
    private JComboBox Genero;
    private JComboBox departamento;
    private JComboBox municipio;

    private JPanel JP;

    private FlowLayout fl = new FlowLayout();

    public Frm_Registro() {
        // setSize(800, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        IniciarComponentes();

    }

    /**
     * 
     */
    public void IniciarComponentes() {
        JP = new JPanel();
        JP.setLayout(null);
        this.getContentPane().add(JP);

        Formulario(JP);
        // Boton();
    }

    /**
     * 
     */
    public void Formulario(JPanel JP) {
        // Container JP = getContentPane();
        JP.setLayout(new FlowLayout());

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

        // button = new JButton("prueba");

        // boton.addActionListener(new Boton_Registrar());
        JP.setLayout(gl);

        JP.add(Lbl_Nombre);
        JP.add(Txt_Nombre);
        JP.add(Lbl_Apellido);
        JP.add(Txt_apellido);
        JP.add(Lbl_Password);
        JP.add(Txt_Password);
        JP.add(Correo_Electronico);
        JP.add(Txt_Correo);
        JP.add(Direccion);
        JP.add(Txt_Direccion);
        // Listas();

        // JP.add(Boton());
        // JP.add(boton);
        Boton(JP, Txt_Nombre, Txt_apellido, Txt_Password);
        Fecha(JP);

        // JP.add(JP, BorderLayout.EAST);

    }

    public void Boton(JPanel JP, JTextField Txt_Nombre, JTextField Txt_apellido, JPasswordField Txt_Password) {
        // Botones.setLayout(fl);
        boton = new JButton("agregar");

        Controller_guardar ctl = new Controller_guardar(boton, Txt_Nombre, Txt_apellido, Txt_Password);

        Boton_login = new JButton("ir a login");

        // boton.addActionListener(new Boton_Registrar());
        // JPanel JP = new JPanel();

        JP.add(boton);
        JP.add(Boton_login);

        // JP.add(JP, BorderLayout.SOUTH);
        // return boton;|
    }

    public void Fecha(JPanel JP) {
        JP.add(new JTextField(2));
        JP.add(new JLabel("/"));
        JP.add(new JTextField(2));
        JP.add(new JLabel("/"));
        JP.add(new JTextField(2));
        // JP.add(Fecha);
        // JP.add(Fecha, BorderLayout.CENTER);
    }

    public void Listas() {

        String[] Sexo = { "Seleccione una opcion", "Masculino", "Femenino" };
        String[] Depa = { "Seleccione", "Atlantico" };
        String[] Muni = { "Seleccione", "Barranquilla" };
        genero = new JLabel("Genero: ");
        Genero = new JComboBox<>(Sexo);
        JLabel d = new JLabel("departamento: ");
        departamento = new JComboBox<>(Depa);
        JLabel m = new JLabel("municipio: ");
        municipio = new JComboBox<>(Muni);
        JLabel Barrio = new JLabel("Barrio: ");
        Txt_Barrio = new JTextField(20);

        JP.add(genero);
        JP.add(Genero);

        JP.add(d);
        JP.add(departamento);

        JP.add(m);
        JP.add(municipio);

        JP.add(Barrio);
        JP.add(Txt_Barrio);

    }

}
