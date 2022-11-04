package br.com.exercicio.empresa;

public class Funcionario extends Pessoa{

    private String departamento;
    private double salario;
    private String dataEntrada;
    private String rg;
    private boolean status;

    public Funcionario(String nome, String email, String telefone, String departamento, double salario, String dataEntrada, String rg, boolean status) {
        super(nome, email, telefone);
        this.departamento = departamento;
        this.salario = salario;
        this.dataEntrada = dataEntrada;
        this.rg = rg;
        this.status = status;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void bonificar(double bonus){
        this.salario+=bonus;
    }
    public void demitir(){
        this.status= false;
        // if(isStatus()==true)
        //   setStatus(false);
    }
    public String mostrarDados(){
        return "Nome: " + getNome() +
                "\nE-Mail: " + getEmail() +
                "\nTelefone: " + getTelefone() +
                "\nDepartamento: " + getDepartamento() +
                "\nSalario: " + getSalario() +
                "\nData de Entrada: " + getDataEntrada() +
                "\nRG: " + getRg() +
                "\nStatus: " + isStatus();
    }

}
