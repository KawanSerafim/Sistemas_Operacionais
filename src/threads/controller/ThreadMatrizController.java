package threads.controller;

public class ThreadMatrizController extends Thread {

    private int tid, i, somatoria;
    private int[] linha;

    public ThreadMatrizController(int tid, int[] linha) {

        this.linha = linha;
        this.tid = tid;

    }

    @Override
    public void run() {
        
        calculaLinha();
        exibeResultado();
        
    }
        
    private void calculaLinha() {

        for(i = 0; i < linha.length; i++)
            somatoria = somatoria + linha[i];

    }

    private void exibeResultado() {

        System.out.println("TID: #" + tid + " - Somatoria = " + somatoria);

    }

}