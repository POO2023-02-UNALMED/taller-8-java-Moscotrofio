public class Portero extends Futbolista {
    public short golesRecibidos;
    public byte dorsal;

    public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
        super(nombre, edad, "Portero");
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }

    @Override
    public boolean jugarConLasManos() {
        return true;
    }


    @Override
    public int compareTo(Object objeto) {
        Portero portero = (Portero) objeto;
        return Math.abs(this.getGolesRecibidos() - portero.getGolesRecibidos());
    }

    @Override
    public String toString() {
        return String.format("El futbolista %s tiene %d, y juega de %s con el dorsal %d. Le han marcado %d.", getNombre(), getEdad(), getPosicion(), dorsal, golesRecibidos);
    }
    public short getGolesRecibidos() {
        return golesRecibidos;
    }

    public byte getDorsal() {
        return dorsal;
    }

    public void setGolesRecibidos(short golesRecibidos) {
        this.golesRecibidos = golesRecibidos;
    }

    public void setDorsal(byte dorsal) {
        this.dorsal = dorsal;
    }
}
