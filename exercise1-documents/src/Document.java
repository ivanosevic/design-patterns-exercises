public class Document {

    private String content;
    private String fontName;
    private Integer fontSize;

    public Document(String content, String fontName, Integer fontSize) {
        this.content = content;
        this.fontName = fontName;
        this.fontSize = fontSize;
    }

    public DocumentState createState() {
        return new DocumentState(this.content, this.fontName, this.fontSize);
    }

    public void restoreState(DocumentState state) {
        this.content = state.getContent();
        this.fontName = state.getFontName();
        this.fontSize = state.getFontSize();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public Integer getFontSize() {
        return fontSize;
    }

    public void setFontSize(Integer fontSize) {
        this.fontSize = fontSize;
    }

    @Override
    public String toString() {
        return "Document{" +
                "content='" + content + '\'' +
                ", fontName='" + fontName + '\'' +
                ", fontSize=" + fontSize +
                '}';
    }
}
