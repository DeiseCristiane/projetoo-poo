package sistema_de_agencia;

import sistema_de_agencia.Excecao.LimiteMaximoDeEmprestimoExtrapoladoException;
import sistema_de_agencia.Excecao.SaldoInsuficienteException;

public interface IConta {
	
	public void ativarConta();
	public void desativarConta();
	public void realizarEmprestimo() throws LimiteMaximoDeEmprestimoExtrapoladoException;
	public void fazerTransacao() throws SaldoInsuficienteException;
	public boolean getStatus();
	
	public float getQuantia();

}
