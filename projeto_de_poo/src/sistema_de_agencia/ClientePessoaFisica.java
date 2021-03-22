package sistema_de_agencia;

import java.util.ArrayList;
import java.util.List;

public class ClientePessoaFisica  implements ICliente{
	private int idCliente;
	private String cpf;
	private String nome;
	private String rua;
	private String numeroDaCasa;
	private String cep;
	private String dataDeNascimento;
	private String email;
	
	private List<IConta> contas = new ArrayList<IConta>();
	
	
	
	public ClientePessoaFisica(String cpf, String nome, String rua, String numeroDaCasa, String cep,
			String dataDeNascimento,String email) {
		super();
		this.idCliente = idCliente;
		this.cpf = cpf;
		this.nome = nome;
		this.rua = rua;
		this.numeroDaCasa = numeroDaCasa;
		this.cep = cep;
		this.dataDeNascimento = dataDeNascimento;
		this.contas = contas;
		this.email = email;
	}

	
	public ClientePessoaFisica(String cpf)
	{
		this.cpf = cpf;
	}
	
	



	@Override
	public String toString() {
		return "ClientePessoaFisica [idCliente=" + idCliente + ", cpf=" + cpf + ", nome=" + nome + ", rua=" + rua
				+ ", numeroDaCasa=" + numeroDaCasa + ", cep=" + cep + ", dataDeNascimento=" + dataDeNascimento
				+ ", contas=" + contas + "]";
	}
	
	
	
	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClientePessoaFisica other = (ClientePessoaFisica) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		return true;
	}


	@Override
	public void setNome(String novoNome) {
		// TODO Auto-generated method stub
		
	}
	

	
	
	
	
	


	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
	
	
	
	
}
