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
                if(a.getDatahora().toLocalDate().equals(data)){
                    return a;
                }//ver oq tem q retornar direitinho
            }
            return null;
        
    }
    public ArrayList<Voo> listarTodas() {
        
        ArrayList<Voo> listaaux = new ArrayList<>();
            for (Voo vo : voos) {
                listaaux.add(vo);
            }
            return listaaux;
 

    }
}





