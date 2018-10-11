/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laberinto;

import static java.lang.System.exit;

/**
 *
 * @author KLEBER PUCHA
 */
public class BuscarCamino {

    boolean salida(char[][] x, int i, int j)
    {
        if (i != x.length - 1 || j != x[i].length - 1) {
            if (x[i][j] == 'F') {
                System.out.println("Fin");
                return true;
            }
            if (x[i][j] == '*' || x[i][j] == '+') {
                return false;
            }
            x[i][j] = '+';
            if (salida(x, i + 1, j)) {
                System.out.println("baja");
                return true;
            }
            if (salida(x, i - 1, j)) {
                System.out.println("sube");
                return true;
            }
            if (salida(x, i, j + 1)) {
                System.out.println("derecha");
                return true;
            }
            if (salida(x, i, j - 1)) {
                System.out.println("izquierda");
                return true;
            }
        }
        return false;
    }
}
