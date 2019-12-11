package exception.teste;

public class ExceptionTeste1 {

    public static void main(String[] args) {
        stackoverflowError();
    }

    public static void stackoverflowError(){
        stackoverflowError();
    }
}
