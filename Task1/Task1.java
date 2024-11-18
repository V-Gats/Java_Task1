




class Answer {
    public int factorial(int n) {
    // Введите свое решение ниже
        if (n < 0)
            return -1;

        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
    // Не удаляйте этот класс - он нужен для вывода результатов наэкран и проверки
public class Task1 {
public static void main(String[] args) {
    int n = 5;
    if (args.length > 0) {
        n = Integer.parseInt(args[0]);
    }

    // Вывод результата на экран
    Answer ans = new Answer();
    int itresume_res = ans.factorial(n);
    System.out.println(itresume_res);
    }
    }
   