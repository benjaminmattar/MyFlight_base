package pucrs.myflight.modelo;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeituraDadosCountries {

    private ArrayList<String> countries;

    public LeituraDadosCountries() {
        countries = new ArrayList<>();
    }

    public void lerArquivo(String arquivo) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(arquivo))) {
            String linha;
            while ((linha = dis.readLine()) != null) {
                if (linha.startsWith("#")) {
                    String[] partes = linha.substring(1).split(";");
                    if (partes.length == 2) {
                        String code = partes[0].trim();
                        String name = partes[1].trim();
                        countries.add(code);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
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
