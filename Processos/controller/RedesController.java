package processos.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class RedesController {
	
	public RedesController() {
		
		super();
		
	}
	
	private String os() {
		
		return System.getProperty("os.name");
		
	}
	
	public String ip() throws IOException {
		
		if (os().contains("Windows")) {
				
			Process p = Runtime.getRuntime().exec("IPCONFIG");
			InputStream fluxo = p.getInputStream();
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			
			String linha = buffer.readLine();
			StringBuilder copia = new StringBuilder();
			String adaptador = "";
			
			while(linha != null) {
				
				if(linha.contains("Adaptador")) {
					
					adaptador = linha;
					
				}
				if (linha.contains("IPv4")) {
					
					copia.append("\n" + adaptador + "\n" + linha);
				
				}
				linha = buffer.readLine();
				
			}
			
			fluxo.close();
			leitor.close();
			buffer.close();
			
			return copia.toString();
			
		} else if(os().contains("Linux")) {
			
			Process p = Runtime.getRuntime().exec("ip addr");
			InputStream fluxo = p.getInputStream();
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			
			String linha = buffer.readLine();
			StringBuilder copia = new StringBuilder();
			String adaptador = "";
			
			while(linha != null) {
				
				if(linha.contains("mtu")) {
					
					adaptador = linha;
					
				}
				if (linha.contains("inet ")) {
					
					copia.append("\n" + adaptador + "\n" + linha);
				
				}
				linha = buffer.readLine();
				
			}
			
			fluxo.close();
			leitor.close();
			buffer.close();
			
			return copia.toString();
			
		}
		
		return null;
		
	}
	
	public String ping() throws IOException {
		
		if(os().contains("Windows")) {
			
			Process p = Runtime.getRuntime().exec("ping -4 -n 10 www.google.com.br");
			InputStream fluxo = p.getInputStream();
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			
			String linha = buffer.readLine();
			
			while(linha != null) {
				
				if(linha.contains("M") && linha.contains("dia")) {
					
					String[] media = linha.split(",");
					
					for(String palavra : media) {
						
						if(palavra.contains("dia")) { 
							
							fluxo.close();
							leitor.close();
							buffer.close();
							
							return "\n" + palavra;
							
						}
						
					}
					
				}
				
				linha = buffer.readLine();
				
			}
			
		} else if(os().contains("Linux")) {
			
			Process p = Runtime.getRuntime().exec("ping -4 -c 10 www.google.com.br");
			InputStream fluxo = p.getInputStream();
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			
			String linha = buffer.readLine();
			
			while (linha != null) {
				
				if ((linha.contains("mdev"))) {
					
					String[] media = linha.split("/");
					
					for(String palavra : media) {
						
						if(palavra.contains("ms")) {
							
							fluxo.close();
							leitor.close();
							buffer.close();
							
							return "\nMedia = " + palavra;
							
						}
						
					}
					
				}
				
				linha = buffer.readLine();
			}
			
		}
		
		return null;
		
	}
	
}