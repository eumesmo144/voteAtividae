package br.edu.ifpb.pweb2.model;
import br.edu.ifpb.pweb2.*;

public class PercentUI implements EnqueteListener{
    private EnqueteSimples enquete;
    public PercentUI(EnqueteSimples enquete) {
        this.enquete = enquete;
        enquete.addEnqueteListener(this);
    }
    @Override
    public void novoVoto(EnqueteEvent event){
        int totalVotos = 0;
        for (int votos : enquete.getVotos()){
            totalVotos += votos;
        }
        double percentage = (double)totalVotos / enquete.getVotos().size() * 100;
        System.out.println("Votos: " + totalVotos + " Votos: " + percentage);
    }
    @Override
    public void novOPcao(EnqueteEvent event) {
        System.out.println("Nova opcao: " + event.getOpcao());
    }
}
