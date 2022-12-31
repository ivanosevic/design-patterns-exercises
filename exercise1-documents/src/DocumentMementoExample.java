public class DocumentMementoExample {
    public static void main(String[] args) {
        var document = new Document("", "Times New Romans", 12);
        var editor = new Editor(document);
        editor.addContent("About Memento Pattern");
        editor.addContent("Author: Ivan");
        editor.undo();
        editor.printDocument();
        editor.undo();
        editor.printDocument();
        editor.undo();
        editor.printDocument();
    }
}