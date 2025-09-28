public class ObserverDemo {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();

        Subscriber alice = new Subscriber() {
            public void update(News news) { System.out.println(getName() + " got news: " + news.getHeadline()); }
            public String getName() { return "Alice"; }
        };

        Subscriber bob = new Subscriber() {
            public void update(News news) { System.out.println(getName() + " got news: " + news.getHeadline()); }
            public String getName() { return "Bob"; }
        };

        agency.subscribe(alice);
        agency.subscribe(bob);

        agency.publish(new News("Design Patterns Workshop this Saturday!"));
        agency.unsubscribe(bob);
        agency.publish(new News("New Java release announced."));
    }
}
