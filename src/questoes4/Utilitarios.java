package questoes4;

public class Utilitarios {

    public void Duplicar(Repositorios A, Repositorios B) {
        Pessoas ps;
        for (int i = 0; i <= A.getLista().size(); i++) {
            ps = new Pessoas(A.getLista().get(i).getNome(),A.getLista().get(i).getCPF());
            B.guarda(ps);
        }
    }

    public void Dierenca(Repositorios A, Repositorios B, Repositorios C) {
        Pessoas ps;
        for (int i = 0; i <= A.getLista().size(); i++) {
            int cont = 0;
            for (int J = 0; J <= B.getLista().size(); J++) {
                if (A.getLista().get(i).getCPF().equals(B.getLista().get(J).getCPF())) {
                    cont ++;

                }

            }
            if (cont == 0) {
                ps = new Pessoas(A.getLista().get(i).getNome(),A.getLista().get(i).getCPF());
                C.guarda(ps);
            }
        }


    }


}
