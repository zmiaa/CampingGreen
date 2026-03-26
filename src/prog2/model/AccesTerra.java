package prog2.model;

public abstract class AccesTerra extends Acces {
    // atributs
    private int longitud;

    // constructor
    public AccesTerra(String id, boolean estat, int longitud) {
        super(id, estat);
        this.longitud = longitud;
    }

    // setters i getters
    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
}
