package processos.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

@SuppressWarnings("deprecation")

public class DistroController {
    
    public DistroController() {

        super();

    }

    private String os() {

        return System.getProperty("os.name");

    }

    public String exibeDistro() throws IOException {

        if(os().contains("Linux")) {

            Process p = Runtime.getRuntime().exec("cat /etc/os-release");
            InputStream fluxo = p.getInputStream();
            InputStreamReader leitor = new InputStreamReader(fluxo);
            BufferedReader buffer = new BufferedReader(leitor);

            String linha = buffer.readLine();
            StringBuilder copia = new StringBuilder();

            while(linha != null) {

                if(linha.contains("NAME") && !linha.contains("_NAME")) {

                    copia.append(linha + "\n");

                }
                if(linha.contains("VERSION_ID")) {

                    copia.append(linha);

                }

            }

            fluxo.close();
            leitor.close();
            buffer.close();

            return copia.toString();

        } else {

            return "Este algoritmo é exclusivo Linux.";

        }

    }

}