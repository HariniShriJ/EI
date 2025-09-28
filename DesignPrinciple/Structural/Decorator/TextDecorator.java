public abstract class TextDecorator implements TextComponent {
    protected final TextComponent inner;
    public TextDecorator(TextComponent inner) { this.inner = inner; }
    public abstract String render();
}
