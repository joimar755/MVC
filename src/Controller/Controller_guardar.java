package Controller;

import javax.swing.*;
import java.awt.event.*;

public class Controller_guardar implements ActionListener {

    private JTextField Txt_Nombre;
    private JTextField Txt_apellido;
    private JPasswordField Txt_Password;

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Hello World!");
    }

    public void items(JButton button) {
        button.addActionListener(this);
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
