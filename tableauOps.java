import java.util.LinkedList;
import java.util.List;
/**
 * tableauOps
 */

public class tableauOps {
  int c = 0; //Contador para recorrer nuestro abecedario
  String[] letters; //abecedario

  public tableauOps(String[] letters){
    this.letters = letters;
  }

  public String[][] arrangeTableau(char[] key){
    String[][] tableau = new String[5][5]; //La tabla
    List<String> usedLetters = new LinkedList<>(); //Lista de letras usadas
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
          tableau[i][j]=""+key[(i*5)+j];
        }
        //Añadimos a la lista de letras usadas
        usedLetters.add(tableau[i][j]);
      }
    }//fin llenado del tableau

    return tableau;
  }

  public void printTableau(String[][] tableau){
    //Impresión de tableau
    for(int i=0; i<5; i++){
      System.out.println();
      for(int j=0; j<5; j++){
        System.out.print(tableau[i][j]);
      }
    }
  }
  
}