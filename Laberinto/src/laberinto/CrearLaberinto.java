/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laberinto;
/**
 *
 * @author KLEBER PUCHA
 */
public class CrearLaberinto {
    public int xfijo=0;
    public int yfijo=0;
    void dibujarLaberinto(int x, int y, int o) {
        
        int ix = 0, iy = 0, fx = 0, fy = 0;
        char matriz[][] = new char[x][y];       
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = '.';
            }
        }
        int cont = 0;
        do {
            int ubiob1 = (int) (Math.random() * x);
            int ubiob2 = (int) (Math.random() * y);
            matriz[ubiob1][ubiob2] = '*';
            cont++;
        } while (cont < o);
        int cont2 = 0;
        do {
            cont2++;
            if (cont2 == 1) {
                ix = (int) (Math.random() * x-1);
                iy = (int) (Math.random() * y-1);
                matriz[ix][iy] = 'I';
            }
            if (cont2 == 2) {
                fx = (int) (Math.random() * x);
                fy = (int) (Math.random() * y);
                matriz[fx][fy] = 'F';
            }
        } while (cont2 < 2);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        BuscarCamino bc = new BuscarCamino();
        xfijo=ix;
        yfijo=iy;
        bc.salida(matriz, ix, iy);
    }
}
