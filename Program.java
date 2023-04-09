import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();
        List<Double> ls = new ArrayList<>();
        List<Integer> ls2 = new ArrayList<>();
        
        // Заполняем список ls значениями от 0 до 9
        for (int i = 0; i < 10; i++) {
            ls.add((double) i);
            ls2.add(i);
        }
        
        System.out.println("Введите первое число: ");
        double num1 = scanner.nextDouble();
        System.out.println("Введите второе число: ");
        double num2 = scanner.nextDouble();

        // Дополнение: выводим результат сложения num1 и num2
        double result = calc.addition(num1, num2);
        System.out.println("Сложение: " + num1 + " + " + num2 + " = " + result);

        // Вычитание: выводим результат вычитания num2 из num1
        result = calc.subtraction(num1, num2);
        System.out.println("Вычитание: " + num1 + " - " + num2 + " = " + result);

        // Умножение: выводим результат умножения num1 на num2
        result = calc.multiplication(num1, num2);
        System.out.println("Умножение: " + num1 + " * " + num2 + " = " + result);

        // Деление: выводим результат деления num1 на num2
        result = calc.division(num1, num2);
        System.out.println("Деление: " + num1 + " / " + num2 + " = " + result);

        // Сумма: выводим сумму всех элементов списка ls
        result = calc.sum(ls);
        System.out.println("Сумма элементов списка: " + result);

        // Max: выводим максимальное значение из списка ls
        result = calc.max(ls);
        System.out.println("Максимальное значение в списке: " + result);

        // Min: выводим минимальное значение из списка ls
        result = calc.min(ls);
        System.out.println("Минимальное значение в списке: " + result);

        // Среднее значение: выводим среднее арифметическое всех элементов списка ls
        result = calc.average(ls);
        System.out.println("Среднее арифметическое элементов списка: " + result);

        // Считаем четные числа: выводим количество четных чисел в списке ls2
        int count = calc.evenNumbersCount(ls2);
        System.out.println("Количество четных чисел в списке: " + count);
        scanner.close();
    }
}