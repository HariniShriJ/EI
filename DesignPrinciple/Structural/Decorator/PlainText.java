public class PlainText implements TextComponent {
    private final String text;
    public PlainText(String text) { this.text = text; }
    public String render() { return text; }
}
