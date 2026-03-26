package prog2.model;

import prog2.vista.ExcepcioCamping;

import java.io.Serializable;

// falta implementar mètodes
public class Camping implements InCamping, Serializable {
    // atributs
    private String nom;
    private LlistaAllotjaments allotjaments;
    private LlistaAcccessos accessos;
    private LlistaTasquesManteniment tasquesManteniments;

    // constructor
    public Camping(String nom){
        this.nom=nom;
        this.allotjaments = new LlistaAllotjaments();
        this.accessos = new LlistaAcccessos();
        this.tasquesManteniments = new LlistaTasquesManteniment();
    }

    @Override
    public String getNomCamping() {
        return nom;
    }

    @Override
    public String llistarAllotjaments(String estat) throws ExcepcioCamping {
        return allotjaments.llistarAllotjaments(estat);
    }

    @Override
    public String llistarAccessos(String infoEstat) throws ExcepcioCamping {
        boolean estat = infoEstat.equalsIgnoreCase("Obert");
        return accessos.llistarAccessos(estat);
    }

    @Override
    public String llistarTasquesManteniment() throws ExcepcioCamping {
        return tasquesManteniments.llistarTasquesManteniment();
    }

    @Override
    public void afegirTascaManteniment(int numTasca, String tipus, String idAllotjament, String data, int dies) throws ExcepcioCamping {

    }

    @Override
    public void completarTascaManteniment(int num) throws ExcepcioCamping {

    }

    @Override
    public int calculaAccessosNoAccessibles() {
        return accessos.calculaAccessosNoAccessibles();
    }

    @Override
    public float calculaMetresTerra() {
        return accessos.calculaMetresTerra();
    }


    // setters i getters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public LlistaAllotjaments getAllotjaments() {
        return allotjaments;
    }

    public void setAllotjaments(LlistaAllotjaments allotjaments) {
        this.allotjaments = allotjaments;
    }

    public LlistaAcccessos getAccessos() {
        return accessos;
    }

    public void setAccessos(LlistaAcccessos accessos) {
        this.accessos = accessos;
    }

    public LlistaTasquesManteniment getTasquesManteniment() {
        return tasquesManteniments;
    }

    public void setTasquesManteniment(LlistaTasquesManteniment tasquesManteniment) {
        this.tasquesManteniments = tasquesManteniment;
    }

    // falta implementar
    @Override
    public void save(String camiDesti) throws ExcepcioCamping {

    }

    public void load(String camiOrigen) throws ExcepcioCamping {

    }

    @Override
    public void inicialitzaDadesCamping() {

    }



}
