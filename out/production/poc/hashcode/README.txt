   ------------------------------------------HAshCode----------------------------------------------------------

    Tabela Hash, tabela hash organiza os nomes de uma forma otimizada para que voce tena um otimo
    desempenho na insercao e nas buscas, com o exemplo abaixo temos o valor 42, enato o java cria um conjunto
    de dados, quando voce quer realizar uma busca Ex: Alex, o java busca pela chave que no caso é 42
    Ex: ALEX  1+12+5+24 = 42 | BOB = 2+15+2 = 19

    Agora imagine que temos o nome DIRK = 4 + 9 + 18 + 11 = 42, para o java saber qual o bejto queremos
    ele usa o metodo equals, por isso o metod equals e hashcode tem que ser consistentes

    Assim como o Equals o HashCode foi definido na classe Object, para criar o hashCode precisamos usar
    o mesmo atributo que usamos para comparacao do equals, isso porque se x.equasl(y) ==true y.hashCode() == x.hashCode

        @Override
        public int hashCode() {
            return Objects.hash(nome, IMEI);
        }