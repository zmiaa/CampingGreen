package prog2.model;

public class Glamping extends Allotjament {
    private String materials;
    private boolean casaMascota;

    // constructor
    public Glamping(String nom, String id, boolean estat, String iluminacio, String materials, boolean casaMascota) {
        super(nom, id, estat, iluminacio);
        this.materials = materials;
        this.casaMascota = casaMascota;
    }

    public String getMaterials() { return materials; }
    public void setMaterials(String materials) { this.materials = materials; }
    public boolean isCasaMascota() { return casaMascota; }
    public void setCasaMascota(boolean casaMascota) { this.casaMascota = casaMascota; }

    @Override
    public String toString() {
        return super.toString() + ", material=" + materials + ", casaMascota=" + casaMascota;
    }

    @Override
    public void tancarAllotjament(TascaManteniment tasca) {

    }

    @Override
    public void obrirAllotjament() {

    }
}