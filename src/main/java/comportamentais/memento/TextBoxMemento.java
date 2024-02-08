package comportamentais.memento;

public class TextBoxMemento implements Memento {

    private final TextBox originador;

    private final int x;
    private final int y;
    private final String fontFamily;
    private final String textAling;
    private final String fontWeigth;

    @Override
    public void restaurar() {
        originador.setPosition(x, y);
        originador.setFontFamily(fontFamily);
        originador.setFontWeigth(fontWeigth);
        originador.setTextAling(textAling);
    }

    public TextBoxMemento(TextBox textBox, int x, int y, String fontFamily, String textAling, String fontWeigth) {
        this.originador = textBox;
        this.x = x;
        this.y = y;
        this.fontFamily = fontFamily;
        this.textAling = textAling;
        this.fontWeigth = fontWeigth;
    }
}
