package br.com.exercicio.empresa;

import javax.swing.JOptionPane;

public class EmpresaMain {
    public static void main(String[] args) {

        String nome, email, telefone, departamento, dataEntrada, rg, nomeEmpresa, cnpj;
        int qtdeFuncionarios;
        double salario;
        boolean status=true;

        Funcionario[] funcionarios = new Funcionario[10];
        Funcionario func;
        Empresa emp1;


        for (int i=0;i< funcionarios.length; i++){
            nome = JOptionPane.showInputDialog("Digite o nome: ");
            email = JOptionPane.showInputDialog("Digite o e-mail: ");
            telefone = JOptionPane.showInputDialog("Digite o telefone: ");
            departamento = JOptionPane.showInputDialog("Digite o departamento: ");
            dataEntrada = JOptionPane.showInputDialog("Digite a data de entrada: ");
            rg = JOptionPane.showInputDialog("Digite o RG: ");
            salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário: "));
            func = new Funcionario(nome, email, telefone, departamento, salario, dataEntrada, rg, status);
            funcionarios[i]=func;
            //funcionarios[i]= new Funcionario(); também funciona
            }

        nomeEmpresa = JOptionPane.showInputDialog("Criando a empresa.\nDigite o nome: ");
        cnpj = JOptionPane.showInputDialog("Digite o CNPJ: ");
        qtdeFuncionarios = funcionarios.length;

        emp1 = new Empresa(nomeEmpresa, cnpj, qtdeFuncionarios);

        for(Funcionario func1 : funcionarios) {
            emp1.adicionaFuncionario(func1);
            JOptionPane.showMessageDialog(null, func1.mostrarDados(), "Dados Funcionário", JOptionPane.DEFAULT_OPTION);
            JOptionPane.showMessageDialog(null, emp1.dadosEmpresa(), "Dados da Empresa", JOptionPane.DEFAULT_OPTION);
        }
    }
}
