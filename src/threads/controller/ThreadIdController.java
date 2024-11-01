package threads.controller;

public class ThreadIdController extends Thread {
    
    private int tid;

    public ThreadIdController() {

        super();

    }

    public ThreadIdController(int tid) {

        this.tid = tid;

    }

    @Override
    public void run() {
        
        mostraTid();

    }

    private void mostraTid() {
        
        System.out.println("TID: #" + tid);
    
    }

}