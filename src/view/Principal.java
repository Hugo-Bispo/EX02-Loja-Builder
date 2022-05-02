package view;

import java.util.ArrayList;

import model.Produto;
import model.ProdutoBuilder;
import model.TipoCalcado;
import model.TipoStorage;
import model.TipoTamanhoCamisa;
import model.TipoVideoGame;



public class Principal {

	public static void main(String[] args) {
		ArrayList<Produto> produtos = new ArrayList<Produto>();
			
		Produto calcado1 = ProdutoBuilder.builder()
			.addCalcado(40,"Rosa",TipoCalcado.TENIS, 85.50)
			.get_calcado();	
		
		Produto calcado2 = ProdutoBuilder.builder()
				.addCalcado(45,"Preto",TipoCalcado.SOCIAL, 100.00)
				.get_calcado();	
		
		Produto calcado3 = ProdutoBuilder.builder()
				.addCalcado(44,"Marrom",TipoCalcado.SOCIAL, 250.00)
				.get_calcado();	
		
		produtos.add(calcado1);
		produtos.add(calcado2);
		produtos.add(calcado3);
		
		Produto camiseta1 = ProdutoBuilder.builder()
				.addCamiseta(TipoTamanhoCamisa.G,"Preta", "Nike", 80.0)
				.get_camiseta();
		
		Produto camiseta2 = ProdutoBuilder.builder()
				.addCamiseta(TipoTamanhoCamisa.M,"Braca", "Adidas", 70.0)
				.get_camiseta();
		
		Produto camiseta3 = ProdutoBuilder.builder()
				.addCamiseta(TipoTamanhoCamisa.GG,"Roxa", "Nike", 120.0)
				.get_camiseta();
		
		produtos.add(camiseta1);
		produtos.add(camiseta2);
		produtos.add(camiseta3);

		Produto jogo1 = ProdutoBuilder.builder()
				.addJogo("Dauntless", TipoVideoGame.Xbox, 29.99)
				.get_jogo();
		
		Produto jogo2 = ProdutoBuilder.builder()
				.addJogo("Minecraft", TipoVideoGame.Xbox, 99.99)
				.get_jogo();
		
		Produto jogo3 = ProdutoBuilder.builder()
				.addJogo("God of War", TipoVideoGame.Playstation, 199.99)
				.get_jogo();
		
		produtos.add(jogo1);
		produtos.add(jogo2);
		produtos.add(jogo3);
		
		Produto storage1 = ProdutoBuilder.builder()
				.addStorage(TipoStorage.SSD, 512, "Kingston", 329.99)
				.get_storage();
		
		Produto storage2 = ProdutoBuilder.builder()
				.addStorage(TipoStorage.HDD, 1024, "Seagate", 319.99)
				.get_storage();
		
		Produto storage3 = ProdutoBuilder.builder()
				.addStorage(TipoStorage.MS_NVMe, 1024, "Western Digital", 1099.99)
				.get_storage();

		produtos.add(storage1);
		produtos.add(storage2);
		produtos.add(storage3);

		for (Produto produto : produtos) {
			System.out.println(produto);
		}
	}

}
