package prog2.model;

public class Glamping extends Casa {
    private String materials;
    private boolean casaMascota;

    // constructor
    public Glamping(String nom, String id, boolean estat, String iluminacio, float mida, int numHabitacions, int numPersones, String materials, boolean casaMascota) {
        super(nom, id, estat, iluminacio, mida, numHabitacions, numPersones);
        this.materials = materials;
        this.casaMascota = casaMascota;
    }

    public String getMaterials() { return materials; }
    public void setMaterials(String materials) { this.materials = materials; }
    public boolean isCasaMascota() { return casaMascota; }
    public void setCasaMascota(boolean casaMascota) { this.casaMascota = casaMascota; }


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
        return "Glamping{" +
                "materials='" + materials + '\'' +
                ", casaMascota=" + casaMascota +
                '}';
    }
}