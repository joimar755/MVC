package Modelo;

import javax.swing.JComboBox;

public class Depa {
    private String[] nombre;

    public Depa() {

        this.nombre = new String[7];
        this.nombre[0] = "Seleccione";
        this.nombre[1] = "Amazonas";
        this.nombre[2] = "Antioquia";
        this.nombre[3] = "Arauca";
        this.nombre[4] = "Atlantico";
        this.nombre[5] = "Bolivar";
        this.nombre[6] = "Boyaca";

    }

    public Depa(String[] nombre) {
        this.nombre = nombre;

    }

    public String[] getNombre() {
        return nombre;
    }

    public void setNombre(String[] string) {
        this.nombre = string;
    }

    @Override
    public String toString() {
        return "{" +
                " nombre='" + getNombre() + "" +
                "}";
    }

    public void setNombre(String string) {
    }

}
