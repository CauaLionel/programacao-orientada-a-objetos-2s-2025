package Sistema_Radar;

public class Radar {
    public Integer limiteVelocidade;
    public String localização;

    public void avaliarVelocidade(Carro carro){
        if(carro.velocidade > this.limiteVelocidade){
            //emitir notificação
            emitirNotificação(carro.placa, carro.velocidade);
        }
    }

    public void emitirNotificação(String placa, Integer velocidadeObservada){
        System.out.println("Placa: "+placa);
        System.out.println("Velocidade Observada: "+velocidadeObservada);
        System.out.println("Limite da via: "+ this.limiteVelocidade);

    }

}
