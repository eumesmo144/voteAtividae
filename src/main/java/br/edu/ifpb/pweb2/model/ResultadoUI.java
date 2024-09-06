package br.edu.ifpb.pweb2.model;

import br.edu.ifpb.pweb2.model.EnqueteListener;

public class ResultadoUI implements EnqueteListener {
    public ResultadoUI(EnqueteSimples enquete) {
        enquete.addEnqueteListener(this);
    }
    @Override
    public void novoVoto(EnqueteEvent event){
        System.out.println("Total: " + event.getOpcao() + ": "+ event.getTotalVotos());
    }

    @Override
    public void novaOpcao(EnqueteEvent event) {

    }

}
