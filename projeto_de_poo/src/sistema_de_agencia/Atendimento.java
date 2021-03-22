package sistema_de_agencia;

public class Atendimento{
	
	private String idCliente;
	private String idBanco;
	private String dataDeAtendimento;
	private String atendente;
	private String hora;
	
	public Atendimento(String idCliente, String idBanco, String dataDeAtendimento, String atendente, String hora) {
		super();
		this.idCliente = idCliente;
		this.idBanco = idBanco;
		this.dataDeAtendimento = dataDeAtendimento;
		this.atendente = atendente;
		this.hora = hora;
	}

	@Override
	public String toString() {
		return "Atendimento [idCliente=" + idCliente + ", idBanco=" + idBanco + ", dataDeAtendimento=" + dataDeAtendimento
				+ ", atendente=" + atendente + ", hora=" + hora + "]";
	}
	
	
	
	
	
	
	

}
