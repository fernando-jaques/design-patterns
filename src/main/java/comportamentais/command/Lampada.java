package comportamentais.command;

public class Lampada {

    private boolean ligada = false;

    public void ligar() {
        ligada = true;
        System.out.println("Lâmpada ligada");
    }

    public void desligar() {
        ligada = false;
        System.out.println("Lâmpada desligada");
    }

    public void mudarEstato() {
     this.ligada = !this.ligada;
    }
}
