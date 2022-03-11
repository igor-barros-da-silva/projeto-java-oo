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
		produto1.setValor(BigDecimal.valueOf(100)); // Passando direto o valor do produto.
		
		Produto produto2 = new Produto();		
		produto2.setId(2L);
		produto2.setNome("SITE");
		produto2.setValor(BigDecimal.valueOf(150));
		
		Produto produto3 = new Produto();		
		produto3.setId(3L);
		produto3.setNome("SISTEMA ERP");
		produto3.setValor(BigDecimal.valueOf(200));
		
		Produto produto4 = new Produto();		
		produto4.setId(4L);
		produto4.setNome("SISTEMA EAD");
		produto4.setValor(BigDecimal.valueOf(700));

		
		Venda venda = new Venda();
		venda.setDescricaoVenda("Software");
		venda.setEnderecoEntrega("Rua da Azeda, 85 ");
		venda.setId(1L);		
		venda.setNomeCliente("Igor");
		//venda.setValorTotal(BigDecimal.valueOf(95)); // Passando direto o valor Total da Venda.

		venda.getListaProdutos().add(produto1);
		venda.getListaProdutos().add(produto2); // Método próprio do Java - não é possível fazer validações.
		venda.addProduto(produto3); // É possível fazer validações.	
		venda.getListaProdutos().add(produto4);		
		
		System.out.println("Total da venda: " + venda.getValorTotal());
	}

}
