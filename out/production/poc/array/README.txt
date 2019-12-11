Array é sempre um objeto a variavel idades é do tipo refence, que é  um objeto que vai fazer referencia
a um array de 3 posicoes na memoria.

Ex:  public class ArraySimplesIdades {
         public static void main(String[] args) {
             int[] idades = new int [3];

             idades[0] = 20;
             idades[1] = 15;
             idades[2] = 30;

             for (int i=0; i< idades.length; i++){
                 int contador = i +1;
                 System.out.println(" idade do " + contador  + " aluno é " + idades[i] );
             }
         }
     }
