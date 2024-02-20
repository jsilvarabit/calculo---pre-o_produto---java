package entidade;

public class ProdutoImportado extends Produto {
	
	private Double taxa;
	
	public ProdutoImportado() {
		
		super();
	}

	public ProdutoImportado(String nome, Double preco, Double taxa) {
		super(nome, preco);
		this.taxa = taxa;
	}

	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}
	
	@Override
	public double precototal() {
		return preco += taxa;
	}
	
	
}
