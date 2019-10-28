String

1 - String são imutaveis, isso quer dizer que elas não mudam nunca, no exemplo abaixo o java está criando uma nova
    String em memoria, quando fizemos isso o java dentro da memoria HEAP criou uma String = Michel, outra String
    = Marciano e uma Terceira String = Michel Marciano
    Ex: String nome = "Michel"
        nome.concat( "Marciano")
        saida = Michel

2 - Quando criamos uma variavel com nome e atribuimos o valor = "michel" e em seguida criamos uma nova váriavel
    dessa vez nome2 e tambem atribuimos o valor = "michel" o java vai verificar na String constant pool se
    existe a mesma palavra com os mesmos caracteres, se existir faz uma referencia para o mesmo valor existente

3 - Quando escrevemos o seguinte codigo String nome3 = new String("caracteres") o java está realizando a seguinte
    operação:
      1 - Cria variavel de referencia
      2 - Cria um objeto do tipo string
      3 - Cria uma string no poll de String

4 - Metodo concat, usado para concatenar uma string
    Ex: String nome = "Michel"
        nome = nome.conact("Marciano")

5 - Metodo charArt, usado para saber qual o caractere e determinada posição
    String nome = "Jacqueline"
    nome.charArt(index)

