import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import javax.print.event.PrintEvent;

public class main{
  public static void main(String[] args) {
    //Pasamos args[0] (la llave) a un arreglo de char
    char[] key = args[0].toCharArray(); 

    List<String> usedLetters = new LinkedList<>(); //Lista de letras usadas
    int lenargs = args[0].length(); //La longitud del argumento de entrada
    int iargs = 0; //Longitud del argumento en vertical
    int jargs = 0; //Longitud del argumento en horizontal
    boolean argsIsIn= false; //Para comprobar si los args ya se usaron para el tableau

    int c = 0; //Contador para recorrer nuestro abecedario
    //Abecedario
    String[] letters = new String[]{"A","B","C","D","E","F","G","H","I",
      "K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    
    //Armamos nuestra cuadrícula de 5x5
    String[][] tableau = new String[5][5];

    //Llenado del tableau
    for(int i=0; i<5; i++){
      for(int j=0; j<5; j++){
        if((i*5)+j == lenargs){
          //Aquí verificamos que ya se recorrió todo args
          argsIsIn = true;
        }
        if(argsIsIn){
          /*jargs=j;
          break;*/
          while(true){
            if(usedLetters.contains(letters[c])){
              c++;
            }else{
              tableau[i][j]=letters[c];
              break;
            }
          }
          
        }else{
          //System.out.println("i: "+i+"\nj: "+j);
          tableau[i][j]=""+key[(i*5)+j];
        }
        //Añadimos a la lista de letras usadas
        usedLetters.add(tableau[i][j]);
      }
    }//fin llenado del tableau

    //Impresión de tableau
    for(int i=0; i<5; i++){
      System.out.println();
      for(int j=0; j<5; j++){
        System.out.print(tableau[i][j]);
      }
    }
    
    /****************************** 
     * CIFRADO
    *******************************/
    //Pasamos args[1] (el mensaje)
    String cmessage =

    /******************************
     * DECIFRADO
     ******************************/

  } //fin función main
}