package transportes;

public class SelecionadorTransporte {
    public static Transporte selecionarTransporte(String tipo) {
        switch (tipo.toLowerCase()) {
            case "terrestre":
                return new TransporteTerrestre();
            case "aereo":
                return new TransporteAereo();
            case "maritimo":
                return new TransporteMaritimo();
            case "drone":
                return new TransporteDrone();
            default:
                throw new IllegalArgumentException("Tipo de transporte desconhecido: " + tipo);
        }
    }
}
