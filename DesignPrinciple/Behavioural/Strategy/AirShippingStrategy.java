public class AirShippingStrategy implements ShippingStrategy {
    public double calculateCost(Order order) {
        return 20.0 + 0.3 * order.getDistanceKm() + 1.0 * order.getWeightKg() + (order.isExpress() ? 15 : 0);
    }
}
