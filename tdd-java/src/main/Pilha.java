package main;

import java.util.ArrayList;
import java.util.List;

public class Pilha {

    private List<Object> elementos = new ArrayList<>(10);

    public boolean estaVazia() {
        return elementos.isEmpty();
    }

    public int tamanho() {
        return elementos.size();
    }

    public void empilha(Object elemento) {
        if (elementos.size() == 11) {
            throw new PilhaCheiaException("Não é possível empilhar");
        }
        this.elementos.add(elemento);
    }

    public Object topo() {
        return elementos.get(elementos.size() -1);
    }

    public Object desempilha() {
        if (elementos.isEmpty()) {
            throw new PilhaVaziaException("Não é possível desempilhar");
        }
        Object topo = topo();
        elementos.remove(topo);
        return topo;
    }
}
