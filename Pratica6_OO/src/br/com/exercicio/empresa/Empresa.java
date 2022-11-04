package br.com.exercicio.empresa;

public class Empresa {

    private String nome;
    private String cnpj;
    private int qtdeFuncionario;

    private static int count=0;

    Funcionario[] funcionarios;

    public Empresa(String nome, String cnpj, int qtdeFuncionario) {
        this.nome = nome;
        this.cnpj = cnpj;
        if(qtdeFuncionario<=100){
            this.qtdeFuncionario = qtdeFuncionario;
            funcionarios = new Funcionario[qtdeFuncionario];
        }
        else{
            this.qtdeFuncionario =100;
            funcionarios = new Funcionario[100];
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getQtdeFuncionario() {
        return qtdeFuncionario;
    }

    public void setQtdeFuncionario(int qtdeFuncionario) {
        this.qtdeFuncionario = qtdeFuncionario;
    }

    public void adicionaFuncionario(Funcionario func){
        funcionarios[count] = func;
        count++;
    }
    public String dadosEmpresa(){
        return "Nome: " + getNome() + "\nCNPJ: " + getCnpj() + "\nQuantidade de Funcionários: " + getQtdeFuncionario();
    }

}
