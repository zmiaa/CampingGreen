package prog2.model;

public class Bungalow extends Allotjament {
    private int placesParquing;
    private boolean terrassa, tv, aireFred;

    // constructor


    public Bungalow(String nom, String id, long estadaMinimaTempAlta, long estadaMinimaTempBaixa, boolean operatiu, String iluminacio, int placesParquing, boolean aireFred, boolean tv, boolean terrassa) {
        super(nom, id, 7, 4, operatiu, iluminacio);
        this.placesParquing = placesParquing;
        this.aireFred = aireFred;
        this.tv = tv;
        this.terrassa = terrassa;
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
    public String toString() {
        return super.toString() + ", placesParquing=" + placesParquing + ", terrassa=" + terrassa + ", tv=" + tv + ", aireFred=" + aireFred;
    }

    @Override
    public void tancarAllotjament(TascaManteniment tasca) {

    }

    @Override
    public void obrirAllotjament() {

    }
}