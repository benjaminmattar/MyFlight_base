package pucrs.myflight.modelo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeitorDadosAirPort {
    private ArrayList<String> airport;

    public LeitorDadosAirPort() {
        airport = new ArrayList<String>();
    }

    public void leArquivo(String filename) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                String[] campos = linha.split(";");

                if (campos.length >= 5) {
                    String codigo = campos[0];
                    double latitude = Double.parseDouble(campos[1]);
                    double longitude = Double.parseDouble(campos[2]);
                    String nome = campos[3];
                    String pais = campos[4];

                    System.out.println("Código: " + codigo);
                    System.out.println("Latitude: " + latitude);
                    System.out.println("Longitude: " + longitude);
                    System.out.println("Nome: " + nome);
                    System.out.println("País: " + pais);
                    System.out.println();
                }
            }

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }

    public static void filtrarPorCodigo(List<String> codigos, String codigoFiltro) {
        List<String> codigosFiltrados = new ArrayList<>();

        for (String codigo : codigos) {
            if (codigo.equals(codigoFiltro)) {
                codigosFiltrados.add(codigo);
            }
        }
    }

    @Override
    public String toString() {
        return airport.toString();
    }

    public void filtrarCodigo(String string, String string2) {
    }
}
