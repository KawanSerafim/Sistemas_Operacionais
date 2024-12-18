package processos.controller.exerciciosprincipais;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

@SuppressWarnings("deprecation")

public class KillController {
    
    public KillController() {

        super();

    }

    private String os() {

        return System.getProperty("os.name");

    }
    
	public String listaProcesso() throws IOException {

        if(os().contains("Windows")) {
        	
            Process p = Runtime.getRuntime().exec("TASKLIST /FO TABLE");
            InputStream fluxo = p.getInputStream();
            InputStreamReader leitor = new InputStreamReader(fluxo);
            BufferedReader buffer = new BufferedReader(leitor);

            String linha = buffer.readLine();
            StringBuilder copia = new StringBuilder();
            
            while(linha != null) {

                copia.append(linha + "\n");
                linha = buffer.readLine();

            }

            fluxo.close();
            leitor.close();
            buffer.close();

            return copia.toString();

        } else if(os().contains("Linux")) {

            Process p = Runtime.getRuntime().exec("ps -ef");
            InputStream fluxo = p.getInputStream();
            InputStreamReader leitor = new InputStreamReader(fluxo);
            BufferedReader buffer = new BufferedReader(leitor);

            String linha = buffer.readLine();
            StringBuilder copia = new StringBuilder();
            
            while(linha != null) {

                copia.append(linha + "\n");
                linha = buffer.readLine();

            }

            fluxo.close();
            leitor.close();
            buffer.close();

            return copia.toString();

        } else {

            return "Não há versão para seu SO.";

        }

    }
    
	public String mataPid(int pid) throws IOException {

        if(os().contains("Windows")) {

            Runtime.getRuntime().exec("TASKKILL /PID " + pid);
            return "Processo finalizado.";

        } else if(os().contains("Linux")) {

            Runtime.getRuntime().exec("kill -9 " + pid);
            return "Processo finalizado.";

        } else {
            
            return "Não há versão para seu SO.";

        }

    }

    public String mataNome(String nome) throws IOException {

        if(os().contains("Windows")) {

            Runtime.getRuntime().exec("TASKKILL /IM " + nome);
            return "Processo finalizado.";

        } else if(os().contains("Linux")) {

            Runtime.getRuntime().exec("pkill -f " + nome);
            return "Processo finalizado.";

        } else {

            return "Não há versão para seu SO.";

        }

    }

}