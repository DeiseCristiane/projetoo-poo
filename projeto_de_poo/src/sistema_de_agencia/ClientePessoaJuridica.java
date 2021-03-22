package sistema_de_agencia;

import java.util.ArrayList;
import java.util.List;


public class ClientePessoaJuridica implements ICliente{
	
	private int idCliente;
	private String razaoSocial;
	private String nomeFantasia;
	private String cnpj;
	private String nome;
	private String rua;
	private String numeroDaCasa;
	private String cep;
	private String dataDeNascimento;
	
	private List<IConta> contas = new ArrayList<IConta>();
	
	
	

	public ClientePessoaJuridica(String razaoSocial, String nomeFantasia, String cnpj, String nome,
			String rua, String numeroDaCasa, String cep, String dataDeNascimento) {
		super();
		this.idCliente = idCliente;
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
		this.cnpj = cnpj;
		this.nome = nome;
		this.rua = rua;
		this.numeroDaCasa = numeroDaCasa;
		this.cep = cep;
		this.dataDeNascimento = dataDeNascimento;
		this.contas = contas;
	}
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((cnpj == null) ? 0 : cnpj.hashCode());
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
			ClientePessoaJuridica other = (ClientePessoaJuridica) obj;
			if (cnpj == null) {
				if (other.cnpj != null)
					return false;
			} else if (!cnpj.equals(other.cnpj))
				return false;
			return true;
		}


	




	
	
	

	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public void setNome(String novoNome) {
		// TODO Auto-generated method stub
		
	}
	

	
	
	
	
	
	
	
}