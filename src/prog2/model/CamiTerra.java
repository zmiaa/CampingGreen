package prog2.model;

public class CamiTerra extends AccesTerra {
    // constructor
    public CamiTerra(String id, String nom, int longitud) {
        super(id, nom, longitud);
    }

    @Override
    public boolean isAccessibilitat() {
        return false;
    }
}
