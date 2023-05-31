package pucrs.myflight.modelo;

import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;

public class VooEscalas extends Voo {
    private Rota rotaFinal;
    private Duration duracao;
    private ArrayList<Rota> rotas;  

    public VooEscalas(Rota rota, Rota rotaFinal, LocalDateTime datahora, Duration duracao) {
        super(rota, datahora, duracao);
        this.rotaFinal = rotaFinal;

    }

    public void adicionaRota(Rota rota) {

    }

    public Rota getRotaFinal() {
        return rotaFinal;
    }

    @Override
    public String toString() {
        return super.toString() + " -> " + rotaFinal;
    }

    @Override
    public Rota getRota() {
        return rotaFinal;
    }

    @Override
    public Duration getDuracao() {
        return duracao;
    }

    public ArrayList<Rota> getRotas() {
        return rotas;
    }
}
