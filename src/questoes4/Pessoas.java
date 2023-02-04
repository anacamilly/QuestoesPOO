package questoes4;

public class Pessoas implements Pessoa {

    private String nome;
    private String CPF;

    public Pessoas (String nome, String CPF) {
        this.nome = nome;
        this.CPF = CPF;
    }

    @Override
    public String getCPF() {
        // TODO Auto-generated method stub
        return CPF;
    }

    @Override
    public String getNome() {
        // TODO Auto-generated method stub
        return nome;
    }

}