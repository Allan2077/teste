package io.github.allan2077;

public class Teste {
    private String nome;
    private String idade;

    @Override
    public String toString() {
        return "Teste{" +
                "nome='" + nome + '\'' +
                ", idade='" + idade + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public Teste() {
    }

    public Teste(String nome, String idade) {
        this.nome = nome;
        this.idade = idade;
    }


}
