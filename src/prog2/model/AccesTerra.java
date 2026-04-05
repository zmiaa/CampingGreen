package prog2.model;

public abstract class AccesTerra extends Acces {
    // atributs
    private float longitud;

    // constructor
    public AccesTerra(String id, boolean estat, float longitud) {
        super(id, estat);
        this.longitud = longitud;
    }

    // setters i getters
    public float getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
}
