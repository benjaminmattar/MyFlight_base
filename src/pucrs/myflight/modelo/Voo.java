package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;

public abstract class Voo {
	
	public enum Status { CONFIRMADO, ATRASADO, CANCELADO };
	
	private LocalDateTime datahora;
	private Duration duracao;
	private Rota rota;
	private Status status;
	public Voo(Rota rota, LocalDateTime datahora, Duration duracao) {
		this.rota = rota;
		this.datahora = datahora;
		this.duracao = duracao;
		this.status = Status.CONFIRMADO; // default é confirmado
		
	
	}
	public Voo(Rota rota, Duration duracao) {
		this.rota =rota;
		this.duracao = duracao;
		this.datahora = LocalDateTime.of(2016, 8, 12, 12, 00);
	}
	
	
	public abstract Rota getRota();
	
	
	public LocalDateTime getDatahora() {
		return datahora;
	}
	
	public abstract Duration getDuracao();
	
	
	public Status getStatus() {
		return status;
	}
	
	public void setStatus(Status novo) {
		this.status = novo;
	}
	@Override
	public String toString() {
		return "[Voo datahora=" + datahora + ", duracao=" + duracao + ", rota=" + rota + ", status=" + status
				+ "]";
	}	
}
