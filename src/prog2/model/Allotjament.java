package prog2.model;

import java.io.Serializable;

public abstract class Allotjament implements InAllotjament, Serializable {
    // atributs
    private String nom;
    private String id;
    private long estadaMinimaTempBaixa;
    private long estadaMinimaTempAlta;

    // nous atributs
    private String estat;
    private int iluminacio;
    // constructor
    public Allotjament(String nom, String id, long estadaMinimaTempAlta, long estadaMinimaTempBaixa, String operatiu, int iluminacio) {
        this.estadaMinimaTempAlta = estadaMinimaTempAlta;
        this.estadaMinimaTempBaixa = estadaMinimaTempBaixa;
        this.id = id;
        this.nom = nom;
        this.estat = operatiu;
        this.iluminacio = iluminacio;
    }

    // getters i setters

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

    @Override
    public long getEstadaMinima(Temp temp){
        // si és true, retorna estadaMinimaTempAlta, al contrari, retorna estadaMinimaTempBaixa
        return (temp == Temp.ALTA) ? estadaMinimaTempAlta : estadaMinimaTempBaixa;
    }

    @Override
    public void setEstadaMinima(long alta, long baixa){
        this.estadaMinimaTempAlta = alta;
        this.estadaMinimaTempBaixa = baixa;
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

    public String getEstat() {
        return estat;
    }

    public void setEstat(String estat) {
        this.estat = estat;
    }

    public int getIluminacio() {
        return iluminacio;
    }

    public void setIluminacio(int iluminacio) {
        this.iluminacio = iluminacio;
    }

    @Override
    public void tancarAllotjament(TascaManteniment tasca) {
        this.estat = "No operatiu";
        this.iluminacio = 0;
    }

    @Override
    public void obrirAllotjament() {
        this.estat = "Operatiu";
        this.iluminacio = 100;
    }

    @Override
    public String toString() {
        return "Nom=" + nom +
                ", Id=" + id +
                ", estada mínima en temp ALTA: " + estadaMinimaTempAlta +
                ", estada mínima en temp BAIXA: " + estadaMinimaTempBaixa +
                '.';
    }


}
