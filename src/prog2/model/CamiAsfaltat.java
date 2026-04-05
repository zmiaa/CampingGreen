package prog2.model;

public class CamiAsfaltat extends AccesAsfalt {
    // constructor
    public CamiAsfaltat(String id, boolean estat, double metres) {
        super(id, estat, metres);
    }

    @Override
    public boolean isAccessibilitat() {
        return false;
    }
}
