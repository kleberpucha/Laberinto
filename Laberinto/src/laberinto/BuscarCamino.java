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

    //creamos un metodo de tipo booleano que es caminar en este se resivira los 
    //los parametro como la matriz de tipo char creada que es x, las variables 
    //i y j que son las cordenadas de la ubicacion de I que es nuestro Inicio
    boolean caminar(char[][] x, int i, int j) {
        //en las siguientes condiciones if simularemos lo que serian los
        //movimientos dentro de la matriz: arriba, abajo, derecha, izquierda
        //I = al inicio
        //F = al fin
        //* = obstaculos 
        //P = pasos
        //en esta condicion pregunto si existe un F en la ubicacion actual
        //si es asi terminaria retornado true
        if (x[i][j] == 'F') {
            System.out.println("Fin");
            return true;
        }
        //en esta condicion pregunto si existen obstaculos o pasos ya 
        //realizados anteriormente
        //si es asi retorna un false
        if (x[i][j] == '*' || x[i][j] == 'P') {
            return false;
        } //caso contrario seria que hay un espacio
        else {
            //al existir un espacio se le asigna un paso que vendria ser como 
            //el registro de por donde se paso como una huella    
            x[i][j] = 'P';
        }
        //esta parte sireve para mostrarnos como esta el rrecorrido en ese 
        //momento para esto se puede hacer asi o un metodo
        for (int i0 = 0; i0 < x.length; i0++) {
            for (int j0 = 0; j0 < x[i0].length; j0++) {
                System.out.print(x[i0][j0]);
                System.out.print("  ");
            }
             System.out.println(" ");
        }
        System.out.println(" ");
        if (caminar(x, i + 1, j)) {
            System.out.println("baja");
            return true;
        }
        if (caminar(x, i - 1, j)) {
            System.out.println("sube");
            return true;
        }
        if (caminar(x, i, j + 1)) {
            System.out.println("derecha");
            return true;
        }
        if (caminar(x, i, j - 1)) {
            System.out.println("izquierda");
            return true;
        }
        return false;
    }
}
