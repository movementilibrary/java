-------------------------------------Conceitos-------------------------------------------------
Baixo acoplamento: é quando um código é independente de outras classes
Auto coesão: quando o código é muito dependente de outro.
Desempenho das colections Big-O = bigocheatsheet.com
Generics: Define o tipo daquela lista
-----------------------------------------------------------------------------------------------


-----------------------------------------Listas------------------------------------------------
1 - Colecoes ordenadas = quando falamos de colecoes ordenadas, dizemos que podemos navegar sobre
    elas de uma forma especifica, um exemplo seria os Arrays, voce percorre indice por indice

2 - Programando para uma interface, quase sempre utilizar interface como váriavel de referencia
    Ex:  List nomes = new ArrayList();

3 - Para adicionar um elemento na lista basta usar o metodo add
    Ex: List nomes = new ArrayList();
        nome.add("michel")

4 - List e ArrayList são baseados no indice, para imprimir um nome bastar usar o metodo get();
    Ex: List nomes = new ArrayList();
        nome.add("michel")

       for(int i=o; i< size; i++){
        System.out.println(nome.get(i));
       }

5 - Até a versão 4 do java era permitido dar new dentro de uma lista, isso portque não tinha como colocar
    um tipo, com isso todas as vezes o for each tinha que ser feito usando o Object.
        Ex: List nomes = new ArrayList();
            nome.add("michel");
            nome.add(new Pessoa()) ;

       for(Object nome: nomes){

       }

Como isso era bem raro de acontecer eles definiram os Generics, ele define o tipo daquela coleção, com isso
até a versão 6 do java você era obrigado a colocar o tipo da lista, não era possivel na interface ter um tipo
e na classe concreta ter outro tipo.
      Ex: List<String> nomes = new ArrayList<String>();
          nome.add("michel");

     for(String nome: nomes){

     }

Já na versão 7 foi adicionado o Diamond, que nada mais é do que não colocar nada na classe do java, desta forma
ele sabe que o array list é de String pois foi declarado na interface, o contrario nao é valido.
     Ex: List<String> nomes = new ArrayList<>();
         nome.add("michel");

    for(String nome: nomes){

    }

6 - Para remover um elemento da lista podemos usar o metodo revove(), pra ele saber qual elemente ele
precisa remover ele usa a chamada do metodo equals, String sobrescreve o metodo equals
     Ex: List<String> nomes = new ArrayList<>();
         nome.add("michel");

    for(String nome: nomes){
       nomes.remove("michel");
    }

7 - Para incluir uma ista dentro de outra basta usar o metodo addAll()
     Ex: List<String> nomes = new ArrayList<>();
          nome.add("michel");
         List<String> nomes2 = new ArrayList<>();
         nomes2.addAll(nomes);

-------------------------------------------------------------------------------------------------------
7 - LinkedList - São ordenados pela ordem de insercao

8 - LinkedHashSet - Classificacao aleatório