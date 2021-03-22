package sistema_de_agencia.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;


import javax.swing.JMenu;



public class TelaPrincipal extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private JMenuBar menuBar;
	private JMenu mnCadastrarCliente;
	private JMenuItem mntmCadastrarClientePf;
	private JMenuItem mntmCadastrarClientePj;
	private JMenuItem mntmRegistrarAtendimento;
	private JMenu mnAtendimento;
	private JMenu mnSair;
	private JMenuItem mntmRealizarTransacao;
	
	
	public TelaPrincipal() {
		
		setResizable(false);
		setSize(800,600);
		setTitle("Tela Principal");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnCadastrarCliente = new JMenu("Cadastrar Cliente");
		menuBar.add(mnCadastrarCliente);
		
		mntmCadastrarClientePf = new JMenuItem("Cadastrar Cliente PF");
		mnCadastrarCliente.add(mntmCadastrarClientePf);
		mntmCadastrarClientePf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				new TelaCadastroPessoaFisica();
			}
		});
		
		mntmCadastrarClientePj = new JMenuItem("Cadastrar Cliente PJ");
		mnCadastrarCliente.add(mntmCadastrarClientePj);
		mntmCadastrarClientePj.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				new TelaCadastroPessoaJuridica();
			}
		});
		
		
		mnAtendimento = new JMenu("Atendimento");
		menuBar.add(mnAtendimento);
		
		mntmRegistrarAtendimento = new JMenuItem("Registrar Atendimento");
		mnAtendimento.add(mntmRegistrarAtendimento);
		mntmRegistrarAtendimento.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				new TelaRegistroDeAtendimento();
			}
		});
		
		mntmRealizarTransacao = new JMenuItem("Realizar Transac\u00E3o");
		mnAtendimento.add(mntmRealizarTransacao);
		mntmRealizarTransacao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new TelaDeTransacao();
			}
			
		});
		
		
	
		
		
		mnSair = new JMenu("Sair");
		menuBar.add(mnSair);
		mnSair.addMenuListener(new MenuListener() {
			
			@Override
			public void menuSelected(MenuEvent arg0) {
				// TODO Auto-generated method stub
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente sair da aplicação?");
				if( resposta == 0)
				{
					dispose();
				}
				else
				{
					
				}
			}
			
			@Override
			public void menuDeselected(MenuEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void menuCanceled(MenuEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		setVisible(true);
		
	
	
	
	
	
}
}
