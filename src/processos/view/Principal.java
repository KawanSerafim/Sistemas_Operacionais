package processos.view;

import java.io.IOException;
import javax.swing.JOptionPane;

import processos.controller.RedesController;
import processos.controller.KillController;

public class Principal {

    public static void main(String[] args) {

        try {

            int opcao = 0;

            do {

                opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite o exercício desejado.\n\n"
                        + "1 - Exercicio 1.\n"
                        + "2 - Exercicio 2.\n"
                        + "3 - Exercicio 3.\n"
                        + "4 - Desafio.\n"
                        + "0 - Sair."));

                switch(opcao) {

                    case 1:

                        exercicio_1();
                        break;

                    case 2:

                        exercicio_2();
                        break;

                    case 3:

                        break;

                    case 4:

                        break;

                    case 0:

                        break;

                    default:

                        JOptionPane.showMessageDialog(null, "Input inválido.");

                }

            } while(opcao != 0);
        
        } catch(Exception e) {
			
			e.printStackTrace();
			
		}

    }

    public static void exercicio_1() throws IOException {

        RedesController redesController = new RedesController();
        int opc = 0;
		
		do {
			
			opc = Integer.parseInt(JOptionPane.showInputDialog("[Processos - Aula 3: Exercicio 1]\n\n"
					+ "1 - IP.\n"
					+ "2 - Ping.\n"
					+ "0 - Sair."));
			
			switch(opc) {
			
				case 1:
					
					JOptionPane.showMessageDialog(null, "O resultado encontrado foi:\n" + redesController.ip());
					break;
					
				case 2:
					
					System.out.println("Aguarde...");
					JOptionPane.showMessageDialog(null, "O resultado encontrado foi:\n" + redesController.ping());
					break;
					
				case 0:
					
					break;
					
				default:
					
					JOptionPane.showMessageDialog(null, "Input inválido");
				
			}
			
		} while(opc != 0);

    }

    public static void exercicio_2() throws IOException {

        KillController killController = new KillController();
        int opc = 0;

        do {

            opc = Integer.parseInt(JOptionPane.showInputDialog("[Processos - Aula 3: Exercicio 2]\n\n"
                + "1 - Listar processos ativos.\n"
                + "2 - Matar processo por PID.\n"
                + "3 - Matar processo por nome.\n"
                + "0 - Sair."));

            switch (opc) {

                case 1:
                    
                    System.out.println(killController.listaProcesso());
                    break;

                case 2:

                    int pid;

                    pid = Integer.parseInt(JOptionPane.showInputDialog("Digite o PID do processo"));

                    JOptionPane.showMessageDialog(null, killController.mataPid(pid));
                    break;

                case 3:

                    break;

                case 0:
            
                    break;

                default:

                    break;

            }

        } while(opc != 0);

    }

    public static void exercicio_3() throws IOException {



    }

}