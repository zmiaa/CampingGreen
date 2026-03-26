package prog2.model;

import prog2.vista.ExcepcioCamping;

import java.util.ArrayList;

public class LlistaAcccessos implements InLlistaAccessos{
    // atributs
    private ArrayList<Acces> accesos;

    // constructor
    public LlistaAcccessos(){
        accesos = new ArrayList<>();
    }


    @Override
    public void afegirAcces(Acces acc) throws ExcepcioCamping {
        accesos.add(acc);
    }

    @Override
    public void buidar() {
        accesos.clear();
    }

    @Override
    public String llistarAccessos(boolean estat) throws ExcepcioCamping {
        return "";
    }

    @Override
    public void actualitzaEstatAccessos() throws ExcepcioCamping {

    }

    @Override
    public int calculaAccessosNoAccessibles() throws ExcepcioCamping {
        return 0;
    }

    @Override
    public float calculaMetresTerra() throws ExcepcioCamping {
        return 0;
    }
}
