package threads.controller;

public class MatrizController {
 
    private int x, y, i, j;
    private int matriz[][];

    public MatrizController(int[][] matriz, int x, int y) {

        this.matriz = matriz;
        this.x = x;
        this.y = y;

    }

    public int[][] geraMatriz() {

        for(i = 0; i < x; i++) {

            for(j = 0; j < y; j++)
                matriz[i][j] = (int) (Math.random() * 9) + 1; 

        }

        return matriz;

    } 

}