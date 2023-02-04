package questoes2;

import java.util.ArrayList;

public class Edificio {
    //Atributos: cor, totalDePortas, totalDeAndares, portas[]
    String cor;
    int totalDeAndares;

    int totalDePortas;
    static ArrayList<Porta> portas;

    //Métodos: void pinta(String s), int quantasPortasEstaoAbertas(), void
    //adicionaPorta(Porta p), int totalDePortas(), void adicionarAndar(), int
    //totalDeAndares().

    void pinta(String s) {
        cor = s;
        System.out.println("Cor do edificio: " + cor);
    }

    int quantasPortasEstaoAbertas() {
        int qtdPortasAbertas = 0;
        for(int i=0; i<portas.size(); i++) {
            if(portas.get(i).estaAberta()) {
                qtdPortasAbertas++;
            }
        }
        return qtdPortasAbertas;
    }

    void adicionaPorta(Porta p) {
        portas.add(p);
    }

    int totalDePortas() {
        return portas.size();
    }

    void adicionaAndar() {
        totalDeAndares++;
    }

    int totalDeAndares() {
        return totalDeAndares;
    }

    //Para testar, crie um edifício, pinte‐o. Crie seis portas e coloque‐as no edifício
    //através do método adicionaPorta, abra e feche‐as como desejar. Utilize o
    //método quantasPortasEstaoAbertas para imprimir o número de portas
    //abertas e o método totalDePortas para imprimir o total de portas em seu
    //edifício. Crie alguns andares utilizado o método adicionarAndar e retorne o

    public static void main(String[] args) {
        portas = new ArrayList<>();
        Edificio e = new Edificio();
        Porta p1 = new Porta();
        Porta p2 = new Porta();
        Porta p3 = new Porta();
        Porta p4 = new Porta();
        Porta p5 = new Porta();
        Porta p6 = new Porta();

        e.pinta("Branco");

        e.adicionaPorta(p1);
        e.adicionaPorta(p2);
        e.adicionaPorta(p3);
        e.adicionaPorta(p4);
        e.adicionaPorta(p5);
        e.adicionaPorta(p6);

        p1.abre();
        p2.abre();
        p3.abre();
        p4.abre();
        p5.abre();
        p6.abre();
        p3.fecha();
        p5.fecha();
        p6.fecha();

        System.out.println("Quantidade de portas abertas:" + e.quantasPortasEstaoAbertas());

        System.out.println("TOTAL DE PORTAS:" + e.totalDePortas());

        e.adicionaAndar();
        e.adicionaAndar();
        e.adicionaAndar();
        e.adicionaAndar();

        System.out.println("TOTAL DE ANDARES:" + e.totalDeAndares());

    }

}