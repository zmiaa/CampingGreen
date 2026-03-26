package prog2.model;

public abstract class AccesAsfalt extends Acces{
    // atributs
    private double metres;

    // constructor
    public AccesAsfalt(String id, boolean estat, double metres) {
        super(id, estat);
        this.metres = metres;
    }

    public double getMetres() {
        return metres;
    }

    public void setMetres(double metres) {
        this.metres = metres;
    }
}
