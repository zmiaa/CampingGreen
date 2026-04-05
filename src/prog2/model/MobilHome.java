package prog2.model;

public class MobilHome extends Casa {
    private boolean terrassaBarbacoa;

    // constructor
    public MobilHome(String nom, String id, boolean estat, String iluminacio, float mida, int numHabitacions, int numPersones, boolean terrassaBarbacoa) {
        super(nom, id, estat, iluminacio, mida, numHabitacions, numPersones);
        this.terrassaBarbacoa = terrassaBarbacoa;
    }

    public boolean isTerrassaBarbacoa() { return terrassaBarbacoa; }
    public void setTerrassaBarbacoa(boolean terrassaBarbacoa) { this.terrassaBarbacoa = terrassaBarbacoa; }

    @Override
    public String toString() {
        return super.toString() + ", terrassaBarbacoa=" + terrassaBarbacoa;
    }

    @Override
    public void tancarAllotjament(TascaManteniment tasca) {
        super.tancarAllotjament(tasca);
    }

    @Override
    public void obrirAllotjament() {
        super.obrirAllotjament();
    }
}