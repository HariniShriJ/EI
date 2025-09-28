public class DecoratorDemo {
    public static void main(String[] args) {
        TextComponent simple = new PlainText("Hello, Knix!");
        System.out.println("Plain: " + simple.render());

        TextComponent bordered = new BorderDecorator(simple);
        System.out.println("Bordered: " + bordered.render());

        TextComponent scrolledAndBordered = new ScrollDecorator(bordered);
        System.out.println("Scroll + Border: " + scrolledAndBordered.render());

        // You can also stack differently
        TextComponent borderThenScroll = new BorderDecorator(new ScrollDecorator(simple));
        System.out.println("Border then Scroll: " + borderThenScroll.render());
    }
}
