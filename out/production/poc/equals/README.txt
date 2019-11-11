1 - O metodo equals foi definido na classe object o problema é ue na classe Object temos o equals
usando o ==, a unica coisa que ele faz é comparar se a referencia daquele objeto é a mesma, ja na classe
string e wrapper esse metodo foi reescrito.

2 - O metodo equals tem que ter as seguintes caracteristicas
   - reflexivo, ou seja se voce char o objeto x.equals(x) tem que ser true para tudo que for diferente de nulo
   - simetrico, para x e y diferente de null, se x.equals(y) logo y.equals(x) tem que ser true
   - transitividade, para x, y, z diferente de null, se x.equals(y) == true e y.equals(x) == true
      e x.equals(z)_== true logo y.equals(z) tambem tem que ser true
   - consistente, x.equals(y) deve sempre retornar o mesmo valor
   - para x diferente de null x.equals(null) tem que retornar false

3 - Para criar um metodo equals ele precisa ser sobrescrito da classe Object, o metodo equals sempre vai
trabalhar com 2 objetos x e y, o x é o this e o y é o que está sendo passado.

     @Overrride
     public boolean equals(Object obj){
         if(obj == null) return false;
         if(this == obj) return true;
         if(this.getClass() != obj.getClass()) return false;
         Celular outroCelular = (Celular) obj;
         return IMEI != null ? IMEI.equals(outroCelular.getIMEI()) : false ;

     }

4 - Sem usar a classe equals o exemplo abaixo vai mostrar false, isso porque as duas referencias nao estao
apontando mas o mesmo objeto em  memoria
        Celular c1 = new Celular("Iphone", "1");
        Celular c2 = new Celular("Iphone", "1");

        System.out.println(c1.equals(c2));

Agora quando a classe equals for sobrescrita ele retorna true, isso porque dizemos que o IMEI
é o que determina se dois objetos são iguais ou nao
     @Overrride
     public boolean equals(Object obj){
         if(obj == null) return false;
         if(this == obj) return true;
         if(this.getClass() != obj.getClass()) return false;
         Celular outroCelular = (Celular) obj;
         return IMEI != null ? IMEI.equals(outroCelular.getIMEI()) : false ;

     }