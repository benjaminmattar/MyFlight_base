package pucrs.myflight.modelo;
import java.util.ArrayList;

public class GerenciadorAeroportos {
    private ArrayList<Aeroporto> aeroportos;
	
    public GerenciadorAeroportos(){
        aeroportos = new ArrayList<>();
    }

    public void cadastrarAeronave(Aeroporto aeroport) {
            aeroportos.add(aeroport);
    }
    
        public Aeroporto buscarPorCodigoAeroport(String cod){
            for(int i=0;i<aeroportos.size();i++){
                Aeroporto a = aeroportos.get(i);
                if(a.getCodigo().equals(cod)){
                    return a;
                }
            }
            return null;
        
    }
    public ArrayList<Aeroporto> listarTodas() {
        
        return aeroportos;
 

    }
}
