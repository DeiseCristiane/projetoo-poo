package sistema_de_agencia.gui;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.UIManager;

import sistema_de_agencia.Atendimento;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaRegistroDeAtendimento extends JDialog{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtFIdDoCliente;
	private JTextField txtFIdDoBanco;
	private JTextField txtFDataDeAtendimento;
	private JTextField txtFHora;
	private JTextField txtFAtendente;
	private JLabel lblIdDoCliente;
	private JLabel lblIdDoBanco;
	private JLabel lblDataDeAtendimento;
	private JLabel lblHora;
	private JLabel lblAtendente;
	private JButton btnRegistrar;
	private JButton btnFechar;
	
	
	public TelaRegistroDeAtendimento( ) {
		
		setResizable(false);
		setSize(580,480);
		setTitle("Registro de Atendimento ao Cliente");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
		getContentPane().setLayout(null);
		
		lblIdDoCliente = new JLabel("ID do Cliente:");
		lblIdDoCliente.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
		lblIdDoCliente.setBounds(21, 39, 87, 14);
		getContentPane().add(lblIdDoCliente);
		
		txtFIdDoCliente = new JTextField();
		txtFIdDoCliente.setBounds(118, 37, 114, 20);
		getContentPane().add(txtFIdDoCliente);
		txtFIdDoCliente.setColumns(10);
		
		lblIdDoBanco = new JLabel("ID do Banco:");
		lblIdDoBanco.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
		lblIdDoBanco.setBounds(21, 81, 87, 14);
		getContentPane().add(lblIdDoBanco);
		
		txtFIdDoBanco = new JTextField();
		txtFIdDoBanco.setBounds(118, 79, 114, 20);
		getContentPane().add(txtFIdDoBanco);
		txtFIdDoBanco.setColumns(10);
		
		lblDataDeAtendimento = new JLabel("Data de Atendimento:");
		lblDataDeAtendimento.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
		lblDataDeAtendimento.setBounds(21, 123, 143, 14);
		getContentPane().add(lblDataDeAtendimento);
		
		txtFDataDeAtendimento = new JTextField();
		txtFDataDeAtendimento.setBounds(158, 121, 108, 20);
		getContentPane().add(txtFDataDeAtendimento);
		txtFDataDeAtendimento.setColumns(10);
		
		lblHora = new JLabel("Hora:");
		lblHora.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
		lblHora.setBounds(21, 157, 46, 14);
		getContentPane().add(lblHora);
		
		txtFHora = new JTextField();
		txtFHora.setBounds(63, 155, 86, 20);
		getContentPane().add(txtFHora);
		txtFHora.setColumns(10);
		
		lblAtendente = new JLabel("Atendente:");
		lblAtendente.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
		lblAtendente.setBounds(21, 198, 75, 14);
		getContentPane().add(lblAtendente);
		
		txtFAtendente = new JTextField();
		txtFAtendente.setBounds(95, 196, 289, 20);
		getContentPane().add(txtFAtendente);
		txtFAtendente.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBorder(UIManager.getBorder("DesktopIcon.border"));
		panel.setBounds(10, 317, 554, 123);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Atendimento at = new Atendimento(txtFIdDoCliente.getText(), txtFIdDoBanco.getText(),
						txtFDataDeAtendimento.getText(), txtFAtendente.getText(), txtFHora.getText());
				 
					try 
					{
						JOptionPane.showMessageDialog(null, "Cliente registrado com sucesso!");
					} 
					catch (Exception e) 
					{
						e.printStackTrace();
					}
			}
		});

			

		btnRegistrar.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
		btnRegistrar.setBounds(125, 11, 113, 39);
		panel.add(btnRegistrar);
		
		btnFechar = new JButton("Fechar");
		btnFechar.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
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
		btnFechar.setBounds(258, 11, 118, 39);
		panel.add(btnFechar);
		setLocationRelativeTo(null);
	}


	
}
