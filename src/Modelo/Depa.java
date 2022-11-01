package Modelo;

public class Depa {
    private String[] nombre;

    public Depa() {
        this.nombre = new String[6];
        this.nombre[0] = "Amazonas";
        this.nombre[1] = "Antioquia";
        this.nombre[2] = "Arauca";
        this.nombre[3] = "Atlantico";
        this.nombre[4] = "Bolivar";
        this.nombre[5] = "Boyaca";
    }

    public String[] getNombre() {
        return nombre;
    }

    public void setNombre(String[] nombre) {
        this.nombre = nombre;
    }

    public void Cargar_depa() {

        for (int i = 0; i < nombre.length; i++) {
            System.out.println(this.nombre[i]);

        }

    }

    @Override
    public String toString() {
        return "{" +
                " nombre='" + getNombre() + "'" +
                "}";
    }

}
