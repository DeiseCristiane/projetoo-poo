package sistema_de_agencia;

import java.sql.Date;

import sistema_de_agencia.Excecao.LimiteMaximoDeEmprestimoExtrapoladoException;
import sistema_de_agencia.Excecao.SaldoInsuficienteException;


public class Conta extends Emprestimo implements IConta{
	private int idCliente;
	private int numeroConta;
	private String tipoConta;
	private float saldo;
	private Date dataDeInicio;
	private boolean status;
	
	
	

	public Conta(int idCliente, int numeroConta, String tipoConta, Date dataDeInicio) {
		super();
		this.idCliente = idCliente;
		this.numeroConta = numeroConta;
		this.tipoConta = tipoConta;
		this.saldo = 0;
		this.dataDeInicio = dataDeInicio;
		this.status = true;
	}
	@Override
	public void ativarConta() {
		this.status = true;
		System.out.println("Conta ativada");
		
		
	}
	@Override
	public void desativarConta() {
		this.status = false;
		System.out.println("Conta desativada");
		
		
	}
	@Override
	public void realizarEmprestimo() throws LimiteMaximoDeEmprestimoExtrapoladoException{
		if(this.getValorEmprestimo() >= 5000 && this.getSaldo() >= 50) {
			
			this.saldo = saldo+getValorEmprestimo();
		}
		else
			throw new LimiteMaximoDeEmprestimoExtrapoladoException("Seu saldo não permite realização do empréstimo ou a Quantia pedida extrapolou o limite");
		
	}
	@Override
	public void fazerTransacao() throws SaldoInsuficienteException{
		if(this.saldo >= getQuantia()) 
		{
			this.saldo = saldo - getQuantia();
		}
		else
			throw new SaldoInsuficienteException("Você não possui saldo para realizar Transação");
	
		
	}
	
	@Override
	public boolean getStatus() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public float getQuantia() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
	
	
	//Métodos de Acesso//	
	
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public String getTipoConta() {
		return tipoConta;
	}
	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public Date getDataDeInicio() {
		return dataDeInicio;
	}
	public void setDataDeInicio(Date dataDeInicio) {
		this.dataDeInicio = dataDeInicio;
	}
	
	

	
	
	
	
	
	
	
	
}
