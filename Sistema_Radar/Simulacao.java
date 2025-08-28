package Sistema_Radar;

public class Simulacao {
    public static void main(String[] args) {
        System.out.println("Simulação");

        Carro dodge = new Carro();
        dodge.ano = 70;
        dodge.modelo = "Challenger";
        dodge.placa = "001";
        dodge.velocidade = 0;

        Radar radar = new Radar();
        radar.limiteVelocidade = 60;
        radar.localização = "Estrutural";

        radar.avaliarVelocidade(dodge);

        dodge.acelerar(); //10
        dodge.acelerar();
        dodge.acelerar();
        dodge.acelerar();
        dodge.acelerar();
        dodge.acelerar();
        dodge.acelerar();
        dodge.acelerar();
        dodge.acelerar();
        dodge.acelerar();
        dodge.acelerar();
        dodge.acelerar();
        dodge.acelerar();
        dodge.acelerar();
        dodge.acelerar();
        dodge.acelerar();
        dodge.acelerar();
        dodge.acelerar();
        dodge.acelerar();
        dodge.acelerar();
        dodge.acelerar();
        dodge.acelerar();
        dodge.acelerar(); //10

        radar.avaliarVelocidade(dodge);

        dodge.frear();

        radar.avaliarVelocidade(dodge);
    }
    
}
