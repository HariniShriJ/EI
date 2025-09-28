public class Order {
    private double weightKg;
    private double distanceKm;
    private boolean express;
    public Order(double weightKg, double distanceKm, boolean express) {
        this.weightKg = weightKg; this.distanceKm = distanceKm; this.express = express;
    }
    public double getWeightKg() { return weightKg; }
    public double getDistanceKm() { return distanceKm; }
    public boolean isExpress() { return express; }
}
