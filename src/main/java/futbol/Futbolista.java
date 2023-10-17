import java.lang.Comparable;

public abstract class Futbolista implements Comparable{
    private String nombre;
    private int edad;
    final private String posicion;

    public Futbolista(String nombre, int edad, String posicion) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }

    public Futbolista() {
        nombre = "Maradona";
        edad = 30;
        posicion = "delantero";
    }

    @Override
    public String toString() {
        return String.format("El futbolista %s tiene %d, y juega de %s.", nombre, edad, posicion);
    }

    public boolean equals(Futbolista f) {
        return this == f;
    }

    public abstract boolean jugarConLasManos();

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
