package prog2.model;

public class Parcela extends Allotjament {
    private float mida;
    private boolean connexioElectrica;


    public Parcela(String allotjamentTest, String id001, boolean b, String s, float v, boolean b1) {
        super(allotjamentTest, id001, 4, 2, b1,s);
    }


    public float getMida() { return mida; }
    public void setMida(float mida) { this.mida = mida; }
    public boolean isConnexioElectrica() { return connexioElectrica; }
    public void setConnexioElectrica(boolean connexioElectrica) { this.connexioElectrica = connexioElectrica; }

    @Override
    public String toString() {
        return super.toString() + " Parcela {mida=" + mida + ", connexioElectrica=" + connexioElectrica + "}";
    }

    @Override
    public void tancarAllotjament(TascaManteniment tasca) {

    }

    @Override
    public void obrirAllotjament() {

    }
}