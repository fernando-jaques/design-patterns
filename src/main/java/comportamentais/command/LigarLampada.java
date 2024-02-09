package comportamentais.command;

public class LigarLampada implements Command {

    private Lampada lampada;

    public LigarLampada(Lampada aLampada) {
        this.lampada = aLampada;
    }

    @Override
    public void executar() {
        this.lampada.ligar();
    }

    @Override
    public void desfazer() {
        this.lampada.desligar();
    }
}
