public class Jugador extends Futbolista {
    public short golesMarcados;
    public byte dorsal;

    public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
        super(nombre, edad, posicion);
        this.golesMarcados = golesMarcados;
        this.dorsal = dorsal;
    }

    public Jugador() {
        super();
        golesMarcados = 289;
        dorsal = 7;
    }

    @Override
    public boolean jugarConLasManos() {
        return false;
    }

    @Override
    public int compareTo(Object objeto) {
        Futbolista futbolista = (Futbolista) objeto;
        return Math.abs(this.getEdad() - futbolista.getEdad());
    }

    @Override
    public String toString() {
        return String.format("El futbolista %s tiene %d, y juega de %s con el dorsal %d. Ha marcado %d.", getNombre(), getEdad(), getPosicion(), dorsal, golesMarcados);
    }
}
