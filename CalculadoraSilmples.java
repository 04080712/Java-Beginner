package pacote_de_estudo;
import java.util.Scanner;
public class CalculadoraSilmples {
    public static void main(String[] teste){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro algarismo: ");
        Double number = scanner.nextDouble();

        Scanner scanner2 = new Scanner(System. in);
        System.out.println("Digite o segundo algarismo: ");
        double number2 = scanner2.nextDouble();

        System.out.println("Qual A operação desejada? ");
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("|+| adição, |-| Subtração, |*| multiolicação, |/| Divisão.");
        String decisao = scanner3.nextLine();
        if (decisao.equals("+"))
        {
            Double resultado = number + number2;
            System.out.println("O resultado desta operação é:" + resultado); 
        }
        if (decisao.equals("-"))
        {
            double resultado = number - number2;
            System.out.println("O resultado desta operação é:" + resultado);
        }
        if (decisao.equals("*"))
        {
            double resultado = number * number2;
            System.out.println("O resultado desta operação é:" + resultado);
        }
        if (decisao.equals("/"))
        {
            double resultado = number + number2;
            System.out.println("O resultado da operação é:" + resultado);
        }
        
























        scanner.close();
        scanner2.close();            
        scanner3.close();        



    }


}
