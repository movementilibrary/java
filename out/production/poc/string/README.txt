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

5 - Metodo charArt, usado para saber qual o caractere, o index é obrigatório pois ele
    determinada posição que queremos visualizar
    String nome = "Jacqueline"
    nome.charArt(index)

6 - Para comparar duas Strings o correto é usa o metodo equals
    Ex: String nome = "Sophia"
    nome.equals("Sophia")

7 - Para comparar duas Strings ignorando case use o metodo equalsIgnoreCase()
    Ex: String nome = "Sophia"
    nome.equalsIgnoreCase("Sophia")

8 - Para saber o tamnaho da String basta usar o metodo length
    Ex: String nome = "Sophia"
        nome.length();

9 - Para substituir um caracter por outro basta utilizar o metodo replace
    Ex: String nome = "Sophia"
        nome.replace('e', '@')

10 - Para subistituir todos as letras por minusculas basta utilizar o metodo toLowerCase
    Ex: String nome = "Sophia"
        nome.toLowerCase()

11 - Para subistituir todos as letras por maiusculas basta utilizar o metodo toUpperCase
    Ex: String nome = "Sophia"
        nome.toUpperCase()

12 - Para quebrar uma String e pegar somente uma parte dela basta utilizar o metodo substring
    Ex: String nome = "Sophia"
        nome.substring(0,2);
        sout(So)

13 - Para retirar todos os espacos de uma string basta usar o metodo trim
    Ex: String nome = "   Sophia   "
        nome.trim()
        sout(Sophia)
