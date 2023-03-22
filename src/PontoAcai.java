import jdk.nashorn.internal.scripts.JO;

import javax.swing.JOptionPane;

public class PontoAcai {
    public static void main(String[] args) {

        int opcao, opcaoAcres;

        opcao = Integer.parseInt(JOptionPane.showInputDialog("(1) 300ml\n(2) 500ml\n(3) 700ml"));
        opcaoAcres = Integer.parseInt(JOptionPane.showInputDialog("Você quer acrescimo?\n(1) Sim\n(2) Não"));

        Acai acai = new Acai();

        acai.calculaValor(opcao);
        acai.calculaAcrescimo(opcaoAcres);

        JOptionPane.showMessageDialog(null, "O seu açaí ficou no valor de: " + acai.getValor());

    }
}
