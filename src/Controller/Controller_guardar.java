package Controller;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;

import vista.Frm_Registro;
import java.awt.Container.*;
//import vista.Frm_Registro.Boton_Registrar;

public class Controller_guardar implements ActionListener {
    private Frm_Registro r;

    // private JButton button;

    public Controller_guardar(Frm_Registro r, JButton button) {
        this.r = r;
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
            System.out.println(6 + 6);
        }
        if (e.getSource() == r.Boton_login) {
            System.out.println(8 * 9);
        }
    }

    /**
    * 
    */

}
