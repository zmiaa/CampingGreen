package prog2.model;

import java.io.Serializable;

public abstract class Allotjament implements InAllotjament, Serializable {
    // atributs
    private String nom;
    private String id;
    private long estadaMinimaTempBaixa;
    private long estadaMinimaTempAlta;
    private float mida;
    // nous atributs
    private boolean estat;
    private String iluminacio;
    // constructor
    public Allotjament(String nom, String id, boolean estat, String iluminacio, float mida) {
        this.id = id;
        this.nom = nom;
        this.estat = estat;
        this.iluminacio = iluminacio;
        this.mida = mida;
        this.estadaMinimaTempBaixa = 2;
        this.estadaMinimaTempAlta = 4;
    }

    // getters i setters
    public float getMida() {
        return mida;
    }

    public void setMida(float mida) {
        this.mida = mida;
    }

    public boolean isEstat() {
        return estat;
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public long getEstadaMinimaTempBaixa() {
        return estadaMinimaTempBaixa;
    }

    public void setEstadaMinimaTempBaixa(long estadaMinimaTempBaixa) {
        this.estadaMinimaTempBaixa = estadaMinimaTempBaixa;
    }

    public long getEstadaMinimaTempAlta() {
        return estadaMinimaTempAlta;
    }

    public void setEstadaMinimaTempAlta(long estadaMinimaTempAlta) {
        this.estadaMinimaTempAlta = estadaMinimaTempAlta;
    }

    public boolean getEstat() {
        return estat;
    }

    public void setEstat(boolean estat) {
        this.estat = estat;
    }

    @Override
    public void setEstadaMinima(long estadaMinimaALTA_, long estadaMinimaBAIXA_) {
        this.estadaMinimaTempAlta = estadaMinimaALTA_;
        this.estadaMinimaTempBaixa = estadaMinimaBAIXA_;
    }

    public long getEstadaMinima(InAllotjament.Temp temp) {
        return (temp == InAllotjament.Temp.ALTA) ? estadaMinimaTempAlta : estadaMinimaTempBaixa;
    }


    public String getIluminacio() {
        return iluminacio;
    }

    public void setIluminacio(String iluminacio) {
        this.iluminacio = iluminacio;
    }

    @Override
    public void tancarAllotjament(TascaManteniment tasca) {
        this.estat = false;

        if (tasca.getTipus() == TascaManteniment.TipusTascaManteniment.Neteja) {
            this.iluminacio = "50%";
        } else {
            this.iluminacio = "0%";
        }
    }

    @Override
    public void obrirAllotjament() {
        this.estat = true;
        this.iluminacio = "100%";
    }

    @Override
    public String toString() {
        return "Allotjament{" +
                "nom='" + nom + '\'' +
                ", id='" + id + '\'' +
                ", estadaMinimaTempBaixa=" + estadaMinimaTempBaixa +
                ", estadaMinimaTempAlta=" + estadaMinimaTempAlta +
                ", mida=" + mida +
                ", estat=" + estat +
                ", iluminacio='" + iluminacio + '\'' +
                '}';
    }

    // afegir calculMida()?


}
