package model;

public class Camiseta extends Produto{
	private TipoTamanhoCamisa tamanho;
	private String cor;
	private String marca;
	
	public TipoTamanhoCamisa getTamanho() {
		return tamanho;
	}
	public void setTamanho(TipoTamanhoCamisa tamanho) {
		this.tamanho = tamanho;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	@Override
	public String toString() {
		return "Camiseta [tamanho=" + tamanho + ", cor=" + cor + ", marca=" + marca + ", valor=" + getValor() + "]";
	}
	
	
}
