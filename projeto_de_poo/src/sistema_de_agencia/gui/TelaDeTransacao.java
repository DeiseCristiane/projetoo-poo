package sistema_de_agencia.gui;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.UIManager;

import sistema_de_agencia.Transacao;

public class TelaDeTransacao extends JDialog {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtNumeroConta;
	private JTextField txtNumeroDeTransacao;
	private JTextField txtQuantia;
	private JTextField txtDataDeTransacao;
	private JTextField txtNomeDeTransacao;
	private JLabel lblNumeroContaDestino;
	private JLabel lblNumeroDeTransacao;
	private JLabel lblQuantia;
	private JLabel lblDataDeTransacao;
	private JLabel lblNomeDeTransacao;
	private JButton btnFechar;
	private JButton btnConcluirTransacao;

	public TelaDeTransacao(){
		setSize(680,580);
		setResizable(false);
		setTitle("Transação Bancária");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
		getContentPane().setLayout(null);
		
		lblNumeroContaDestino = new JLabel("Numero de conta destino :");
		lblNumeroContaDestino.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
		lblNumeroContaDestino.setBounds(10, 44, 164, 14);
		getContentPane().add(lblNumeroContaDestino);
		
		lblNumeroDeTransacao = new JLabel("N\u00FAmero De Transa\u00E7\u00E3o:");
		lblNumeroDeTransacao.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
		lblNumeroDeTransacao.setBounds(10, 84, 146, 14);
		getContentPane().add(lblNumeroDeTransacao);
		
		lblQuantia = new JLabel("Quantia:");
		lblQuantia.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
		lblQuantia.setBounds(10, 123, 53, 14);
		getContentPane().add(lblQuantia);
		
		lblDataDeTransacao = new JLabel("Data de Transa\u00E7\u00E3o:");
		lblDataDeTransacao.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
		lblDataDeTransacao.setBounds(10, 162, 125, 14);
		getContentPane().add(lblDataDeTransacao);
		
		lblNomeDeTransacao = new JLabel("Nome de Transa\u00E7\u00E3o:");
		lblNomeDeTransacao.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
		lblNomeDeTransacao.setBounds(10, 200, 125, 14);
		getContentPane().add(lblNomeDeTransacao);
		
		txtNumeroConta = new JTextField();
		txtNumeroConta.setBounds(184, 42, 208, 20);
		getContentPane().add(txtNumeroConta);
		txtNumeroConta.setColumns(10);
		
		txtNumeroDeTransacao = new JTextField();
		txtNumeroDeTransacao.setBounds(166, 82, 190, 20);
		getContentPane().add(txtNumeroDeTransacao);
		txtNumeroDeTransacao.setColumns(10);
		
		txtQuantia = new JTextField();
		txtQuantia.setBounds(70, 121, 86, 20);
		getContentPane().add(txtQuantia);
		txtQuantia.setColumns(10);
		
		txtDataDeTransacao = new JTextField();
		txtDataDeTransacao.setBounds(134, 160, 101, 20);
		getContentPane().add(txtDataDeTransacao);
		txtDataDeTransacao.setColumns(10);
		
		txtNomeDeTransacao = new JTextField();
		txtNomeDeTransacao.setBounds(145, 198, 257, 20);
		getContentPane().add(txtNomeDeTransacao);
		txtNomeDeTransacao.setColumns(10);
		
		
		JPanel panel = new JPanel();
		panel.setBorder(UIManager.getBorder("DesktopIcon.border"));
		panel.setBounds(10, 415, 654, 125);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		btnConcluirTransacao = new JButton("Concluir Transação");
		btnConcluirTransacao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Transacao tr = new Transacao(txtNumeroConta.getText(), txtNumeroDeTransacao.getText(), txtQuantia.getText(), txtDataDeTransacao.getName(), txtNomeDeTransacao.getText());
				
			
				
				try 
				{
					JOptionPane.showMessageDialog(null, "Transação realizada com sucesso!");
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
		btnConcluirTransacao.setBounds(163, 11, 116, 36);
		btnConcluirTransacao.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
		panel.add(btnConcluirTransacao);
		
		btnFechar = new JButton("Fechar");
		btnFechar.setBounds(313, 11, 116, 36);
		btnFechar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				int a = JOptionPane.showConfirmDialog(null, "Deseja Fechar a Janela?");
				if( a == 0)
					dispose();
				else 
				{
					
				}
			}
		});
		btnFechar.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
		panel.add(btnFechar);
		setResizable(false);
		setVisible(true);
	}
}
