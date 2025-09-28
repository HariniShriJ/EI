public class GroundShippingStrategy implements ShippingStrategy {
    public double calculateCost(Order order) {
        return 5.0 + 0.1 * order.getDistanceKm() + 0.5 * order.getWeightKg() + (order.isExpress() ? 10 : 0);
    }
}
