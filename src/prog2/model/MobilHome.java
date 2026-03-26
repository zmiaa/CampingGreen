package prog2.model;

public class MobilHome extends Allotjament {
    private boolean terrassaBarbacoa;

    // constructor
    public MobilHome(String nom, String id, boolean estat, String iluminacio, boolean terrassaBarbacoa) {
        super(nom, id, estat, iluminacio);
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

    }

    @Override
    public void obrirAllotjament() {

    }
}