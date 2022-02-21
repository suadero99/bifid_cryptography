import java.util.HashMap;

import javax.print.event.PrintEvent;

public class main{
  public static void main(String[] args) {
    //Pasamos args[0] (la llave) a un arreglo de char
    char[] key = "ENCRYPT".toCharArray();
    //Abecedario
    char[] letters = new char[]{'A','B','C','D','E','F','G','H','I',
      'K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

    tableauOps operador = new tableauOps(letters);
    
    //Armamos nuestra cuadrícula de 5x5
    char[][] tableau = operador.arrangeTableau(key);

    operador.printTableau(tableau);
    
    //Pasamos nuestros argumentos a un solo String:
    String message = "";
    for(int i=1;i<args.length;i++){
      message += args[i];
    }
    //Nuestro mensaje como arreglo de caracteres, para fácil manejo
    char[] chMessage = message.toCharArray();
    System.out.println("\nMensaje pasado a arreglo de chars\n");

    if(args[0].equals("ENCRYPT")){
      System.out.println("**************CIFRADO**************");
      String encodedMessage = ""; //será nuestro mensaje codificado
      int[] rows = operador.encodeIndexes(chMessage, tableau);

      /*System.out.println("Indices");
      for(int i=0;i<rows.length;i++){
        System.out.print(rows[i]);
      }*/

      //Obtener nuevas letras en base a los nuevos índices
      //Para eso, recorremos todos los índices de par en par
      for(int i=0;i<rows.length;i+=2){//Inicio busqueda par en par
        encodedMessage+=""+tableau[rows[i]][rows[i+1]];
      }
      System.out.println(encodedMessage);
    }

    if(args[0].equals("DECRYPT")){
      System.out.println("**************DECIFRADO**************");
    }
    

  } //fin función main
}