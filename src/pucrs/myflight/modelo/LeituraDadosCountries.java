package pucrs.myflight.modelo;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeituraDadosCountries {

    private ArrayList<String> countries;

    public LeituraDadosCountries() {
        countries = new ArrayList<String>();
    }

    public void leArquivo(String filename) {
         try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] parts = linha.split(";");
                if (parts.length == 2) {
                    String codigo = parts[0].trim();
                    String nome = parts[1].trim();
                    countries.add(codigo + " - " + nome);
                    System.out.print("Sigla: " + codigo);
                    System.out.print(" || País: " + nome+"\n");
                }
            }
          } 
             catch (IOException e) {
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
        return countries.toString();
    }

    public void filtrarCodigo(String string1, String string2) {
        
    }
}
