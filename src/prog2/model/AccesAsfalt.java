package prog2.model;

public abstract class AccesAsfalt extends Acces{
    // atributs
    private double metres;

    // constructor
    public AccesAsfalt(String id, String nom, double metres) {
        super(id, nom);
        this.metres = metres;
    }

    public double getMetres() {
        return metres;
    }

    public void setMetres(double metres) {
        this.metres = metres;
    }
}
