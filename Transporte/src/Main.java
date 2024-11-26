import transportes.*;

public class Main {
    public static void main(String[] args) {
        Transporte transporte = SelecionadorTransporte.selecionarTransporte("aereo");
        transporte.entregar("São Paulo", 45.0);

        transporte = SelecionadorTransporte.selecionarTransporte("drone");
        transporte.entregar("Rio de Janeiro", 3.0);

        transporte = SelecionadorTransporte.selecionarTransporte("maritimo");
        transporte.entregar("Lisboa", 200.0);
    }
}
