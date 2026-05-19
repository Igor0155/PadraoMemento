package memento;

public class ContratoEstadoAprovado implements ContratoEstado {

    private ContratoEstadoAprovado() {
    };

    private static ContratoEstadoAprovado instance = new ContratoEstadoAprovado();

    public static ContratoEstadoAprovado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Aprovado";
    }
}