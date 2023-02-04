package questoes4;

import java.util.ArrayList;

public abstract class Repositorios implements Repositorio {

    public Repositorios(){

    }


    private ArrayList<Pessoas>lista = new ArrayList<Pessoas>();



    public ArrayList<Pessoas> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Pessoas> lista) {
        this.lista = lista;
    }

    @Override
    public void guarda(Pessoas nome) {
        lista.add(nome);

    }

    @Override
    public Pessoas recupera (String cpf) {
        for(int i = 0; i<= lista.size(); i++){
            if(lista.get(i).getCPF().equals(cpf) ) {
                return lista.get(i);
            }
        }
        return null;
    }

    @Override
    public Pessoas primeiro() {
        return lista.get(0);

    }

    @Override
    public void guarda(Pessoa nova) {

    }

}
