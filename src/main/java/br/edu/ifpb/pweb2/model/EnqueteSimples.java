package br.edu.ifpb.pweb2.model;
import java.util.ArrayList;
import java.util.List;

public class EnqueteSimples {
    private List<String> opcoes;  // List of options
    private List<Integer> votos;  // List of vote counts for each option
    private List<EnqueteListener> listeners;  // List of registered listeners

    public EnqueteSimples() {
        opcoes = new ArrayList<>();
        votos = new ArrayList<>();
        listeners = new ArrayList<>();
    }

    // Add a new voting option
    public void addOpcao(String opcao) {
        opcoes.add(opcao);
        votos.add(0);  // Initialize vote count for the option
        disparaNovaOpcao(opcao);  // Notify listeners about the new option
    }

    // Register a listener
    public void addEnqueteListener(EnqueteListener listener) {
        listeners.add(listener);
    }

    // Vote for an option by index
    public void votar(int opcaoIndex) {
        if (opcaoIndex >= 0 && opcaoIndex < votos.size()) {
            votos.set(opcaoIndex, votos.get(opcaoIndex) + 1);  // Increment vote count
            disparaNovoVoto(opcaoIndex);  // Notify listeners about the new vote
        }
    }

    // Notify listeners about a new vote
    private void disparaNovoVoto(int opcaoIndex) {
        for (EnqueteListener listener : listeners) {
            listener.novoVoto(new EnqueteEvent(this, opcoes.get(opcaoIndex), votos.get(opcaoIndex)));
        }
    }

    // Notify listeners about a new option
    private void disparaNovaOpcao(String opcao) {
        for (EnqueteListener listener : listeners) {
            listener.novaOpcao(new EnqueteEvent(this, opcao, 0));
        }
    }

    // Get options and votes
    public List<String> getOpcoes() {
        return opcoes;
    }

    public List<Integer> getVotos() {
        return votos;
    }
}
