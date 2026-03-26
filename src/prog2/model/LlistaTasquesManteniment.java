package prog2.model;

import prog2.vista.ExcepcioCamping;

import java.util.ArrayList;

public class LlistaTasquesManteniment implements InLlistaTasquesManteniment{
    // atributs
    private ArrayList<TascaManteniment> tasques;
    @Override
    public void afegirTascaManteniment(int num, String tipus, Allotjament allotjament, String data, int dies) throws ExcepcioCamping {

    }

    @Override
    public void completarTascaManteniment(TascaManteniment tasca) throws ExcepcioCamping {

    }

    @Override
    public String llistarTasquesManteniment() throws ExcepcioCamping {
        return "";
    }

    @Override
    public TascaManteniment getTascaManteniment(int num) throws ExcepcioCamping {
        return null;
    }
}
