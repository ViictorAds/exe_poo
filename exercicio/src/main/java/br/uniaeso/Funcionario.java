package br.uniaeso;

 

public class Funcionario {
    private String nome;
    private double salario;
    private String data_admissao;

    public Funcionario (String nome, double salario, String data_admissao) {
        this.nome = nome;
        this.salario = salario;
        this.data_admissao = data_admissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        double Qtdsalario = salario * 0.1f;
        this.salario = salario + Qtdsalario;
    }

    public double getSalario() {
        return salario;
    }

    public String getAdmissao() {
        return data_admissao;
    }

    public void setAdmissao(String data_admissao) {
        this.data_admissao = data_admissao;
    }

    
}
