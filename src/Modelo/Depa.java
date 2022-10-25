package Modelo;

public class Depa {
    private String[] nombre;

    public Depa() {
        this.nombre = new String[2];
        this.nombre[0] = "Atlantico";
        this.nombre[1] = "Amazonas";
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
