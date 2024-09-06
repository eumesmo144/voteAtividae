package br.edu.ifpb.pweb2.model;

public interface EnqueteListener {
    void novoVoto(EnqueteEvent event);
    void novaOpcao(EnqueteEvent event);
}
