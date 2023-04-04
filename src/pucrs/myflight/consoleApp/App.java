package pucrs.myflight.consoleApp;

import pucrs.myflight.modelo.Aeronave;
import pucrs.myflight.modelo.Aeroporto;
import pucrs.myflight.modelo.CiaAerea;
import pucrs.myflight.modelo.Geo;
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
		Duration agora = LocalDateTime.now();

		Geo lat1 = new Geo(-29.9939,-51.1711);
		Geo lat2 = new Geo(-23.4356,-46.4731);
		Aeronave a = new Aeronave("733", "Boeing 737-300");
		Aeronave b = new Aeronave("73G", "Boeing 737-700");
		Aeronave c = new Aeronave("380", "Airbus Industrie A380");
		CiaAerea d = new CiaAerea("JJ", "LATAM Linhas Aéreas");
		CiaAerea e = new CiaAerea("G3", "Gol Linhas Aéreas SA");
		CiaAerea f = new CiaAerea("TP", "TAP Portugal");
		Aeroporto g = new Aeroporto("POA", "Salgado Filho Intl Apt", lat1);
		Aeroporto go = new Aeroporto("GRU", "São Paulo Guarulhos Intl Apt", lat2);
		Rota r1 = new Rota(f, g, go, a);
		Rota r2 = new Rota(e, go, g, b);
		// Voo v1 = new Voo(r2, hoje, agora); COMO USAR O LOCAL DATE?
		//beza


		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(c.toString());


	}
}
