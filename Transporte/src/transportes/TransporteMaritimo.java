package transportes;

public class TransporteMaritimo implements Transporte {
    @Override
    public void entregar(String destino, double peso) {
        System.out.println("Entrega marítima internacional para " + destino + " agendada.");
    }
}
