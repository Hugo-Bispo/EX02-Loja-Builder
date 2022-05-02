package model;

public class Jogo extends Produto{
	
	private String nome;
	private TipoVideoGame videogame;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public TipoVideoGame getVideogame() {
		return videogame;
	}
	public void setVideogame(TipoVideoGame videogame) {
		this.videogame = videogame;
	}
	
	@Override
	public String toString() {
		return "Jogo [nome=" + nome + ", videogame=" + videogame + ", valor=" + getValor() + "]";
	}
	
	
}
