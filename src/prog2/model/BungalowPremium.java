package prog2.model;

public class BungalowPremium extends Bungalow {
    private boolean serveisExtra;
    private String codiWifi;

    // constructor
    public BungalowPremium(String nom, String id, boolean estat, String iluminacio, int placesParquing, boolean terrassa, boolean tv, boolean aireFred, boolean serveisExtra, String codiWifi) {
        super(nom, id, estat, iluminacio, placesParquing, terrassa, tv, aireFred);
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