package projeto.principal;

import java.math.BigDecimal;

import projeto.classe.Venda;

public class ExecutarTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Venda venda = new Venda();
		venda.setDescricaoVenda("Software");
		venda.setEnderecoEntrega("Rua da Azeda, 85 ");
		venda.setId(10L);

		venda.setNomeCliente("Igor ");
		venda.setValorTotal(BigDecimal.valueOf(666));
		
		System.out.println("Descrição da venda: " + venda.getDescricaoVenda());
	}
}
