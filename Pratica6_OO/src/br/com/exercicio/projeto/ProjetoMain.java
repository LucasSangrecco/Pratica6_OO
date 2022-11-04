package br.com.exercicio.projeto;

import javax.swing.JOptionPane;

public class ProjetoMain {
    public static void main(String[] args) {

        int opcao;
        DistribuicaoAlimento d1 = new DistribuicaoAlimento("Projeto Alimento",
                "Distribuir alimentos aos necessitados",
                "Rua um, 01",
                "29/10/2022",
                "03/11/2022",
                "Arroz",
                10);
        TrabalhoVoluntario t1 = new TrabalhoVoluntario("Projeto Trabalho Voluntário",
                "Entregar agasalhos aos necessitádos",
                "Rua Dois, 02",
                "30/10/2022",
                "03/11/2022",
                "Motorista",
                8);

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma Opção: \n<1> Cadastrar Projeto Distribuir Alimentos " +
                    "\n<2> Cadastrar Projeto Trabalho Voluntário " +
                    "\n<3> Sair"));
            switch (opcao) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Validação: " + d1.validaProjeto() + "\n" + d1.imprimeProjeto(), "Projeto", JOptionPane.DEFAULT_OPTION);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Validação: " + t1.validaProjeto() + "\n" + t1.imprimeProjeto(), "Projeto", JOptionPane.DEFAULT_OPTION);
                    break;
                case 3:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida", "Erro", JOptionPane.WARNING_MESSAGE);
            }
        }
        while (opcao != 3);

    }
}
