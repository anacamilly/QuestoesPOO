package questoes4;

public class Principal {

    public static void main(String[] args) {

        Pessoas pessoa1 = new Pessoas("Ari", "4834334");
        Pessoas pessoa2 = new Pessoas("Ana", "443435");
        Pessoas pessoa3 = new Pessoas("Clara", "6273782");
        Pessoas pessoaaux;

        Repositorios repos1 = new Repositorios() {
            @Override
            public Pessoa proximo() {
                return null;
            }
        };
        Repositorios repos2 = new Repositorios() {
            @Override
            public Pessoa proximo() {
                return null;
            }
        };
        Repositorios repos3 = new Repositorios() {
            @Override
            public Pessoa proximo() {
                return null;
            }
        };

        Utilitarios ut = new Utilitarios();

        repos1.guarda(pessoa1);
        repos1.guarda(pessoa2);
        repos2.guarda(pessoa3);
        pessoaaux = repos1.recupera("4834334");
        System.out.println(pessoaaux.getNome());
        pessoaaux = repos2.primeiro();
        System.out.println(pessoaaux.getNome());



        ut.Duplicar(repos1, repos2);
        ut.Dierenca(repos1, repos2, repos3);


    }

}
