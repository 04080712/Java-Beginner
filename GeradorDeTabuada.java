package pacote_de_estudo;

import java.util.Scanner;

public class GeradorDeTabuada {
    public static void main(String[] agr){

        System.out.println("=".repeat(48));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Número de entrada: ");
        int number = scanner.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Qual é a operação desejada?" );
        System.out.println("=".repeat(47));
        System.out.println("|+|Adição|-|Subtração|*|Multiplicação|/|Divisão|");
        String decision = scanner2.nextLine();


        if(decision.equals("+")){
            for (int i = 1; i <= 10; i++){
                System.out.println(number + "*" + i + "=" + (number + i));
                }
        }
        if(decision.equals("-")){
            for (int i = 1; i <=10; i++){
                System.out.println(number + "-" + i + "=" + (number - i));
            }
        }
        if(decision.equals("*")){
            for (int i = 1; i <=10; i++){
                System.out.println(number + "*" + i + "=" + (number * i));
            }
        }
        if(decision.equals("/")){
            for (int i = 1; i <=10; i++){
                System.out.println(number + "/" + i + "=" + (number / i));
            }
        }
        System.out.println("=".repeat(48));
        scanner.close();
        scanner2.close();







    }
}
