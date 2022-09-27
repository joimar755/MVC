package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentListener;

import javax.swing.JButton;

import vista.Frm_Registro;
//import vista.Frm_Registro.Boton_Registrar;
import vista.Frm_Registro.Boton_Registrar;

public class Controller_guardar implements ActionListener {
    private Frm_Registro r;

    public Controller_guardar(Frm_Registro r) {
        this.r = r;
        this.r.Boton().addComponentListener((ComponentListener) this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == r.Boton()) {

            System.out.println(6);
        }

    }

    /**
    * 
    */

}
