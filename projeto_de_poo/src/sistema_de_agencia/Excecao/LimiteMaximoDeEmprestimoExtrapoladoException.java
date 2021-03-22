package sistema_de_agencia.Excecao;

public class LimiteMaximoDeEmprestimoExtrapoladoException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LimiteMaximoDeEmprestimoExtrapoladoException(String msg) {
		super(msg);
	}

}