package prog2.model;

import prog2.vista.ExcepcioCamping;

import java.io.Serializable;
import java.util.ArrayList;

public class LlistaAllotjaments implements InLlistaAllotjaments, Serializable {
    // atributs
    private ArrayList<Allotjament> allotjaments;

    public LlistaAllotjaments(){
        this.allotjaments = new ArrayList<>();
    }

    @Override
    public void afegirAllotjament(Allotjament allotjament) throws ExcepcioCamping {
        if(getAllotjament(allotjament.getId()) == null){
            allotjaments.add(allotjament);
        }
    }

    @Override
    public void buidar() {
        allotjaments.clear();
    }


    @Override
    public String llistarAllotjaments(String estat) throws ExcepcioCamping {
        StringBuilder sb = new StringBuilder();
        boolean trobat = false;
        for(Allotjament allotjament : allotjaments){
            String estatAllotjament = allotjament.getEstat() ? "Operatiu" : "No operatiu";
            if(estat.equalsIgnoreCase("Tots") || estat.equalsIgnoreCase(estatAllotjament)){
                sb.append(allotjament.toString()).append("\n");
                trobat = true;
            }
        }
        if(!trobat){
            throw new ExcepcioCamping("No hi ha allotjaments amb l'estat indicat.");
        }
        return sb.toString();
    }

    @Override
    public boolean containsAllotjamentOperatiu() {
        for(Allotjament allotjament : allotjaments){
            if(allotjament.getEstat()){ // == true
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean contains(Allotjament allotjament) {
        return false;
    }

    @Override
    public Allotjament getAllotjament(String id) throws ExcepcioCamping {
        return null;
    }

    @Override
    public String toString() {
        return "LlistaAllotjaments{" +
                "allotjaments=" + allotjaments +
                '}';
    }
}
