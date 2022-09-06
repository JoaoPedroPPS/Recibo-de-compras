package recibo;

public class ItemVenda {
	 int qtdVenda;
	 Produto produto;

	public ItemVenda(String nome, double preco, int qtdVenda) {
	    produto = new Produto(nome, preco);
	    this.qtdVenda = qtdVenda;
	}

	public int getQtdVenda() {
	    return qtdVenda;
	}

	public void setQtdVenda(int qtdVenda) {
	    this.qtdVenda = qtdVenda;
	}

	public double subTotal() {
	    return this.produto.getPreco() * this.qtdVenda;
	}

	@Override
	public String toString() {
	    return "Nome:" + this.produto.getNome() + " | Preço: " + this.produto.getPreco() + " | Quantidade: " + this.getQtdVenda() + "\n";
	    }

	}