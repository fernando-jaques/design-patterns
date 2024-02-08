package comportamentais.memento;

public class TextBox implements Originador {

    private int x;
    private int y;
    private String fontFamily;
    private String textAling;
    private String fontWeigth;

    public TextBox(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    public String getTextAling() {
        return textAling;
    }

    public void setTextAling(String textAling) {
        this.textAling = textAling;
    }

    public String getFontWeigth() {
        return fontWeigth;
    }

    public void setFontWeigth(String fontWeigth) {
        this.fontWeigth = fontWeigth;
    }

    public void setPosition(int x, int y) {
        setX(x);
        setY(y);
    }

    @Override
    public Memento salvarHistorico() {

        return new TextBoxMemento(
                this,
                getX(),
                getY(),
                getFontFamily(),
                getTextAling(),
                getFontWeigth()
        );
    }
}