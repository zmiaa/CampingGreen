package prog2.model;

import java.io.Serializable;

// se tendrá que implementar Serializable aquí también, sinó no funciona el save
public abstract class Acces implements InAcces, Serializable {
    // atributs
    private String nom;
    private boolean estat;
    private LlistaAllotjaments allotjaments;

    // constructor
    public Acces(String nom, boolean estat) {
        this.nom = nom;
        this.estat = estat;
        this.allotjaments = new LlistaAllotjaments();
    }


    public void setEstat(boolean estat) {
        this.estat = estat;
    }

    public LlistaAllotjaments getAllotjaments() {
        return allotjaments;
    }

    @Override
    public void afegirAllotjament(Allotjament allotjament) {
        if(allotjament != null) {
            this.allotjaments.afegirAllotjament(allotjament);
        }
    }

    @Override
    public void tancarAcces() {
        this.estat = false;
    }

    @Override
    public void obrirAcces() {
        this.estat = true;
    }

    @Override
    public abstract boolean isAccessibilitat();

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public boolean getEstat() {
        return estat;
    }

    @Override
    public LlistaAllotjaments getAAllotjaments() {
        return allotjaments;
    }

    public void setAllotjaments(LlistaAllotjaments allotjaments) {
        this.allotjaments = allotjaments;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

}
