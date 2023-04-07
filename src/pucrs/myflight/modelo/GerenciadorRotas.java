package pucrs.myflight.modelo;
import java.util.ArrayList;

public class GerenciadorRotas {
    private ArrayList<Rota> rotas;
	
    public GerenciadorRotas(){
        rotas = new ArrayList<>();
    }

    public void cadastrarAeronave(Rota rot) {
            rotas.add(rot);
    }
    
        public Rota buscarPorOrigemRota(String cod){
            for(int i=0;i<rotas.size();i++){
                Rota a = rotas.get(i);
                if(a.getOrigem().equals(cod)){
                    return a;
                }
            }
            return null;
        
    }
    public ArrayList<Rota> listarTodas() {
        
        return rotas;
 

    }
}
