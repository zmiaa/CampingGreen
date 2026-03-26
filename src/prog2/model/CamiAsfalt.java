package prog2.model;

public class CamiAsfalt extends AccesAsfalt {
    // constructor
    public CamiAsfalt(String id, String nom, double metres) {
        super(id, nom, metres);
    }

    @Override
    public boolean isAccessibilitat() {
        return false;
    }
}
