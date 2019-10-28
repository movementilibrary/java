Interfaces

Interface diz o que você deve fazer e não COMO fazer

Uma interface se le como é um, Exemplo Produto é um Tributavel


1 - Em uma interface todos os metodos já são considerados public e abstract
      Ex: public abstract void calcularImposto()

2 - Em uma interce os atributos são considerados constantes
     Ex: public static final double IMPOSTO

3 - O que diferencia classes abstratas de interfaces é que interface voce pode implementar mais de uma interface,
    isso qur dizer que podemos ter multiplas implementacoes de interface
      Ex: public class Produto implements Tributavel, Transportavel

4 -  Em uma inteface você nunca vai conseguir colocar corpo nela.
       Ex: void calculaImposto(){}

5 - Quando implementamos uma interface automaticamente sobrescrevemos seus metodos isso quer dizer que a
    o modificador de acesso não pode ser diferente de public

6 - Quando trabalhamos com inteface, não podemos criar um objeto dela, podemos semente usa-la como variavel
    de referencia,
