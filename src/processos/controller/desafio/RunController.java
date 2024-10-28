package processos.controller.desafio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class RunController implements ActionListener {

	private JTextField textCaminho;
	
	public RunController(JTextField textCaminho) {
		
		this.textCaminho = textCaminho;
		
	}
	
	public void abreArquivo() {
		
		try {
			
			ProcessBuilder builder = new ProcessBuilder(textCaminho.getText());
			builder.start();
			
		} catch (IOException e) {
			
			
			e.printStackTrace();
			
		}
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		abreArquivo();

	}
}