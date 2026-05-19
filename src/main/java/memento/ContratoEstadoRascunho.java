package memento;

public class ContratoEstadoRascunho implements ContratoEstado {

    private ContratoEstadoRascunho() {
    };

    private static ContratoEstadoRascunho instance = new ContratoEstadoRascunho();

    public static ContratoEstadoRascunho getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Rascunho";
    }
}