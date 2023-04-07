package pucrs.myflight.modelo;
import java.util.ArrayList;

public class GerenciadorRotas {
    private ArrayList<Rota> rotas;
	
    public GerenciadorRotas(){
        rotas = new ArrayList<>();
    }

    public void adicionar(Rota rot) {
            rotas.add(rot);
    }
    
        public Rota buscarPorOrigemRota(Aeroporto orig){
            for(int i=0;i<rotas.size();i++){
                Rota a = rotas.get(i);
                if(a.getOrigem().equals(orig)){
                    return a;
                }//ver oq tem q retornar direitinho
            }
            return null;
        
    }
    public ArrayList<Rota> listarTodas() {
        
        return rotas;
 

    }
}
