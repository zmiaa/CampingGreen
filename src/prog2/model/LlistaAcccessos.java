package prog2.model;

import prog2.vista.ExcepcioCamping;

import java.io.Serializable;
import java.util.ArrayList;

public class LlistaAcccessos implements InLlistaAccessos, Serializable {
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
        StringBuilder sb = new StringBuilder();
        boolean trobat = false;
        String estatAcces = estat ? "Obert" : "Tancat";

        for(Acces acces: accesos){
            if(acces.getEstat() == estat){
                sb.append(acces.toString()).append("\n");
                trobat = true;
            }
        }
        if(!trobat){
            throw new ExcepcioCamping("No s'ha trobat cap accés amb l'estat " + estatAcces);
        }
        return sb.toString();
    }

    @Override
    public void actualitzaEstatAccessos() throws ExcepcioCamping {

    }

    @Override
    public int calculaAccessosNoAccessibles() throws ExcepcioCamping {
        int contador = 0;
        for(Acces acc: accesos){
            // estem buscant els no accessibles per això ponem !
            if(!acc.isAccessibilitat()){
                contador++;
            }
        }
        return contador;
    }

    @Override
    public float calculaMetresTerra() throws ExcepcioCamping {
        float total = 0;
        for(Acces acc: accesos){
            if(acc instanceof AccesTerra){
                AccesTerra accesTerra = (AccesTerra) acc;
                total += accesTerra.getLongitud();
            }
        }
        return total;
    }
}
