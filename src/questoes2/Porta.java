package questoes2;

// 2.a Classe: questoes2.Porta
public class Porta {
    // Atributos: aberta, cor, dimensaoX, dimensaoY, dimensaoZ.
    private boolean aberta;
    private String cor;
    private int dimensaoX;
    private int dimensaoY;
    private int dimensaoZ;

    // Métodos: void abre(), void fecha(), void pinta(String s), boolean estaAberta().

    void abre(){
        aberta = true;
        System.out.println("Abrindo a porta");
    }

    void fecha(){
        aberta = false;
        System.out.println("Fechando a porta");
    }

    void pinta(String s){
        cor = s;
        System.out.println("Cor da porta: " + cor);
    }

    boolean estaAberta(){
        System.out.println("Porta aberta");
        return aberta;
    }

    // Para testar, crie uma porta, abra e feche a mesma, pinte‐a de diversas cores,
    //altere suas dimensões e use o método estaAberta para verificar se ela está
    //aberta.

    public static void main(String[] args) {
        Porta p = new Porta();

        p.abre();

        p.estaAberta();

        p.fecha();

        p.estaAberta();

        p.pinta("vermelho");

        p.pinta("verde");

        p.pinta("azul");

        p.dimensaoX = 18;
        p.dimensaoY = 26;
        p.dimensaoZ = 27;

        System.out.println(p.dimensaoX);
        System.out.println(p.dimensaoY);
        System.out.println(p.dimensaoZ);

        p.estaAberta();
    }
}

