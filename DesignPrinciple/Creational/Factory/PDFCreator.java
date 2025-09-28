public class PDFCreator extends DocumentCreator {
    protected Document createDocument() {
        return new PDFDocument();
    }
}
