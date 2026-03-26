package prog2.model;

public class CamiTerra extends AccesTerra {
    // constructor
    public CamiTerra(String id, boolean estat, int longitud) {
        super(id, estat, longitud);
    }

    @Override
    public boolean isAccessibilitat() {
        return false;
    }
}
