public class FactoryDemo {
    public static void main(String[] args) {
        DocumentCreator pdf = new PDFCreator();
        DocumentCreator word = new WordCreator();
        DocumentCreator html = new HTMLCreator();

        pdf.newDocument();
        word.newDocument();
        html.newDocument();
    }
}
