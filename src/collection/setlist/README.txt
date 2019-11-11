-------------------------------------Caracteristicas-------------------------------------------------
Não permite elementos duplicados
Não mantem uma ordem de entrada


-----------------------------------------HashSet------------------------------------------------
 1 - Usando o HashSet, temos certeza de não ter elementos duplicados, isso porque ele utiliza os
 metodos iguas (verifica se ja existe o objeto na lista )e hashcode ()
 , no exemplo abaixo temos dois objetos iguais dentro da lista mas só temos uma saida do obejto

        Produto produto1 = new Produto("123", "Laptop Lenovo", 2000.00);
        Produto produto2 = new Produto("321", "Picanha", 26.4);
        Produto produto3 = new Produto("879", "Tecladdo Reser", 1000.00);
        Produto produto4 = new Produto("012", "Sansung Galaxy", 3250.00);

        Set<Produto>  produtoSet = new HashSet<>();

        produtoSet.add(produto1);
        produtoSet.add(produto1);


        for (Produto produto: produtoSet) {
            System.out.println(produto);
        }
