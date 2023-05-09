package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;


public class VooDireto {
    private Rota rota;
    private LocalDateTime dh;
    private Duration duracao;
    
    public VooDireto(LocalDateTime dh, Rota rota){
        this.dh=dh;
        this.rota=rota;
    }

    public Duration getDuracao(){
        return duracao;
    }

    public Rota getRota(){
        return rota;
    }




}
