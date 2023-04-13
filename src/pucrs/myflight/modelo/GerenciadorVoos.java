package pucrs.myflight.modelo;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class GerenciadorVoos {
    private ArrayList<Voo> voos;
	
    public GerenciadorVoos(){
        voos = new ArrayList<>();
    }

    public void adicionar(Voo voo) {
            voos.add(voo);
    }
    
        public Voo buscarData(LocalDate data){
            for(int i=0;i<voos.size();i++){
                Voo a = voos.get(i);
                if(a.getDatahora().equals(data)){
                    return a;
                }//ver oq tem q retornar direitinho
            }
            return null;
        
    }
    public ArrayList<Voo> listarTodas() {
        
        return voos;
 

    }
}





