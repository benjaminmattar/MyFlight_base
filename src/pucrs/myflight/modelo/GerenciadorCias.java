package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorCias {
	private ArrayList<CiaAerea> empresas;
	
	public GerenciadorCias() {
		empresas = new ArrayList<>();
	}
	public void adicionar(CiaAerea cia) {
		empresas.add(cia);
	}
	public CiaAerea buscarCodigo(String cod){
		for(int i=0;i<empresas.size();i++){
			CiaAerea a = empresas.get(i);
			if(a.getCodigo().equals(cod)){
				return a;
			}
		}
		return null;
	}
	public CiaAerea buscarNome(String cod){
		for(int i=0;i<empresas.size();i++){
			CiaAerea a = empresas.get(i);
			if(a.getNome().equals(cod)){
				return a;
			}
		}
		return null;
	}
	public ArrayList<CiaAerea> listarTodas() {
        
        return empresas;
 

    }

}
