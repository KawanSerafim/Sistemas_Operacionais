package threads.controller;

public class ThreadMatrizController extends Thread {

    private int i, j, tid, somatoria;
    private int[][] matriz  = new int[3][5];
 
    public ThreadMatrizController(int tid) {

        this.tid = tid;

    }

    @Override
    public void run() {
        
        geraMatriz();
        somaLinha();
        exibeResultado();

    }

    private void geraMatriz() {

        for(int i = 0; i < 5; i++) {
    
            for(int j = 0; j < 3; j++)
                matriz[j][i] = (int)(Math.random() * 9) + 1;
    
        }

    }

    private void somaLinha() {

        for(i = 0; i < 5; i++) {

            for(j = 0; j < 3; j++)
                somatoria += matriz[j][i];

        }

    }

    private void exibeResultado() {

        System.out.println("TID: " + tid + " - Somatoria = " + somatoria);

    }

}