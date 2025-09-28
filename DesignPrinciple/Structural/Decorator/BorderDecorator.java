public class BorderDecorator extends TextDecorator {
    public BorderDecorator(TextComponent inner) { super(inner); }
    public String render() {
        String content = inner.render();
        return "[border]" + content + "[/border]";
    }
}
