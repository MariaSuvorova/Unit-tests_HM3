package Homework3.main;

public class tasks{

    // Напишите тесты, покрывающие на 100% метод evenOddNumber, который проверяет, 
    // является ли переданное число четным или нечетным:

    public boolean evenOddNumber(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Разработайте и протестируйте метод numberInInterval, который проверяет, 
    // попадает ли переданное число в интервал (25;100)
    public boolean numberInInterval(int n) {
        if (n >= 25 && n <= 100) {
            return true;
        } else {
            return false;
        }
    }
}