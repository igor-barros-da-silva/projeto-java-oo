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
		
		// Gerando pelo toString() da classe Venda.
		System.out.println("Descri��o da venda: " + venda);
	}
		
}


