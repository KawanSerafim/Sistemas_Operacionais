package threads.view;

import javax.swing.JOptionPane;

import threads.controller.ThreadIdController;

public class Principal {
    
    public static void main(String[] args) {
        
        try {

            int opc = 0;

            do {

                opc = Integer.parseInt(JOptionPane.showInputDialog("Digite o exercício desejado:\n\n"
                    + "1 - Exercicio 1.\n"
                    + "2 - Exercicio 2.\n"
                    + "3 - Exercicio 3.\n"
                    + "4 - Exercicio 4.\n"
                    + "5 - Exercicio 5.\n"
                    + "6 - Exercicio 6 - Desafio.\n"
                    + "7 - Exercicio 7 - Desafio.\n"
                    + "0 - Sair."));

                switch (opc) {

                    case 1:

                        exercicio1();
                        break;
                    
                    case 2:

                        break;

                    case 3:

                        break;

                    case 4:

                        break;

                    case 5:

                        break;

                    case 6:

                        break;

                    case 7:

                        break;

                    case 0:

                        break;

                    default:

                        break;

                }

            } while(opc != 0);

        } catch(Exception e) {

            e.printStackTrace();

        }


    }

    public static void exercicio1() {

        for(int i = 0; i < 5; i++) {

            Thread threadId = new ThreadIdController(i);
            threadId.start();

        }

    }

    public static void exercicio2() {
        
    }

    public static void exercicio3() {
        
    }
    
    public static void exercicio4() {
        
    }
    
    public static void exercicio5() {
        
    }

    public static void exercicio6() {
        
    }

    public static void exercicio7() {
        
    }

}