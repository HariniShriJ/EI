public class ScrollDecorator extends TextDecorator {
    public ScrollDecorator(TextComponent inner) { super(inner); }
    public String render() {
        String content = inner.render();
        return "[scroll]" + content + "[/scroll]";
    }
}
