package heranca;

public class Gerente extends Funcionario{


    private int senha = 123;


    public boolean autentica(int senha){
        if(this.senha == senha){
            return true;
        }else{
            return false;
        }
    }

//    public double getBonificacao(){
//        return this.salario * 0.1;
//    }




}
