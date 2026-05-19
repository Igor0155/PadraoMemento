package memento;

public class ContratoEstadoCancelado implements ContratoEstado {

    private ContratoEstadoCancelado() {
    };

    private static ContratoEstadoCancelado instance = new ContratoEstadoCancelado();

    public static ContratoEstadoCancelado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Cancelado";
    }
}