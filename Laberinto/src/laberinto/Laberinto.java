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
public class Laberinto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CrearLaberinto cl = new CrearLaberinto();
        //envio las dimensiones de la matriz y el numero de obstaculos
        cl.dibujarLaberinto(6,6,25);
    }
    
}
