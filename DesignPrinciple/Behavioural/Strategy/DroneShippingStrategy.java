public class DroneShippingStrategy implements ShippingStrategy {
    public double calculateCost(Order order) {
        // drones limited to light packages
        if (order.getWeightKg() > 5) throw new IllegalArgumentException("Drone can't carry >5kg");
        return 10.0 + 0.8 * order.getWeightKg() + (order.isExpress() ? 5 : 0);
    }
}
