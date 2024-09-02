package model;

public class EntradaEntity {
	private int entCodTransacao;
	private int entCodProduto;
	private int entQtd;
	private int entValorTotal;
	
	public int getEntCodTransacao() {
		return entCodTransacao;
	}
	public void setEntCodTransacao(int entCodTransacao) {
		this.entCodTransacao = entCodTransacao;
	}
	
	public int getEntCodProduto() {
		return entCodProduto;
	}
	public void setEntCodProduto(int entCodProduto) {
		this.entCodProduto = entCodProduto;
	}
	
	public int getEntQtd() {
		return entQtd;
	}
	public void setEntQtd(int entQtd) {
		this.entQtd = entQtd;
	}
	
	public int getEntValorTotal() {
		return entValorTotal;
	}
	public void setEntValorTotal(int entValorTotal) {
		this.entValorTotal = entValorTotal;
	}
}
