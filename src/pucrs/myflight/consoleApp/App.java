package pucrs.myflight.consoleApp;

import pucrs.myflight.modelo.Aeronave;
import pucrs.myflight.modelo.Aeroporto;
import pucrs.myflight.modelo.CiaAerea;
import pucrs.myflight.modelo.Geo;
import pucrs.myflight.modelo.GerenciadorAeronaves;
import pucrs.myflight.modelo.LeituraDados;
import pucrs.myflight.modelo.LeituraDadosAirlines;
import pucrs.myflight.modelo.Rota;
import pucrs.myflight.modelo.Voo;

import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;

import java.time.format.DateTimeFormatter;

public class App {

	public static void main(String[] args) {
		System.out.println("\nMyFlight project...");
		LocalDate hoje = LocalDate.now();
		
		

		// Duration agora = Duration
		GerenciadorAeronaves gerenciaAeronave = new GerenciadorAeronaves();
		
		Geo latlong1 = new Geo(-29.9939,-51.1711);
		Geo latlong2 = new Geo(-23.4356,-46.4731);
		
		Aeronave aeronaveA = new Aeronave("733", "Boeing 737-300");
		Aeronave aeronaveB = new Aeronave("12G", "Airbus Industrie A380");
		Aeronave aeronaveC = new Aeronave("380", "Boeing 123-456");
		
		CiaAerea ciaAereaA = new CiaAerea("JJ", "LATAM Linhas Aéreas");
		CiaAerea ciaAereaB  = new CiaAerea("G3", "Gol Linhas Aéreas SA");
		CiaAerea ciaAereaC = new CiaAerea("TP", "TAP Portugal");
		
		Aeroporto aeroportoA = new Aeroporto("POA", "Salgado Filho Intl Apt", latlong1);
		Aeroporto aeroportoB = new Aeroporto("GRU", "São Paulo Guarulhos Intl Apt", latlong2);

		System.out.println(latlong1.distancia(latlong2));

		System.out.println(Geo.distancia(latlong1, latlong2));

		System.out.println();

		Rota rota1 = new Rota(ciaAereaA,aeroportoA,aeroportoB,aeronaveA);
		Rota rota2 = new Rota(ciaAereaB, aeroportoB, aeroportoA, aeronaveC);

		LocalDateTime datahora = LocalDateTime.of(2003, 5, 27, 15, 30);
		Duration duracao = Duration.ofMinutes(120); // 2 horas

		Voo voo1 = new Voo(rota2, duracao);
		Voo voo2 = new Voo(rota2, datahora, duracao);
		System.out.println(voo1.toString());
		System.out.println(voo2.toString());


		Voo v1 = new Voo(rota2, datahora, duracao); 
		
		gerenciaAeronave.adicionar(aeronaveA);
		gerenciaAeronave.adicionar(aeronaveB);
		gerenciaAeronave.adicionar(aeronaveC);
		
		System.out.print(gerenciaAeronave.listarTodas().toString());

		System.out.println("Total de empresas: "+CiaAerea.getTotalCias());
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(c.toString());
		
		LeituraDadosAirlines a = new LeituraDadosAirlines();
		a.leArquivo("airlines.dat");	//apenas para este arquivo por enquanto..
		a.filtraCodigo("D7");

	}

	
}
