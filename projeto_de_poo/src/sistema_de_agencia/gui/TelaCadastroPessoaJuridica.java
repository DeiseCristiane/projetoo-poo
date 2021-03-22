package sistema_de_agencia.gui;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;



import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.UIManager;

import sistema_de_agencia.ClientePessoaJuridica;

public class TelaCadastroPessoaJuridica extends JDialog{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtFNome;
	private JTextField txtFEndereco;
	private JTextField txtFCnpj;
	private JTextField txtFDataDeNascimento;
	private JTextField txtFNumero;
	private JTextField txtCep;
	private JTextField txtFNomeFantasia;
	private JTextField txtFRazaoSocial;
	private JLabel lblNome;
	private JLabel lblNomeFantasia;
	private JLabel lblCnpj;
	private JLabel lblDataDeNascimento;
	private JButton btnSalvar;
	private JButton btnFechar;
	private JLabel lblRazaoSocial;
	
	
	public TelaCadastroPessoaJuridica() {
		
		setTitle("Cadastrar Pessoa Juridica");
		setSize(680,580);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
		lblNome.setBounds(22, 48, 46, 14);
		getContentPane().add(lblNome);
		
		txtFNome = new JTextField();
		txtFNome.setBounds(78, 46, 327, 20);
		getContentPane().add(txtFNome);
		txtFNome.setColumns(10);
		
		lblNomeFantasia = new JLabel("Nome Fantasia:");
		lblNomeFantasia.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
		lblNomeFantasia.setBounds(22, 285, 102, 14);
		getContentPane().add(lblNomeFantasia);
		
		txtFEndereco = new JTextField();
		txtFEndereco.setBounds(90, 151, 283, 20);
		getContentPane().add(txtFEndereco);
		txtFEndereco.setColumns(10);
		
		lblCnpj = new JLabel("CNPJ:");
		lblCnpj.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
		lblCnpj.setBounds(359, 101, 46, 14);
		getContentPane().add(lblCnpj);
		
		txtFCnpj = new JTextField();
		txtFCnpj.setBounds(415, 99, 131, 20);
		getContentPane().add(txtFCnpj);
		txtFCnpj.setColumns(10);
		
		lblDataDeNascimento = new JLabel("Data de Nascimento:");
		lblDataDeNascimento.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
		lblDataDeNascimento.setBounds(22, 105, 137, 14);
		getContentPane().add(lblDataDeNascimento);
		
		txtFDataDeNascimento = new JTextField();
		txtFDataDeNascimento.setBounds(154, 99, 165, 20);
		getContentPane().add(txtFDataDeNascimento);
		txtFDataDeNascimento.setColumns(10);
		
		JLabel lblEndereco = new JLabel("Endere\u00E7o:");
		lblEndereco.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
		lblEndereco.setBounds(22, 153, 69, 14);
		getContentPane().add(lblEndereco);
		
		JLabel lblNumeroDaCasa = new JLabel("N\u00BA:");
		lblNumeroDaCasa.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
		lblNumeroDaCasa.setBounds(406, 153, 36, 14);
		getContentPane().add(lblNumeroDaCasa);
		
		txtFNumero = new JTextField();
		txtFNumero.setBounds(438, 151, 86, 20);
		getContentPane().add(txtFNumero);
		txtFNumero.setColumns(10);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
		lblCep.setBounds(22, 220, 46, 14);
		getContentPane().add(lblCep);
		
		txtCep = new JTextField();
		txtCep.setBounds(63, 218, 112, 20);
		getContentPane().add(txtCep);
		txtCep.setColumns(10);
		
		txtFNomeFantasia = new JTextField();
		txtFNomeFantasia.setBounds(122, 283, 158, 20);
		getContentPane().add(txtFNomeFantasia);
		txtFNomeFantasia.setColumns(10);
		
		lblRazaoSocial = new JLabel("Raz\u00E3o Social:");
		lblRazaoSocial.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
		lblRazaoSocial.setBounds(318, 285, 102, 14);
		getContentPane().add(lblRazaoSocial);
		
		txtFRazaoSocial = new JTextField();
		txtFRazaoSocial.setBounds(415, 283, 119, 20);
		getContentPane().add(txtFRazaoSocial);
		txtFRazaoSocial.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBorder(UIManager.getBorder("DesktopIcon.border"));
		panel.setBounds(10, 415, 654, 125);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				ClientePessoaJuridica cp = new ClientePessoaJuridica(txtCep.getText(), txtFCnpj.getText(), txtFDataDeNascimento.getText(), txtFEndereco.getText(), 
						txtFNome.getText(), txtFNumero.getText(), txtFNomeFantasia.getText(), txtFRazaoSocial.getText());
				try 
				{
					JOptionPane.showMessageDialog(null, "Cliente cadastrado comsucesso!");
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
		btnSalvar.setBounds(163, 11, 116, 36);
		btnSalvar.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
		panel.add(btnSalvar);
		
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
