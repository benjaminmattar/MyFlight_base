import java.io.File;

public class LeituraDados {
    public static void main(String[] args) {
        File diretorio = new File("airlines.dat");
        File[] arquivos = diretorio.listFiles();

        if (arquivos != null) {
            for (File arquivo : arquivos) {
                if (arquivo.isFile()) {
                    System.out.println("Nome do arquivo: " + arquivo.getName());
                }
            }
        }
    }
}

