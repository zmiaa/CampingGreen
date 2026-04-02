package prog2.model;

public class Bungalow extends Casa {
    private int placesParquing;
    private boolean terrassa, tv, aireFred;

    // constructor
    public Bungalow(String nom, String id, boolean estat, String iluminacio, float mida, int numHabitacions, int numPersones, int placesParquing, boolean terrassa, boolean tv, boolean aireFred) {
        super(nom, id, estat, iluminacio, mida, numHabitacions, numPersones);
        this.placesParquing = placesParquing;
        this.terrassa = terrassa;
        this.tv = tv;
        this.aireFred = aireFred;
    }

    public int getPlacesParquing() { return placesParquing; }
    public void setPlacesParquing(int placesParquing) { this.placesParquing = placesParquing; }
    public boolean isTerrassa() { return terrassa; }
    public void setTerrassa(boolean terrassa) { this.terrassa = terrassa; }
    public boolean isTv() { return tv; }
    public void setTv(boolean tv) { this.tv = tv; }
    public boolean isAireFred() { return aireFred; }
    public void setAireFred(boolean aireFred) { this.aireFred = aireFred; }


    @Override
    public void tancarAllotjament(TascaManteniment tasca) {
        super.tancarAllotjament(tasca);
    }

    @Override
    public void obrirAllotjament() {
        super.obrirAllotjament();

    }

    @Override
    public String toString() {
        return "Bungalow{" +
                "placesParquing=" + placesParquing +
                ", terrassa=" + terrassa +
                ", tv=" + tv +
                ", aireFred=" + aireFred +
                '}';
    }
}