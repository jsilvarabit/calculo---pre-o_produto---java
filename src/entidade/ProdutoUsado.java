package entidade;

import java.util.Date;

public class ProdutoUsado extends Produto {
	
	private Date fabricacao;
	
	public ProdutoUsado() {
		super();
	}

	public ProdutoUsado(String nome, Double preco, Date fabricacao) {
		super(nome, preco);
		this.fabricacao = fabricacao;
	}

	public Date getFabricacao() {
		return fabricacao;
	}

	public void setFabricacao(Date fabricacao) {
		this.fabricacao = fabricacao;
	}
	
	@Override
	public double precototal() {
		return preco;
	}
}
