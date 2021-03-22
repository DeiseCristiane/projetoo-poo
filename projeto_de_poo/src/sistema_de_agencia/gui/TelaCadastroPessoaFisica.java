package sistema_de_agencia.gui;

import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.UIManager;
import javax.swing.text.MaskFormatter;



import sistema_de_agencia.ClientePessoaFisica;
import javax.swing.JLabel;





public class TelaCadastroPessoaFisica extends JDialog{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtFNomeDoCliente;
	private JFormattedTextField txtFCPF;
	private JTextField txtFDataDeNascimento;
	private JTextField txtFEndereco;
	private JTextField txtFNumero;
	private JTextField txtFCEP;
	private JTextField txtFEmail;
	private JButton btnFechar;
	private JButton btnSalvar;
	private JLabel lblNomeDoCliente;
	private JLabel lblCpf;
	private JLabel lblDataDeNascimento;
	private JLabel lblEmail;
	private JLabel lblEndereco;
	private JLabel lblNumeroDaCasa;
	private JLabel lblCep;
	
	
	public TelaCadastroPessoaFisica () {
		
		setSize(680,580);
		setResizable(false);
		setTitle("Cadastrar Pessoa Fisica");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
		getContentPane().setLayout(null);
		setVisible(true);
		
		txtFNomeDoCliente = new JTextField();
		txtFNomeDoCliente.setBounds(163, 80, 400, 20);
		getContentPane().add(txtFNomeDoCliente);
		txtFNomeDoCliente.setColumns(10);
		
		txtFCPF = new JFormattedTextField();
		txtFCPF.setBounds(87, 128, 165, 20);
		getContentPane().add(txtFCPF);
		txtFCPF.setColumns(10);
		
		try 
		{
			MaskFormatter mf = new MaskFormatter("###.###.###-##");
			mf.install(txtFCPF);
		} 
		catch (ParseException e) 
		{
			e.printStackTrace();
		}
		
		
		txtFDataDeNascimento = new JTextField();
		txtFDataDeNascimento.setBounds(188, 174, 154, 20);
		getContentPane().add(txtFDataDeNascimento);
		txtFDataDeNascimento.setColumns(10);
		
		txtFEndereco = new JTextField();
		txtFEndereco.setBounds(105, 225, 282, 20);
		getContentPane().add(txtFEndereco);
		txtFEndereco.setColumns(10);
		
		txtFNumero = new JTextField();
		txtFNumero.setBounds(460, 276, 86, 20);
		getContentPane().add(txtFNumero);
		txtFNumero.setColumns(10);
		
		txtFCEP = new JTextField();
		txtFCEP.setBounds(87, 332, 105, 20);
		getContentPane().add(txtFCEP);
		txtFCEP.setColumns(10);
		
		txtFEmail = new JTextField();
		txtFEmail.setBounds(118, 276, 289, 20);
		getContentPane().add(txtFEmail);
		txtFEmail.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBorder(UIManager.getBorder("CheckBox.border"));
		panel.setBounds(10, 383, 654, 157);
		getContentPane().add(panel);
		panel.setLayout(null);
		
	
		
		
		btnFechar = new JButton("Fechar");
		btnFechar.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
		btnFechar.setBounds(329, 35, 125, 43);
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
		panel.add(btnFechar);
		
		btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				ClientePessoaFisica clientepf = new ClientePessoaFisica(txtFCPF.getText(), txtFNomeDoCliente.getText(), txtFDataDeNascimento.getText(), txtFCEP.getText(), 
						 txtFEmail.getText(), txtFEndereco.getText(), txtFNumero.getText());
				try 
				{
					JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
				} 
				catch (Exception e1) 
				{
					e1.printStackTrace();
				}
			}
		});
		
		btnSalvar.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
		btnSalvar.setBounds(181, 35, 125, 43);
		panel.add(btnSalvar);
		
		lblNomeDoCliente = new JLabel("Nome do Cliente:");
		lblNomeDoCliente.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
		lblNomeDoCliente.setBounds(49, 82, 105, 14);
		getContentPane().add(lblNomeDoCliente);
		
		lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
		lblCpf.setBounds(49, 130, 46, 14);
		getContentPane().add(lblCpf);
		
		lblDataDeNascimento = new JLabel("Data de Nascimento:");
		lblDataDeNascimento.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
		lblDataDeNascimento.setBounds(49, 176, 169, 14);
		getContentPane().add(lblDataDeNascimento);
		
		lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
		lblEmail.setBounds(49, 227, 46, 14);
		getContentPane().add(lblEmail);
		
		lblEndereco = new JLabel("Endere\u00E7o:");
		lblEndereco.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
		lblEndereco.setBounds(49, 278, 77, 14);
		getContentPane().add(lblEndereco);
		
		lblNumeroDaCasa = new JLabel("N\u00BA:");
		lblNumeroDaCasa.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
		lblNumeroDaCasa.setBounds(427, 278, 46, 14);
		getContentPane().add(lblNumeroDaCasa);
		
		lblCep = new JLabel("CEP:");
		lblCep.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
		lblCep.setBounds(49, 334, 46, 14);
		getContentPane().add(lblCep);
	}


	
}
