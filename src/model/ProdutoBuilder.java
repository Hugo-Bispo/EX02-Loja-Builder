package model;

public class ProdutoBuilder {
	private Calcado calcado;
	private Camiseta camiseta;
	private Jogo jogo;
	private Storage storage;
	
	public ProdutoBuilder() {
		this.calcado = new Calcado();
		this.camiseta = new Camiseta();
		this.jogo = new Jogo();
		this.storage = new Storage();
	}
	
	public static ProdutoBuilder builder() {
		return new ProdutoBuilder();
	}
	
	public ProdutoBuilder addCalcado(int tamanho, String cor, TipoCalcado tipo, double valor) {
		this.calcado.setTamanho(tamanho);
		this.calcado.setCor(cor);
		this.calcado.setTipo(tipo);
		this.calcado.setValor(valor);
		return this;
	}
	
	public ProdutoBuilder addCamiseta(TipoTamanhoCamisa tamanho, String cor, String marca, double valor) {
		this.camiseta.setTamanho(tamanho);
		this.camiseta.setCor(cor);
		this.camiseta.setMarca(marca);
		this.camiseta.setValor(valor);
		return this;
	}
	
	public ProdutoBuilder addJogo(String nome, TipoVideoGame videogame, double valor) {
		this.jogo.setNome(nome);
		this.jogo.setVideogame(videogame);
		this.jogo.setValor(valor);
		return this;
	}
	
	public ProdutoBuilder addStorage(TipoStorage tipo, int capacidade, String fabricante, double valor) {
		this.storage.setTipo(tipo);
		this.storage.setCapacidade(capacidade);
		this.storage.setFabricante(fabricante);
		this.storage.setValor(valor);
		return this;
	}
	
	public Produto get_calcado() {
		return calcado;
	}
	
	public Produto get_camiseta() {
		return camiseta;
	}
	
	public Produto get_jogo() {
		return jogo;
	}
	
	public Produto get_storage() {
		return storage;
	}
	
}
