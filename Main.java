import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a  first word");
        String word1 = scanner.nextLine();

        System.out.println("Enter a second word:");
        String word2 = scanner.nextLine();

        int Lenght1 = word1.length();
        int Lenght2 = word2.length();

        if (Lenght1 % 2 != 0 || Lenght2 % 2 != 0) {
            System.out.println("The words must on even number of letter");
            return;


        }
        String newWord = word1.substring(0, Lenght1 / 2) + word2.substring(Lenght2 / 2, Lenght2);
        System.out.println("The combined word is:" + newWord);

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Задание номер 2: Запуск!");
        System.out.println("****************************");
        System.out.println("******#2***#2***#2****#2*****");
        System.out.println("****************************");

        System.out.println(sum(5, 10));
        System.out.println(substraction(88, 20));
        System.out.println(multiplication(15, 15));
        System.out.println(division(20, 10));
    }

    public static int sum(int a, int b) {
        return a + b;
    }


    public static int substraction(int a, int b) {
        return a - b;

    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static int division(int a, int b) throws Exception {
        if (b == 0) throw new Exception("You can't divide by zero");
        return a / b;

    }

}

