package transportes;

public class TransporteTerrestre implements Transporte {
    @Override
    public void entregar(String destino, double peso) {
        System.out.println("Entrega terrestre para " + destino + ". Transportadora local selecionada.");
    }
}
