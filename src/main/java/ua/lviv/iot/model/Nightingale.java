package ua.lviv.iot.model;

public class Nightingale extends Bird {
    private String typeOfNightingale;

    public Nightingale(String name, String colour, double weight, double speed, double feed, int lifeTime, boolean isBirdFlying, String typeOfNightingale) {

        super(name, colour, weight, speed, feed, lifeTime, isBirdFlying);
        this.typeOfNightingale = typeOfNightingale;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + ", type of nightingale";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + ", " + typeOfNightingale;
    }
}

