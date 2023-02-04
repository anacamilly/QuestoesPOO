package questoes3;

public abstract class Veiculo {
    public String marca;
    public String modelo;
    public String cor;
    public String combustivel;
    public int quantAcentos;

    public Veiculo (String marca, String modelo, String cor, String combustivel, int quantAcentos) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.combustivel = combustivel;
        this.quantAcentos = quantAcentos;
    }

    public void acelerar() {
        System.out.println("Acelerar");
    }

    public void frear() {
        System.out.println("Frear");
    }

    public void ligar() {
        System.out.println("Ligar");
    }

    public void desligar() {
        System.out.println("desligar");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public int getQuantAcentos() {
        return quantAcentos;
    }

    public void setQuantAcentos(int quantAcentos) {
        this.quantAcentos = quantAcentos;
    }
}
