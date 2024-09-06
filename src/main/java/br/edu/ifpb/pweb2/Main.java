package br.edu.ifpb.pweb2;

import br.edu.ifpb.pweb2.GUI.VoteUI;
import br.edu.ifpb.pweb2.controller.VoteUICtrl;
import br.edu.ifpb.pweb2.model.EnqueteSimples;
import br.edu.ifpb.pweb2.model.PercentUI;
import br.edu.ifpb.pweb2.model.ResultadoUI;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        EnqueteSimples enquete = new EnqueteSimples();
        VoteUICtrl controller = new VoteUICtrl(enquete);
        controller.addOpcao("Observer");
        controller.addOpcao("Iterador");
        controller.addOpcao("Strategy");

        VoteUI telaVote = new VoteUI(enquete);
        ResultadoUI resultado = new ResultadoUI(enquete);
        PercentUI percent = new PercentUI(enquete);

        telaVote.exibirOptions();
        }
    }
}