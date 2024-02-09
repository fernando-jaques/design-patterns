package comportamentais.command;

public class DesligarLampada implements Command {

    private Lampada lampada;

    public DesligarLampada(final Lampada aLampada) {
        this.lampada = aLampada;
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
