package questoes2;

public class Casa {
    //Atributos: cor, porta1, porta2, porta3;
    private String cor;
    static Porta porta1;
    static Porta porta2;
    static Porta porta3;

    public Casa(Porta porta1,Porta porta2,Porta porta3, String cor) {
        this.porta1 = porta1;
        this.porta2 = porta2;
        this.porta3 = porta3;
        this.cor = cor;
    }

    public Casa() {

    }

    //AMétodo: void pinta(String s), int quantasPortasEstaoAbertas(), int
    //totalDePortas().

    public Porta getPorta1() {
        return this.porta1;
    }

    public Porta getPorta2() {
        return porta2;
    }

    public Porta getPorta3() {
        return porta3;
    }

    void pinta(String s){
        cor = s;
        System.out.println("Cor da casa: " + cor);
    }

    public int quantasPortasEstaoAbertas() {
        int qntPortasAbertas = 0;
        if (porta1.estaAberta()){
            qntPortasAbertas++;
        }
        if (porta2.estaAberta()){
            qntPortasAbertas++;
        }
        if (porta3.estaAberta()){
            qntPortasAbertas++;
        }

        return qntPortasAbertas;
    }

    int totalDePortas(){
        return 0;
    }

    //Para testar, crie uma casa e pinte‐a. Crie três portas e
    //coloque‐as na casa; abra e feche as mesmas como desejar. Utilize o método
    //quantasPortasEstaoAbertas() para imprimir o número de portas abertas.

    public static void main(String[] args) {
        Porta porta1 = new Porta();
        Porta porta2 = new Porta();
        Porta porta3 = new Porta();
        Casa casa = new Casa(porta1, porta2, porta3, "Azul");

        casa.pinta("Rosa");

        casa.getPorta1().abre();
        casa.getPorta2().abre();
        casa.getPorta3().abre();

        casa.getPorta3().fecha();

        System.out.println("Quantidade de portas abertas: " + casa.quantasPortasEstaoAbertas());

    }
}
