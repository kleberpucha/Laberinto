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

    void dibujarLaberinto(int x, int y, int o) {
        //declaracion de variables a utilizar
        int ix = 0, iy = 0, fx = 0, fy = 0;
        //la matriz sera de tipo char
        char matriz[][] = new char[x][y];
        //for que en este momento se creara con puntos completamente que son espacios
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = '.';
            }
        }

        //creo contornos los mismos que haran de limites para el laberinto
        //para esto recorremos la matriz creada y asignamos los nuevos valores
        //de asterisco que son nuestros obstaculos.
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == 0) {
                    //contorno izquierdo
                    //asignamos a la matriz el valor nuevo asterisco
                    matriz[i][j] = '*';
                }
                if (j == 0) {
                    //contorno superior
                    //asignamos a la matriz el valor nuevo asterisco
                    matriz[i][j] = '*';
                }
                if (j == matriz.length - 1) {
                    //contorno derecha
                    //asignamos a la matriz el valor nuevo asterisco
                    matriz[i][j] = '*';
                }
                if (i == matriz.length - 1) {
                    //contorno inferior
                    //asignamos a la matriz el valor nuevo asterisco
                    matriz[i][j] = '*';
                }
            }
        }
        //declaro un contador cont  
        //que sera usado para controlar la cantidad de obstaculos a ingresar
        int cont = 0;
        //condicion do que ira asiganado los obstaculos de forma aleatoria
        //y lo hara hasta que cont sea igual a o que es el numero de obstaculos
        do {
            int ubiob1 = (int) (Math.random() * x);
            int ubiob2 = (int) (Math.random() * y);
            matriz[ubiob1][ubiob2] = '*';
            cont++;
        } while (cont < o);
        //declaramos un contador cont2
        //que sera usado para controlar el ingreso de I y F
        int cont2 = 0;
        //condicion do que lo hara hasta que cont2 sea igual a 2
        //dentro de este contara con condiciones if que asiganaran a I y F
        do {
            cont2++;
            //si cont2 es igual 1 este asignara la ubicacion aleatoria de I
            if (cont2 == 1) {
                //condicion do para que I no se coloque en un obstaculo
                do {
                    //sacamos numero aleatorios que seran la ubicacion de I
                    ix = (int) (Math.random() * x);
                    iy = (int) (Math.random() * y);
                    //esta condicion while es para que la I no sea asiganada en
                    //una ubicacion asiganada al obstaculo
                } while (matriz[ix][iy] == '*');
                //asignamos a la matriz creada el nuevo valos I
                matriz[ix][iy] = 'I';
            }
            if (cont2 == 2) {
                do {
                    //sacamos numero aleatorios que seran la ubicacion de F
                    do {
                        fx = (int) (Math.random() * x-1);
                        fy = (int) (Math.random() * y-1);
                    } while (ix != fx && iy != fy);
                    //en esta condicion while es para que no coloque la F en
                    //la ubicacion actual ya que esta ocupada con el inicio
                    //y con el obstaculo esto para q no coincida en la misma ubicacion
                } while (matriz[fx][fy] == '*' || matriz[fx][fy] == 'I');
                //asignamos a la matriz creada el nuevo valos F
                matriz[fx][fy] = 'F';
            }
        } while (cont2 < 2);
        //realizamos los for para mostrar en pantalla la matriz creada
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
                System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
        BuscarCamino bc = new BuscarCamino();
        //enviamos al metodo caminar la matriz creada y los valores ix y iy que 
        //son las cordenadas de I que seria nuestro inicio
        bc.caminar(matriz, ix, iy);
    }
}
