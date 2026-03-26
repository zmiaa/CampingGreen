package prog2.model;

import java.io.Serializable;

// se tendrá que implementar Serializable aquí también, sinó no funciona el save
public abstract class Acces implements InAcces, Serializable {
    // atributs
    private String id;
    private String nom;
    private boolean obert;
    private boolean iluminat;
    private LlistaAllotjaments allotjaments;

    // constructor
    public Acces(String id, String nom) {
        this.id = id;
        this.nom = nom;
        this.obert = true;
        this.iluminat = true;
        this.allotjaments = new LlistaAllotjaments();
    }

    @Override
    public void afegirAllotjament(Allotjament allotjament) {
        if(allotjament != null) {
            this.allotjaments.afegirAllotjament(allotjament);
        }
    }

    @Override
    public void tancarAcces() {
        this.obert = false;
        this.iluminat = false;
    }

    @Override
    public void obrirAcces() {
        this.obert = true;
        this.iluminat = true;
    }

    @Override
    public abstract boolean isAccessibilitat();

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public boolean getEstat() {
        return obert;
    }

    @Override
    public LlistaAllotjaments getAAllotjaments() {
        return allotjaments;
    }

    public String getId() {
        return id;
    }

    public void setAllotjaments(LlistaAllotjaments allotjaments) {
        this.allotjaments = allotjaments;
    }

    public boolean isIluminat() {
        return iluminat;
    }

    public void setIluminat(boolean iluminat) {
        this.iluminat = iluminat;
    }

    public boolean isObert() {
        return obert;
    }

    public void setObert(boolean obert) {
        this.obert = obert;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setId(String id) {
        this.id = id;
    }
}
