package Controller;

//import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import vista.Frm_Registro;
//import java.awt.Container.*;
//import vista.Frm_Registro.Boton_Registrar;
import vista.Frm_login;

public class Controller_guardar implements ActionListener {
    private Frm_Registro r;
    private Frm_login login;

    // private JButton button;

    public Controller_guardar(Frm_Registro r, JButton button, Frm_login login) {
        this.r = r;
        this.login = login;
        // this.button = button;

        this.r.boton.addActionListener(this);
        this.r.Boton_login.addActionListener(this);
    }

    /**
     * 
     */
    public void Frm_Registro_1() {
        r.setSize(800, 400);
        r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        r.setVisible(true);
        r.setTitle("Registro");
    }

    @Override

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == r.boton) {
            // System.out.println(6 + 6);
            if (r.Txt_Nombre.getText().length() == 0 || r.Txt_apellido.getText().length() == 0
                    || r.Txt_Password.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "ingrese texto");
            }

        }
        if (e.getSource() == r.Boton_login) {
            r.setVisible(false);
            login.setLocationRelativeTo(null);
            login.setTitle("login");
            login.setVisible(true);
        }
    }

    /**
    * 
    */

}
