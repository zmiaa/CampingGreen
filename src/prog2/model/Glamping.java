package prog2.model;

public class Glamping extends Allotjament {
    private String materials;
    private boolean casaMascota;

    public Glamping(String nom, String id, long estadaMinimaTempAlta, long estadaMinimaTempBaixa, boolean operatiu, String iluminacio) {
        super(nom, id, 5, 3, operatiu, iluminacio);
        this.materials = nom;
        this.casaMascota = true;
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