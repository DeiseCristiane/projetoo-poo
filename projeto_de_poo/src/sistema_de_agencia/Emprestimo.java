package sistema_de_agencia;

public class Emprestimo {
	
	private int idCliente;
	private int idEmprestimo;
	private int quantiaParcela;
	private int valorEmprestimo;
	
	
	
	
	
	

	public Emprestimo() {
		super();
		this.idCliente = idCliente;
		this.idEmprestimo = idEmprestimo;
		this.quantiaParcela = quantiaParcela;
		this.valorEmprestimo = valorEmprestimo;
	}
	@Override
	public String toString() {
		return "Emprestimo [idCliente=" + idCliente + ", idEmprestimo=" + idEmprestimo + ", quantiaParcela="
				+ quantiaParcela + ", valorEmprestimo=" + valorEmprestimo + "]";
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public int getIdEmprestimo() {
		return idEmprestimo;
	}
	public void setIdEmprestimo(int idEmprestimo) {
		this.idEmprestimo = idEmprestimo;
	}
	public int getQuantiaParcela() {
		return quantiaParcela;
	}
	public void setQuantiaParcela(int quantiaParcela) {
		this.quantiaParcela = quantiaParcela;
	}
	public int getValorEmprestimo() {
		return valorEmprestimo;
	}
	public void setValorEmprestimo(int valorEmprestimo) {
		this.valorEmprestimo = valorEmprestimo;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}