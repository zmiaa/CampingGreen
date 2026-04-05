package prog2.model;

public class Casa extends Allotjament{
    // atributs
    private int numHabitacions;
    private int numPersones;

    // constructor
    public Casa(String nom, String id, boolean estat, String iluminacio, float mida, int numHabitacions, int numPersones) {
        super(nom, id, estat, iluminacio, mida);
        this.numHabitacions = numHabitacions;
        this.numPersones = numPersones;
    }

    // setters i getters
    public int getNumHabitacions() {
        return numHabitacions;
    }

    public void setNumHabitacions(int numHabitacions) {
        this.numHabitacions = numHabitacions;
    }

    public int getNumPersones() {
        return numPersones;
    }

    public void setNumPersones(int numPersones) {
        this.numPersones = numPersones;
    }
}
