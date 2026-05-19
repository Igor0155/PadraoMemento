package memento;

public class ContratoEstadoEmRevisao implements ContratoEstado {

    private ContratoEstadoEmRevisao() {
    };

    private static ContratoEstadoEmRevisao instance = new ContratoEstadoEmRevisao();

    public static ContratoEstadoEmRevisao getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Em Revisão";
    }
}