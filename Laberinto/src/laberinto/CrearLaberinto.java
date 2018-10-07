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
         int matriz[][] = new int[x][y];
         for (int i=0; i < matriz.length; i++) {
          for (int j=0; j < matriz[i].length; j++) {         
           matriz[i][j] = 0;
          } 
         }
         int cont=0;
          do{
             int ubiob1 = (int) (Math.random() * x);
             int ubiob2  = (int) (Math.random() * y);
             matriz[ubiob1][ubiob2]=1;
             cont++;
          }while(cont<o);
          int cont2=0;
             do{
             int ubiob1 = (int) (Math.random() * x);
             int ubiob2  = (int) (Math.random() * y);
             matriz[ubiob1][ubiob2]=2;
             cont2++;
          }while(cont2<2); 
            for (int i=0; i < matriz.length; i++) {
              for (int j=0; j < matriz[i].length; j++){           
              System.out.print(matriz[i][j]);
              System.out.print(" ");
          }
          System.out.println();
         }
    }
}
