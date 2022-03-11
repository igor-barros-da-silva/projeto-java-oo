package projeto.principal;

import java.math.BigDecimal;

import projeto.classe.Produto;
import projeto.classe.Venda;

public class ExecutarTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Produto produto1 = new Produto();		
		produto1.setId(1L);
		produto1.setNome("SISTEMA DE CONTROLE DE ESTOQUE");
		produto1.setValorTotal(BigDecimal.valueOf(100));
		
		Produto produto2 = new Produto();		
		produto2.setId(2L);
		produto2.setNome("SITE");
		produto2.setValorTotal(BigDecimal.valueOf(150));
		
		Produto produto3 = new Produto();		
		produto3.setId(3L);
		produto3.setNome("SISTEMA ERP");
		produto3.setValorTotal(BigDecimal.valueOf(200));

		Venda venda = new Venda();
		venda.setDescricaoVenda("Software");
		venda.setEnderecoEntrega("Rua da Azeda, 85 ");
		venda.setId(1L);		
		venda.setNomeCliente("Igor");
		venda.setValorTotal(BigDecimal.valueOf(95)); 

		venda.getListaProdutos().add(produto1);
		venda.getListaProdutos().add(produto2); // Método próprio do Java - não é possível fazer validações.
		venda.addProduto(produto3); // É possível fazer validações.		
		
		// Imprimindo na console a listaProdutos.
		for (Produto produto : venda.getListaProdutos()) {
			System.out.println("Descrição do produto: " + produto);
		}

		// Gerando pelo toString() da classe Venda.
		System.out.println("Descrição da venda: " + venda);
	}

}
