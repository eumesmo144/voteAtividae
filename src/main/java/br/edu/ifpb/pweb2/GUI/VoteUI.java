package br.edu.ifpb.pweb2.GUI;

import br.edu.ifpb.pweb2.model.EnqueteEvent;
import br.edu.ifpb.pweb2.model.EnqueteListener;
import br.edu.ifpb.pweb2.model.EnqueteSimples;

import java.util.Scanner;

public class VoteUI implements EnqueteListener {
    private EnqueteSimples enquete;

    public VoteUI(EnqueteSimples enquete) {
        this.enquete = enquete;
        enquete.addEnqueteListener(this);
    }
    public void exibirOptions(){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Selecione uma opção");
            for (int i = 0; i < enquete.getOpcoes().size(); i++){
                System.out.println(i + ": " + enquete.getOpcoes().get(i));
            }
            int opcao = sc.nextInt();
            enquete.votar(opcao);
        }
    }
    @Override
    public void novoVoto(EnqueteEvent event){
        System.out.println("Voto registrado: " + event.getOpcao());
    }
    @Override
    public void novaOpcao(EnqueteEvent event){
        System.out.println("Nova opcao: " + event.getOpcao());
    }
}
