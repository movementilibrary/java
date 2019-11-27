-------------------------------------Conceitos-------------------------------------------------

Desempenho das collection.arraylist Big-O = bigocheatsheet.com
Generics: Define o tipo daquela lista


-----------------------------------------Listas------------------------------------------------

1 - ArrayList são ordenados conforme insercao
    Ex:         List<String> nomes = new ArrayList<>();
                nomes.add("Michel");
                nomes.add("Sophia");
                nomes.add("Jac");

       saida: Michel
              Sophia
              Jac


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

8 - Eliminando elementos da lista sem eleminar referencia ao objeto ArrayList, nesse caso não teremos
    o null pointer exception
         Ex: List<String> nomes = new ArrayList<>();
              nome.add("michel");
             List<String> nomes2 = new ArrayList<>();
             nomes2.addAll(nomes);
             nome.clear();


9 - Pra verificar se um objeto contem dentro de uma lista basta usar o metodo contains
      Ex:     Celular celular1 = new Celular("Galaxy", "123");
                    Celular celular2 = new Celular("Ifone", "9876");
                    Celular celular3 = new Celular("Sony", "012");

                    List<Celular> listaCelular = new ArrayList<>();
                    listaCelular.add(celular1);
                    listaCelular.add(celular2);
                    listaCelular.add(celular3);

                    Celular celular4 = new Celular("Sony", "012");

                    System.out.println(listaCelular.contains(celular4));


9 - Para ordenar uma lista utilizamos a classe utilitária chamada collections,
    e nessa classe temos um metodo chamado sort, ele usa a propria lista para realizar a ordenacao
       Ex:    List<String> nomes = new ArrayList<>();
              nomes.add("Michel");
              nomes.add("Sophia");
              nomes.add("Jac");

              Collections.sort(nomes);

              for (String nome: nomes) {
                  System.out.println(nome);
              }
          }

  Para que o metodo funcione precisamos mostrar qual o critério de ordenacao, para isso será necessário
  implementar a interface Comparable que define qual será nossa ordem natural, no exemplo abaixo estamos ordenando
  pelo preco. OBS: tipo primitivo nao tem metodo comparTo

           @Override
           public int compareTo(Produto outroProduto) {
               return this.getPreco().compareTo(outroProduto.getPreco());
           }


      @Override
      public int compareTo(Produto outroProduto) {
          return this.getPreco().compareTo(outroProduto.getPreco());
      }

   Agora imagine que voce queira ordenar o produto pelo nome, nao vamos alterar o metodo anterior, então para que
   isso funcione vamos usar a interface comparator, criando uma classe, basta implementar o comparator da seguinte forma

       @Override
       public int compare(Produto p1, Produto p2) {
           return p1.getNome().compareTo(p2.getNome());
       }
   Quando for chamar o metodo sorte, basta passar o tipo da ordenacao que voce deseja.
        Ex:

          List<Produto> listaProdutos = new ArrayList();

                Produto produto1 = new Produto("123", "Laptop Lenovo", 2000.00);
                Produto produto2 = new Produto("321", "Picanha", 26.4);
                Produto produto3 = new Produto("879", "Tecladdo Reser", 1000.00);
                Produto produto4 = new Produto("012", "Sansung Galaxy", 3250.00);

                listaProdutos.add(produto1);
                listaProdutos.add(produto2);
                listaProdutos.add(produto3);
                listaProdutos.add(produto4);

                Collections.sort(listaProdutos, new ProdutoComparator());

                for (Produto produto: listaProdutos) {
                    System.out.println(produto);
                }

            }

-------------------------------------------------------------------------------------------------------
7 - LinkedList - São ordenados pela ordem de insercao

8 - LinkedHashSet - Classificacao aleatório