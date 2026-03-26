package prog2.model;

public class MobilHome extends Allotjament {
    private boolean terrassaBarbacoa;

    public MobilHome(String nom, String id, long estadaMinimaTempAlta, long estadaMinimaTempBaixa, boolean operatiu, String iluminacio) {
        super(nom, id, 5, 3, operatiu, iluminacio);
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