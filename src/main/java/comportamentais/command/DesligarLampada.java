package comportamentais.command;

public class DesligarLampada implements Command {

    private Lampada lampada;

    public DesligarLampada(Lampada lampada) {
        this.lampada = lampada;
    }

    @Override
    public void executar() {
        this.lampada.desligar();
    }

    @Override
    public void desfazer() {
        this.lampada.ligar();
    }
}
