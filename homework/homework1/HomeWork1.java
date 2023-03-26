package homework.homework1;
import java.util.Scanner;

/**
 * HomeWork1
 */
public class HomeWork1 {

    // public static int Sum (int number)
    //     {
    //         int sum = 0;
    //         for (int i = 1; i <= number ; i++)
    //             sum += i;
    //         return sum;
    //     }
    // public static boolean IsPrime(int number)
    // {
    //     for (int i = 2; i < number; i++) 
    //     { 
    //         if (number % i == 0) 
    //             return false; 
    //     } 
    //     return true; 
    // }     
    
    // public static double Operations (char operation, double number1, double number2)
    // {
    //     // 1. Способ switch case
    //     switch (operation) 
    //     {
    //         case '+':
    //         case '1': return number1 + number2;
    //         case '-':
    //         case '2': return number1 - number2;
    //         case '/':
    //         case '3': return number1 / number2;
    //         case '*':
    //         case '4': return number1 * number2;
    //         default:
    //             System.out.print("Данная операция не предусмотрена в калькуляторе");
    //             return 0;
    //     }
    //     // 2. Способ if/else
    //     // 3. Способ тернарные операции
    //     // return operation == '1'|| operation == '+' ? number1 + number2 : operation == '2' || operation == '-'? number1 - number2 : operation == '3' || operation == '/'? number1 / number2 : number1 * number2;
    // }
        public static void FindNUmbers(int fitrstNumber, int secondNumber, int result)
        {
            int findFirstNumber = 0;
            int findSecondNumber =0;
            if(fitrstNumber >= 0 && secondNumber >= 0)
            {
                findFirstNumber = result % 10 - secondNumber;
                findSecondNumber = result / 10 - fitrstNumber;
            }
            System.out.printf("Искомое выражение: %d + %d = %d", fitrstNumber*10+findFirstNumber, findSecondNumber*10+secondNumber, result);
        }
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        // // 1. Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
        // System.out.print("Введите число: ");
        // int num = in.nextInt();
        // int sum = Sum(num);
        // System.out.printf("Треугольное число равно: %d ", sum);

        // // 2. Вывести все простые числа от 1 до 1000

        // System.out.println("\nПрограмма для выведения простых чисел от 1 до 1000");
        // int count = 0;
        // int number = 1000;
        // for (int i = 1; i <= number; i++)
        //     {
        //         if (IsPrime(i))
        //         {
        //             System.out.printf("%d ", i);
        //             count++;
        //         }
        //     }
        // //3. Реализовать простой калькулятор
        // System.out.print("\nPlease enter the operation I remind you that: \n1. Addition is (+) \n2. Subtraction is (-) \n3. Multiplication is (/) \n4. Division is (*) \nEnter the operation: "); 
        // char operation = in.nextLine().charAt(0);
        // System.out.print("Please enter the first number: ");         
        // double number1 = in.nextDouble(); 
        // System.out.print("Please enter the second number: "); 
        // double number2 = in.nextDouble(); 
        // double result = Operations (operation, number1, number2);
        // System.out.printf("%f ", result);


        // 4.Задано уравнение вида q + w = e, q, w, e >= 0. 
        // Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. 
        // Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.
        System.out.print("Please enter the first number: "); 
        int fitrstNumber = in.nextInt(); 
        System.out.print("Please enter the second number: "); 
        int secondNumber = in.nextInt(); 
        System.out.print("Please enter the result of the addition: "); 
        int result = in.nextInt(); 
        FindNUmbers(fitrstNumber, secondNumber, result);
        in.close();

    }
}
