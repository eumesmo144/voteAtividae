package br.edu.ifpb.pweb2.controller;

import br.edu.ifpb.pweb2.model.EnqueteSimples;

public class VoteUICtrl {
    private EnqueteSimples enquete;
    public VoteUICtrl(EnqueteSimples enquete) {
        this.enquete = enquete;
    }
    public void addOpcao(String opcao) {
        enquete.addOpcao(opcao);
    }
}
