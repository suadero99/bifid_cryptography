import java.util.HashMap;

import javax.print.event.PrintEvent;

public class main{
  public static void main(String[] args) {
    //Pasamos args[0] (la llave) a un arreglo de char
    char[] key = "ENCRYPT".toCharArray(); 

    //Abecedario
    String[] letters = new String[]{"A","B","C","D","E","F","G","H","I",
      "K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

    tableauOps operador = new tableauOps(letters);
    
    //Armamos nuestra cuadrícula de 5x5
    String[][] tableau = operador.arrangeTableau(key);

    operador.printTableau(tableau);
    
    String message = args[1];
    if(args[0] == "ENCRYPT"){
      /****************************** 
       * CIFRADO
      *******************************/
      //Pasamos args[1] (el mensaje cifrado)
      System.out.println("Cifrado");
      
    }

    if(args[0] == "DECRYPT"){
      /******************************
       * DECIFRADO
       ******************************/
      System.out.println("Decifrado");
    }
    

  } //fin función main
}