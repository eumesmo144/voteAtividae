package br.edu.ifpb.pweb2.model;

public class EnqueteEvent {
    private EnqueteSimples source;
    private String opcao;
    private int totalVotos;
    public EnqueteEvent(EnqueteSimples source, String opcao, int totalVotos) {
        this.source = source;
        this.opcao = opcao;
        this.totalVotos = totalVotos;
    }

    public EnqueteSimples getSource() {
        return source;
    }
    public String getOpcao() {
        return opcao;
    }
    public int getTotalVotos() {
        return totalVotos;
    }
}
