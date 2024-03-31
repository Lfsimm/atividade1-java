package facul.desafios.exercicio_1;

public class Calculo{

    int num1;
    int resultado;
    int num2;

    Calculo(int n1, int n2) {

        num1=n1;
        num2=n2;

    }

    public void Soma(){

            resultado=num1+num2;

        System.out.println("primeiro numero: "+num1);
        System.out.println("segundo numero: "+num2);
        System.out.println("resultado: "+resultado);

    }

    public void Sub(){

        resultado=num1-num2;

        System.out.println("primeiro numero: "+num1);
        System.out.println("segundo numero: "+num2);
        System.out.println("resultado: "+resultado);

    }

    public void Mult(){

        resultado=num1*num2;

        System.out.println("primeiro numero: "+num1);
        System.out.println("segundo numero: "+num2);
        System.out.println("resultado: "+resultado);

    }

    public void Div(){

        resultado=num1/num2;

        System.out.println("primeiro numero: "+num1);
        System.out.println("segundo numero: "+num2);
        System.out.println("resultado: "+resultado);

    }

}
