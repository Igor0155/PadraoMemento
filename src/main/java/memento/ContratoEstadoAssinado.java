package memento;

public class ContratoEstadoAssinado implements ContratoEstado {

    private ContratoEstadoAssinado() {
    };

    private static ContratoEstadoAssinado instance = new ContratoEstadoAssinado();

    public static ContratoEstadoAssinado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Assinado";
    }
}