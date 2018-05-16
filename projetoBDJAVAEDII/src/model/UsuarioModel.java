package model;

public class UsuarioModel {
    private String nome;
    private float salario;
    private int numero;

    public UsuarioModel(String nome, float salario, int numero) {
        this.nome = nome;
        this.salario = salario;
        this.numero = numero;
    }
    
    public UsuarioModel() {
        nome = new String();
        salario = 0;
        numero = 0;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
}
