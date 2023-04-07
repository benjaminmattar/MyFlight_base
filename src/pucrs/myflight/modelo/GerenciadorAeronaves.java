package pucrs.myflight.modelo;
import java.util.ArrayList;

public class GerenciadorAeronaves {
    private ArrayList<Aeronave> aeronaves;
	
    public GerenciadorAeronaves(){
        aeronaves = new ArrayList<>();
    }

    public void adicionar(Aeronave aviao) {
            aeronaves.add(aviao);
    }
    
        public Aeronave buscarPorCodigoAeronav(String cod){
            for(int i=0;i<aeronaves.size();i++){
                Aeronave a = aeronaves.get(i);
                if(a.getCodigo().equals(cod)){
                    return a;
                }
            }
            return null;
        
    }
    public ArrayList<Aeronave> listarTodas() {
        
        return aeronaves;
 

    }
}
