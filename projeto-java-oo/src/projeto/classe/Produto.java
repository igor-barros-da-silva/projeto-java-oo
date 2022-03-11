package projeto.classe;

import java.math.BigDecimal;

public class Produto {

	private Long id;
	private String nome;
	private BigDecimal valorTotal;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", valorTotal=" + valorTotal + "]";
	}
}
