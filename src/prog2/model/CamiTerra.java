package prog2.model;

public class CamiTerra extends AccesTerra {
    // constructor
    public CamiTerra(String id, boolean estat, float longitud) {
        super(id, estat, longitud);
    }

    @Override
    public boolean isAccessibilitat() {
        return false;
    }
}
