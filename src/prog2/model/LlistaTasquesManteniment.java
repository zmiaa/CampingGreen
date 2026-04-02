package prog2.model;

import prog2.vista.ExcepcioCamping;

import java.io.Serializable;
import java.util.ArrayList;

public class LlistaTasquesManteniment implements InLlistaTasquesManteniment, Serializable {
    // atributs
    private ArrayList<TascaManteniment> tasques;

    public LlistaTasquesManteniment() {
        this.tasques = new ArrayList<>();
    }

    @Override
    public void afegirTascaManteniment(int num, String tipus, Allotjament allotjament, String data, int dies) throws ExcepcioCamping {
        TascaManteniment.TipusTascaManteniment tipusEnum = TascaManteniment.TipusTascaManteniment.valueOf(tipus);
        TascaManteniment novaTasca = new TascaManteniment(num, tipusEnum, allotjament, data, dies);
        tasques.add(novaTasca);

    }

    @Override
    public void completarTascaManteniment(TascaManteniment tasca) throws ExcepcioCamping {
        if(!tasques.remove(tasca)){
            throw new ExcepcioCamping("Error en intentar eliminar la tasca");
        }
    }

    @Override
    public String llistarTasquesManteniment() throws ExcepcioCamping {
        if(tasques.isEmpty()){
            throw new ExcepcioCamping("No hi ha cap tasca de manteniment activa");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Llistat de tasques manteniment activa:\n");
        for(TascaManteniment tasca: tasques){
            sb.append(tasca.toString()).append("\n");
        }
        return sb.toString();
    }

    @Override
    public TascaManteniment getTascaManteniment(int num) throws ExcepcioCamping {
        for(TascaManteniment tasca: tasques){
            if(tasca.getNum() == num){
                return tasca;
            }
        }
        throw new ExcepcioCamping("No s'ha trobat la tasca amb número: " + num);
    }
}
