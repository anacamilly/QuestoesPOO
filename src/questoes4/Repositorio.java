package questoes4;

public interface Repositorio {
    public void guarda(Pessoa nova);

    void guarda(Pessoas nome);

    public Pessoa recupera(String cpf);
    public Pessoa primeiro();
    public Pessoa proximo();
}

