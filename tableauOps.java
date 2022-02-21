import java.util.LinkedList;
import java.util.List;
/**
 * tableauOps
 */

public class tableauOps {
  int c = 0; //Contador para recorrer nuestro abecedario
  char[] letters; //abecedario

  public tableauOps(char[] letters){
    this.letters = letters;
  }

  public char[][] arrangeTableau(char[] key){
    char[][] tableau = new char[5][5]; //La tabla
    List<Character> usedLetters = new LinkedList<>(); //Lista de letras usadas
    int keyLen = key.length; //La longitud del argumento de entrada
    boolean keyIsIn= false; //Para comprobar si los args ya se usaron para el tableau

    //Inicio Llenado del tableau
    for(int i=0; i<5; i++){
      for(int j=0; j<5; j++){
        if((i*5)+j == keyLen){
          //Aquí verificamos que ya se recorrió todo args
          keyIsIn = true;
        }
        if(keyIsIn){
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
          tableau[i][j]=key[(i*5)+j];
        }
        //Añadimos a la lista de letras usadas
        usedLetters.add(tableau[i][j]);
      }
    }//fin llenado del tableau

    return tableau;
  }

  public void printTableau(char[][] tableau){
    //Impresión de tableau
    for(int i=0; i<5; i++){
      System.out.println();
      for(int j=0; j<5; j++){
        System.out.print(tableau[i][j]);
      }
    }
  }
  
  //Obtención de índices para cifrar
  public int[] encodeIndexes(char[] chMessage, char[][] tableau){
    int[] rows = new int[chMessage.length * 2];

    for(int i=0;i<chMessage.length;i++){//Inicio busqueda de letras en arreglo
      for(int j=0;j<5;j++){//Inicio horizontal
        for(int k=0;k<5;k++){//Inicio vertical
          if(tableau[j][k] == chMessage[i]){
            //Insertamos los índices
            rows[i]=j; //"primera" hilera
            rows[chMessage.length+i]=k;//la "segunda" hilera
            //System.out.print(j+""+k);
          }
        }//Fin vertical
      }//Fin horizontal
    }//Fin busqueda
    return rows;
  }
}