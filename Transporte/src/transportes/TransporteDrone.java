package transportes;

public class TransporteDrone implements Transporte {
    @Override
    public void entregar(String destino, double peso) {
        if (peso > 5) {
            System.out.println("Entrega por drone para " + destino + " negada. Peso excede o limite.");
        } else {
            System.out.println("Entrega por drone para " + destino + " agendada.");
        }
    }
}
