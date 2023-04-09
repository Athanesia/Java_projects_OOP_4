import java.util.List;

public class Calculator {
    public Double sum(List<? extends Number> list) {
        Double sum = 0.0;
        for (Number num : list) {
            sum += num.doubleValue();
        }
        return sum;
    }

    public Double subtraction(Double num1, Double num2) {
        return num1 - num2;
    }

    public Double addition(Double num1, Double num2) {
        return num1 + num2;
    }

    public Double multiplication(Double num1, Double num2) {
        return num1 * num2;
    }

    public Double division(Double num1, Double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Деление на ноль");
        }
        return num1 / num2;
    }

    public Double max(List<Double> list) {
        Double max = Double.MIN_VALUE;
        for (Double num : list) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public Double min(List<Double> list) {
        Double min = Double.MAX_VALUE;
        for (Double num : list) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public Double average(List<Double> list) {
        if (list.isEmpty()) {
            return 0.0;
        }
        return sum(list) / list.size();
    }

    public int evenNumbersCount(List<Integer> list) {
        int count = 0;
        for (Integer num : list) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public String binaryConversion(String input) {
        // Convert input to int
        int num = Integer.parseInt(input);

        // Convert int to binary string
        return Integer.toBinaryString(num);
    }
}