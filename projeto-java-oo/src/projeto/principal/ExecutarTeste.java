package projeto.principal;

import java.math.BigDecimal;

import projeto.classe.Produto;
import projeto.classe.Venda;

public class ExecutarTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Produto produto = new Produto();
		produto.setId(10L);
		produto.setNome("ERP");
		produto.setValorTotal(BigDecimal.valueOf(100));

		Venda venda = new Venda();
		venda.setDescricaoVenda("Software");
		venda.setEnderecoEntrega("Rua da Azeda, 85 ");
		venda.setId(10L);

		venda.getListaProdutos().add(produto);

		venda.setNomeCliente("Igor ");
		venda.setValorTotal(BigDecimal.valueOf(666));

		// Gerando pelo toString() da classe Venda.
		System.out.println("Descrição da venda: " + venda);
	}

}
