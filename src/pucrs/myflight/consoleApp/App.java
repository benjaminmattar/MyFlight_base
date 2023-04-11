package pucrs.myflight.consoleApp;

import pucrs.myflight.modelo.Aeronave;
import pucrs.myflight.modelo.Aeroporto;
import pucrs.myflight.modelo.CiaAerea;
import pucrs.myflight.modelo.Geo;
import pucrs.myflight.modelo.GerenciadorAeronaves;
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
		
		Aeronave a = new Aeronave("733", "Boeing 737-300");
		Aeronave b = new Aeronave("12G", "Airbus Industrie A380");
		Aeronave c = new Aeronave("380", "Boeing 123-456");
		
		CiaAerea d = new CiaAerea("JJ", "LATAM Linhas Aéreas");
		CiaAerea e = new CiaAerea("G3", "Gol Linhas Aéreas SA");
		CiaAerea f = new CiaAerea("TP", "TAP Portugal");
		
		Aeroporto g = new Aeroporto("POA", "Salgado Filho Intl Apt", latlong1);
		Aeroporto go = new Aeroporto("GRU", "São Paulo Guarulhos Intl Apt", latlong2);

		Geo.distGeoDadosArmaz(latlong1);

		Rota r1 = new Rota(f, g, go, a);
		Rota r2 = new Rota(e, go, g, b);

		LocalDateTime datahora = LocalDateTime.of(2003, 5, 27, 15, 30);
		Duration duracao = Duration.ofMinutes(120); // 2 horas

		Voo voo1 = new Voo(r2, duracao);
		Voo voo2 = new Voo(r2, datahora, duracao);
		System.out.println(voo1.toString());
		System.out.println(voo2.toString());


		Voo v1 = new Voo(r2, datahora, duracao); 
		
		gerenciaAeronave.adicionar(a);
		gerenciaAeronave.adicionar(b);
		gerenciaAeronave.adicionar(c);
		
		System.out.print(gerenciaAeronave.listarTodas().toString());
		// System.out.println(a.toString());
		// System.out.println(b.toString());
		// System.out.println(c.toString());


	}

	
}
