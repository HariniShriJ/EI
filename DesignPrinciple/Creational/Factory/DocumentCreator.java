public abstract class DocumentCreator {
    public void newDocument() {
        Document doc = createDocument();
        doc.open();
        doc.save();
    }
    protected abstract Document createDocument();
}
