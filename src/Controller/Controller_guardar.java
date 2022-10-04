package Controller;

//import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;

import vista.Frm_Registro;
//import java.awt.Container.*;
//import vista.Frm_Registro.Boton_Registrar;
import vista.Frm_login;

public class Controller_guardar {
    private JButton button;
    private JTextField Txt_Nombre;
    private JTextField Txt_apellido;
    private JPasswordField Txt_Password;

    // private JButton button;

    public Controller_guardar(JButton boton, JTextField Txt_Nombre, JTextField Txt_apellido,
            JPasswordField Txt_Password) {

        this.button = boton;
        this.Txt_Nombre = Txt_Nombre;
        this.Txt_apellido = Txt_apellido;
        this.Txt_Password = Txt_Password;
        JButton boton2 = new JButton();

    }

    public void t() {
        ActionListener rt = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hola mundo");
                // if (e.getSource() == button) {
                // // System.out.println(6 + 6);
                // if (Txt_Nombre.getText().length() == 0 || Txt_apellido.getText().length() ==
                // 0
                // || Txt_Password.getText().length() == 0) {
                // JOptionPane.showMessageDialog(null, "ingrese texto");
                // } else {

                // }

            }
        };
        this.button.addActionListener(rt);
    }

}
