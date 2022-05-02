package model;

public class Storage extends Produto {
	private TipoStorage tipo;
	private int capacidade;
	private String fabricante;
	
	public TipoStorage getTipo() {
		return tipo;
	}
	public void setTipo(TipoStorage tipo) {
		this.tipo = tipo;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	@Override
	public String toString() {
		return "Storage [tipo=" + tipo + ", capacidade=" + capacidade + ", fabricante=" + fabricante + ", valor="
				+ getValor() + "]";
	}
	
	
}
