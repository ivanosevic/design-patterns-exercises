public class Editor {

    private final Document document;
    private final DocumentHistory documentHistory;

    public Editor(Document document) {
        this.document = document;
        this.documentHistory = new DocumentHistory();
        storeCurrentState();
    }

    private void storeCurrentState() {
        var currentState = document.createState();
        documentHistory.storeState(currentState);
    }

    public void addContent(String content) {
        var combinedText = this.document.getContent() + content;
        this.document.setContent(combinedText);
        storeCurrentState();
    }

    public void changeFontSize(Integer fontSize) {
        if (fontSize > 0) {
            this.document.setFontSize(fontSize);
            storeCurrentState();
        }
    }

    public void changeFontName(String fontName) {
        this.document.setFontName(fontName);
        storeCurrentState();
    }

    public void undo() {
        var previousState = documentHistory.pop();
        this.document.restoreState(previousState);
    }

    public void printDocument() {
        System.out.println(document);
    }
}
