package questoes3;

public class Principal {

        public static void main(String[] args) {

            Carro carro = new Carro(null, null, null, null, 0);
            carro.setMarca("Toyota");
            carro.setModelo("Corolla");
            carro.setCor("Preto");
            carro.setCombustivel("Gasolina");
            carro.setQuantAcentos(5);

            System.out.println("MARCA: " + carro.getMarca());
            System.out.println("MODELO: " + carro.getModelo());
            System.out.println("COR: " + carro.getCor());
            System.out.println("COMBUSTIVEL: " + carro.getCombustivel());
            System.out.println("QUANT. ACENTOS: " + carro.getQuantAcentos());

            carro.ligar();
            carro.acelerar();
            carro.frear();
            carro.desligar();

            Motocicleta moto = new Motocicleta(null,null,null, null, 0);
            moto.setMarca("Honda");
            moto.setModelo("Biz");
            moto.setCor("Vermelha");
            moto.setCombustivel("Gasolina");
            moto.setQuantAcentos(2);

            System.out.println("MARCA: " + moto.getMarca());
            System.out.println("MODELO: " + moto.getModelo());
            System.out.println("COR: " + moto.getCor());
            System.out.println("COMBUSTIVEL: " + moto.getCombustivel());
            System.out.println("QUANT. ACENTOS: " + moto.getQuantAcentos());

            moto.ligar();
            moto.acelerar();
            moto.frear();
            moto.desligar();


        }

    }

