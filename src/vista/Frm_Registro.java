package vista;

import javax.swing.JButton;
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
import java.awt.Container.*;

public class Frm_Registro extends JFrame {
    public JButton boton;
    public JButton Boton_login;
    public JTextField Txt_Nombre;
    public JTextField Txt_apellido;
    public JPasswordField Txt_Password;

    JPanel JP = new JPanel();
    Container cp = getContentPane();

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

        GridLayout gl = new GridLayout(12, 6, 0, 5);

        JLabel Lbl_Nombre = new JLabel("Nomnbre: ");
        Txt_Nombre = new JTextField(20);

        JLabel Lbl_Apellido = new JLabel("Apellido: ");
        Txt_apellido = new JTextField(20);

        JLabel Lbl_Password = new JLabel("Contraseña: ");
        Txt_Password = new JPasswordField(20);

        // button = new JButton("prueba");

        // boton.addActionListener(new Boton_Registrar());
        JP.setLayout(gl);

        JP.add(Lbl_Nombre);
        JP.add(Txt_Nombre);
        JP.add(Lbl_Apellido);
        JP.add(Txt_apellido);
        JP.add(Lbl_Password);
        JP.add(Txt_Password);

        // JP.add(Boton());
        // JP.add(boton);
        Boton();

        cp.add(JP, BorderLayout.CENTER);
    }

    public void Boton() {
        boton = new JButton("agregar");
        Boton_login = new JButton("ir a login");

        // boton.addActionListener(new Boton_Registrar());
        // JPanel JP = new JPanel();
        // boton.setBounds(200, 30, 100, 50);
        JP.add(boton);
        JP.add(Boton_login);
        // cp.add(JP, BorderLayout.CENTER);
        // return boton;
    }

}
