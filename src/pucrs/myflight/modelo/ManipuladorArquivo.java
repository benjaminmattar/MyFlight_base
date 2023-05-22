package pucrs.myflight.modelo;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ManipuladorArquivo {
    private List<Aeroporto> aeroportos;

    public void lerArquivo(String nomeArquivo) {
        aeroportos = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;

            while ((linha = reader.readLine()) != null) {
                String[] campos = linha.split(";");

                if (campos.length == 5) {
                    String codigo = campos[0];
                    double latitude = Double.parseDouble(campos[1]);
                    double longitude = Double.parseDouble(campos[2]);
                    String nome = campos[3];
                    String pais = campos[4];

                    Aeroporto aeroporto = new Aeroporto(codigo, latitude, longitude, nome, pais);
                    aeroportos.add(aeroporto);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void ordenarAeroportos() {
        Collections.sort(aeroportos, (a1, a2) -> a1.getCodigo().compareTo(a2.getCodigo()));
    }

    public Aeroporto buscarAeroporto(String codigo) {
        for (Aeroporto aeroporto : aeroportos) {
            if (aeroporto.getCodigo().equals(codigo)) {
                return aeroporto;
            }
        }

        return null; // Aeroporto não encontrado
    }
}

