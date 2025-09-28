public class StrategyDemo {
    public static void main(String[] args) {
        Order o = new Order(2.0, 100, true);
        ShippingStrategy s1 = new GroundShippingStrategy();
        ShippingStrategy s2 = new AirShippingStrategy();
        ShippingStrategy s3 = new DroneShippingStrategy();

        System.out.printf("Ground cost: %.2f%n", s1.calculateCost(o));
        System.out.printf("Air cost: %.2f%n", s2.calculateCost(o));
        System.out.printf("Drone cost: %.2f%n", s3.calculateCost(o));
    }
}
