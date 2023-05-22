package pucrs.myflight.modelo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeituraDadosAirlines{
    private List<String> airlines;

    public LeituraDadosAirlines() {
        airlines = new ArrayList<>();
    }

    public void leArquivo(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] parts = linha.split(";");
                if (parts.length == 2) {
                    String codigo = parts[0].trim();
                    String nome = parts[1].trim();
                    airlines.add(codigo + " - " + nome);
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }

    public void filtraCodigo(String code) {
        for (String airline : airlines) {
            if (airline.startsWith(code)) {
                System.out.println(airline);
            }
        }
    }


    @Override
    public String toString() {
        return airlines.toString();
    }

}
