package prog2.model;

public class Parcela extends Allotjament {
    private boolean connexioElectrica;

    // constructor
    public Parcela(String nom, String id, boolean estat, String iluminacio, float mida, boolean connexioElectrica) {
        super(nom, id, estat, iluminacio, mida);
        this.connexioElectrica = connexioElectrica;
    }


    public boolean isConnexioElectrica() { return connexioElectrica; }
    public void setConnexioElectrica(boolean connexioElectrica) { this.connexioElectrica = connexioElectrica; }

    @Override
    public String toString() {
        return super.toString() + " Parcela {mida=" + super.getMida() + ", connexioElectrica=" + connexioElectrica + "}";
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