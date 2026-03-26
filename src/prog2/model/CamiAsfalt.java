package prog2.model;

public class CamiAsfalt extends AccesAsfalt {
    // constructor
    public CamiAsfalt(String id, boolean estat, double metres) {
        super(id, estat, metres);
    }

    @Override
    public boolean isAccessibilitat() {
        return false;
    }
}
