package prog2.model;

public class TascaManteniment implements InTascaManteniment{
    // atributs
    private int num, dies;
    private TipusTascaManteniment tipusTascaManteniment;
    private Allotjament allotjament;
    private String data;

    // constructor
    public TascaManteniment(int num, TipusTascaManteniment tipusTascaManteniment, Allotjament allotjament, String data, int dies) {
        this.num = num;
        this.tipusTascaManteniment = tipusTascaManteniment;
        this.allotjament = allotjament;
        this.data = data;
        this.dies = dies;
    }

    // getters i setters
    @Override
    public int getNum() {
        return num;
    }

    @Override
    public TascaManteniment.TipusTascaManteniment getTipus() {
        return tipusTascaManteniment;
    }

    @Override
    public Allotjament getAllotjament() {
        return allotjament;
    }

    @Override
    public String getData() {
        return data;
    }

    @Override
    public int getDies() {
        return dies;
    }

    @Override
    public void setNum(int num_) {
        this.num = num_;
    }

    @Override
    public void setTipus(TascaManteniment.TipusTascaManteniment tipus_) {
        this.tipusTascaManteniment = tipus_;
    }

    @Override
    public void setAllotjament(Allotjament allotjament_) {
        this.allotjament = allotjament_;
    }

    @Override
    public void setData(String data_) {
        this.data = data_;
    }

    @Override
    public void setDies(int dies_) {
        this.dies = dies_;
    }

    @Override
    public String getIluminacioAllotjament() {
        switch(tipusTascaManteniment){
            case Neteja:
                return "100%";
            case Reparacio:
                return "50%";
            case Desinfeccio:
                return "0%";
            default:
                return "100%";
        }
    }


    public static enum TipusTascaManteniment {
        Reparacio,
        Neteja,
        RevisioTecnica,
        Desinfeccio
    }

    // toString
    @Override
    public String toString() {
        return "TascaManteniment{" +
                "num=" + num +
                ", dies=" + dies +
                ", tipusTascaManteniment=" + tipusTascaManteniment +
                ", allotjament=" + allotjament +
                ", data='" + data + '\'' +
                '}';
    }
}
