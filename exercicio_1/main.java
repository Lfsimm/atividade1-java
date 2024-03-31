package facul.desafios.exercicio_1;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n1= 0, n2= 0, result=0;

        int op;

        System.out.println("----------OPERADORES---------\n\n            + = 1\n            - = 2\n            * = 3\n            / = 4");

        System.out.println("informe o operador desejado: ");
        op = sc.nextInt();

        if(op == 1){
            System.out.println("informe o numero que irá ser somado: ");
            n1 = sc.nextInt();

            System.out.println("Informe o numero que irá somar");
            n2 = sc.nextInt();

            Calculo calc1 = new Calculo(n1, n2);
            
            calc1.Soma ();

        }else if(op ==2){

            System.out.println("informe o numero que irá ser subtraido: ");
            n1 = sc.nextInt();

            System.out.println("Informe o numero que irá subtrair");
            n2 = sc.nextInt();

            Calculo calc1 = new Calculo(n1, n2);
            
            calc1.Sub ();

        }
        else if(op ==3){

            System.out.println("informe o numero que irá ser Multplicado: ");
            n1 = sc.nextInt();

            System.out.println("Informe o numero que irá multplicar");
            n2 = sc.nextInt();

            Calculo calc1 = new Calculo(n1, n2);
            
            calc1.Mult ();

        }else if(op ==4){

            System.out.println("informe o numero que irá ser dividido: ");
            n1 = sc.nextInt();

            System.out.println("Informe o numero que irá dividr");
            n2 = sc.nextInt();

            Calculo calc1 = new Calculo(n1, n2);
            
            calc1.Div ();

        }else{
            System.out.println("operador invalido");
        }
        

    }
    
}
