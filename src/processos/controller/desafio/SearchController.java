package processos.controller.desafio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

public class SearchController implements ActionListener {
	
	private JTextField textCaminho;
	
	public SearchController(JTextField textCaminho) {
		
		this.textCaminho = textCaminho;
		
	}

	public void procuraArquivo() {
		
		FileNameExtensionFilter filtro = new FileNameExtensionFilter("Arquivos Executáveis", "exe");
		String diretorioBase = System.getProperty("user.home") + "/Desktop";
		File dir = new File(diretorioBase);
		
		JFileChooser choose = new JFileChooser();
		choose.setCurrentDirectory(dir);
		choose.setFileSelectionMode(JFileChooser.FILES_ONLY);
		choose.setAcceptAllFileFilterUsed(false);
		choose.addChoosableFileFilter(filtro);
		String caminhoArquivo = "";
		
		int retorno = choose.showOpenDialog(null);
		if(retorno == JFileChooser.APPROVE_OPTION) {
			
			caminhoArquivo = choose.getSelectedFile().getAbsolutePath();
			textCaminho.setText(caminhoArquivo);
			
		}
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		procuraArquivo();
		
	}
	
}