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
import java.awt.*;
import java.awt.event.*;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.concurrent.Flow;
import java.awt.Container.*;

public class Frm_Registro extends JFrame {
    public JButton boton;
    public JButton Boton_login;
    public JTextField Txt_Nombre;
    public JTextField Txt_apellido;
    public JTextField Txt_Correo;
    public JTextField Txt_Direccion;
    public JTextField Txt_Barrio;
    public JLabel genero;
    public JPasswordField Txt_Password;
    public JComboBox Genero;
    public JComboBox departamento;
    public JComboBox municipio;

    JPanel JP = new JPanel();
    JPanel JP_1 = new JPanel();
    JPanel Botones = new JPanel();
    JPanel Fecha = new JPanel();
    Container cp = getContentPane();
    FlowLayout fl = new FlowLayout();
    FlowLayout f2 = new FlowLayout();

    public Frm_Registro() {
        // setSize(800, 400);
        // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        IniciarComponentes();
    }

    /**
     * 
     */
    public void IniciarComponentes() {
        Formulario();
        // Boton();
    }

    /**
     * 
     */
    public void Formulario() {
        // Container cp = getContentPane();
        cp.setLayout(new FlowLayout());

        GridLayout gl = new GridLayout(14, 60, 45, 5);

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
        JP.add(Fecha);
        Listas();

        // JP.add(Boton());
        // JP.add(boton);
        Boton();
        Fecha();

        cp.add(JP, BorderLayout.EAST);
        cp.add(Botones, BorderLayout.SOUTH);

    }

    public void Boton() {
        Botones.setLayout(fl);
        boton = new JButton("agregar");
        Boton_login = new JButton("ir a login");

        // boton.addActionListener(new Boton_Registrar());
        // JPanel JP = new JPanel();
        // boton.setBounds(200, 30, 100, 50);
        Botones.add(boton);
        Botones.add(Boton_login);

        // cp.add(JP, BorderLayout.SOUTH);
        // return boton;
    }

    public void Fecha() {
        Fecha.setLayout(fl);
        Fecha.add(new JTextField(2));
        Fecha.add(new JLabel("/"));
        Fecha.add(new JTextField(2));
        Fecha.add(new JLabel("/"));
        Fecha.add(new JTextField(2));
        // cp.add(Fecha);
        // cp.add(Fecha, BorderLayout.CENTER);
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
