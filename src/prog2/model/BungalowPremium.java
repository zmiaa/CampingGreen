package prog2.model;

public class BungalowPremium extends Bungalow {
    private boolean serveisExtra;
    private String codiWifi;

    // constructor
    public BungalowPremium(String nom, String id, long estadaMinimaTempAlta, long estadaMinimaTempBaixa, boolean operatiu, String iluminacio, int placesParquing, boolean aireFred, boolean tv, boolean terrassa, boolean serveisExtra, String codiWifi) {
        super(nom, id, 4,7, operatiu, iluminacio, placesParquing, aireFred, tv, terrassa);
        this.serveisExtra = serveisExtra;
        this.codiWifi = codiWifi;
    }

    public boolean isServeisExtra() { return serveisExtra; }
    public void setServeisExtra(boolean serveisExtra) { this.serveisExtra = serveisExtra; }
    public String getCodiWifi() { return codiWifi; }
    public void setCodiWifi(String codiWifi) { this.codiWifi = codiWifi; }

    @Override
    public String toString() {
        return super.toString() + ", serveisExtra=" + serveisExtra + ", codiWifi='" + codiWifi + "'";
    }
}