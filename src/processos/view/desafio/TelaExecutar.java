package processos.view.desafio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import processos.controller.desafio.SearchController;
import processos.controller.desafio.RunController;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaExecutar extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textCaminho;
	private JButton btnOk;
	private JButton btnCancelar;
	private JButton btnProcurar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaExecutar frame = new TelaExecutar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaExecutar() {
		setTitle("Executar - Windows 10");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInstrucao = new JLabel("Digite o caminho do executável, ou clique em procurar");
		lblInstrucao.setBounds(84, 49, 402, 41);
		lblInstrucao.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(lblInstrucao);
		
		JLabel lblAbrir = new JLabel("Abrir:");
		lblAbrir.setBounds(22, 142, 46, 14);
		lblAbrir.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(lblAbrir);
		
		textCaminho = new JTextField();
		textCaminho.setBounds(84, 136, 402, 20);
		contentPane.add(textCaminho);
		textCaminho.setColumns(10);
		
// =================================================================
		
		btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RunController runController = new RunController(textCaminho);
				runController.actionPerformed(e);
				dispose();
			}
		});
		btnOk.setBounds(84, 195, 111, 33);
		contentPane.add(btnOk);
		
// =================================================================		
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setBounds(231, 195, 111, 33);
		contentPane.add(btnCancelar);
		
// =================================================================		
		
		btnProcurar = new JButton("Procurar");
		btnProcurar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SearchController searchController = new SearchController(textCaminho);
				searchController.actionPerformed(e);
			}
		});
		btnProcurar.setBounds(375, 195, 111, 33);
		contentPane.add(btnProcurar);
				
	}
	
}