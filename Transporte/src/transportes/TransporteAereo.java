package transportes;

public class TransporteAereo implements Transporte {
    @Override
    public void entregar(String destino, double peso) {
        if (peso > 50) {
            System.out.println("Entrega aérea para " + destino + " negada. Peso excede o limite.");
        } else {
            System.out.println("Entrega aérea para " + destino + ". Limites de peso e dimensões aceitos.");
        }
    }
}
