package Controller;

import javax.swing.*;

import Modelo.Json;
import vista.Frm_Registro;
import vista.Frm_login;

import java.awt.event.*;

public class Controller_guardar implements ActionListener {

    private JTextField Txt_Nombre;
    private JTextField Txt_apellido;
    private JPasswordField Txt_Password;

    @Override
    public void actionPerformed(ActionEvent e) {
        // System.out.println("Hello World!");

    }

    public void items(JButton button) {
        // button.addActionListener(this);
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                if (Txt_Nombre.getText().length() == 0 || Txt_apellido.getText().length() == 0
                        || Txt_Password.getPassword().length == 0) {
                    JOptionPane.showMessageDialog(null, "no hay texto");
                }
            }

        });

    }

    public void items_1(JButton button) {
        // button.addActionListener(this);

        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                // r.setVisible(false);
                Frm_login f = new Frm_login();
                f.setVisible(true);

            }

        });
    }

    public void setTxt_Nombre(JTextField Txt_Nombre) {
        this.Txt_Nombre = Txt_Nombre;
    }

    public void setTxt_apellido(JTextField Txt_apellido) {
        this.Txt_apellido = Txt_apellido;
    }

    public void setTxt_Password(JPasswordField Txt_Password) {
        this.Txt_Password = Txt_Password;
    }

}
