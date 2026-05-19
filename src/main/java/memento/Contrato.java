package memento;

import java.util.ArrayList;
import java.util.List;

public class Contrato {

    private ContratoEstado estado;
    private List<ContratoEstado> memento = new ArrayList<ContratoEstado>();

    public ContratoEstado getEstado() {
        return this.estado;
    }

    public void setEstado(ContratoEstado estado) {
        this.estado = estado;
        this.memento.add(this.estado);
    }

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.estado = this.memento.get(indice);
    }

    public List<ContratoEstado> getEstados() {
        return this.memento;
    }
}