package pucrs.myflight.modelo;

public class Aeronave implements Imprimivel,Contavel{
	private String codigo;
	private String descricao;
	private static int totalAeronaves= 0;

	
	public Aeronave(String codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
		totalAeronaves++;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void imprimir() {
		System.out.println(codigo + " - " + descricao);
	 }
	 public int qtdObj(){
		return totalAeronaves;
	 }

	@Override
	public String toString(){
		return "\n\tAeronave - codigo= " + codigo + ", descricao= " + descricao + "\n";
	}
	
}
