import java.util.Scanner;
import java.util.Arrays;

public class Main {
    Scanner scanner = new Scanner(System.in);

    public void run() {
        int task = -1;

        while (task != 0) {
            System.out.println();
            System.out.println("========= ЛАБОРАТОРНАЯ РАБОТА №1 (ВАРИАНТ 8) =========");
            System.out.println("1. Задание 1. Методы");
            System.out.println("2. Задание 2. Условия");
            System.out.println("3. Задание 3. Циклы");
            System.out.println("4. Задание 4. Массивы");
            System.out.println("0. Выход");
            System.out.println("======================================================");

            task = readInt("Введите номер задания: ");

            if (task == 1) {
                menuTask1();
            } else if (task == 2) {
                menuTask2();
            } else if (task == 3) {
                menuTask3();
            } else if (task == 4) {
                menuTask4();
            } else if (task == 0) {
                System.out.println("Выход из программы.");
            } else {
                System.out.println("Неверный пункт меню.");
            }
        }
    }

    // МЕНЮ ЗАДАНИЯ 1
    private void menuTask1() {
        int c = -1;
        while (c != 0) {
            System.out.println();
            System.out.println("--------- ЗАДАНИЕ 1. МЕТОДЫ ---------");
            System.out.println("2.  Задача 2.  Сумма знаков");
            System.out.println("3.  Задача 3.  Букву в число");
            System.out.println("6.  Задача 6.  Большая буква");
            System.out.println("8.  Задача 8.  Делитель");
            System.out.println("10. Задача 10. Многократный вызов");
            System.out.println("0.  Назад");
            System.out.println("-------------------------------------");

            c = readInt("Выберите задачу: ");

            if (c == 2) {
                runTask1_2();
            } else if (c == 3) {
                runTask1_3();
            } else if (c == 6) {
                runTask1_6();
            } else if (c == 8) {
                runTask1_8();
            } else if (c == 10) {
                runTask1_10();
            } else if (c == 0) {
                System.out.println("Назад в главное меню.");
            } else {
                System.out.println("Неверный пункт.");
            }
        }
    }

    // Задача 1.2 — Сумма двух последних цифр
    public int sumLastNums(int x) {
        x = Math.abs(x);
        int last = x % 10;
        int prev = (x / 10) % 10;
        return last + prev;
    }

    private void runTask1_2() {
        System.out.println();
        System.out.println("[Задание 1 / Задача 2] Сумма двух последних цифр числа");
        int x = readInt("Введите целое число (например, 4568): ");
        System.out.println("Результат: " + sumLastNums(x));
    }

    // Задача 1.3 — Букву в число
    public int charToNum(char x) {
        return x - '0';
    }

    private void runTask1_3() {
        System.out.println();
        System.out.println("[Задание 1 / Задача 3] Преобразование символа-цифры в число");
        char c = readDigitChar("Введите символ от '0' до '9': ");
        System.out.println("Результат: " + charToNum(c));
    }

    // Задача 1.6 — Большая буква
    public boolean isUpperCase(char x) {
        return x >= 'A' && x <= 'Z';
    }

    private void runTask1_6() {
        System.out.println();
        System.out.println("[Задание 1 / Задача 6] Заглавная буква A-Z");
        char c = readChar("Введите один символ: ");
        System.out.println("Результат: " + isUpperCase(c));
    }

    // Задача 1.8 — Делитель
    public boolean isDivisor(int a, int b) {
        if (a == 0 || b == 0) {
            return false;
        }
        return a % b == 0 || b % a == 0;
    }

    private void runTask1_8() {
        System.out.println();
        System.out.println("[Задание 1 / Задача 8] Делитель");
        int a = readInt("Введите a: ");
        int b = readInt("Введите b: ");
        System.out.println("Результат: " + isDivisor(a, b));
    }

    // Задача 1.10 — Многократный вызов
    public int lastNumSum(int a, int b) {
        return a % 10 + b % 10;
    }

    private void runTask1_10() {
        System.out.println();
        System.out.println("[Задание 1 / Задача 10] Сложение 5 чисел (последние цифры)");
        int acc = readInt("Введите 1-е число: ");
        for (int i = 2; i <= 5; i++) {
            int next = readInt("Введите " + i + "-е число: ");
            acc = lastNumSum(acc, next);
            System.out.println("Промежуточный результат: " + acc);
        }
        System.out.println("Итог: " + acc);
    }

    // МЕНЮ ЗАДАНИЯ 2
    private void menuTask2() {
        int c = -1;
        while (c != 0) {
            System.out.println();
            System.out.println("--------- ЗАДАНИЕ 2. УСЛОВИЯ ---------");
            System.out.println("1. Задача 1. Модуль числа");
            System.out.println("2. Задача 2. Безопасное деление");
            System.out.println("7. Задача 7. Двойная сумма");
            System.out.println("8. Задача 8. Возраст");
            System.out.println("9. Задача 9. День недели");
            System.out.println("0. Назад");
            System.out.println("--------------------------------------");

            c = readInt("Выберите задачу: ");

            if (c == 1) {
                runTask2_1();
            } else if (c == 2) {
                runTask2_2();
            } else if (c == 7) {
                runTask2_7();
            } else if (c == 8) {
                runTask2_8();
            } else if (c == 9) {
                runTask2_9();
            } else if (c == 0) {
                System.out.println("Назад в главное меню.");
            } else {
                System.out.println("Неверный пункт.");
            }
        }
    }

    // Задача 2.1 — Модуль
    public int abs(int x) {
        if (x < 0) {
            return -x;
        }
        return x;
    }

    private void runTask2_1() {
        System.out.println();
        System.out.println("[Задание 2 / Задача 1] Модуль числа");
        int x = readInt("Введите число: ");
        System.out.println("Результат: " + abs(x));
    }

    // Задача 2.2 — Безопасное деление
    public double safeDiv(int x, int y) {
        if (y == 0) {
            return 0;
        }
        return (double) x / y;
    }

    private void runTask2_2() {
        System.out.println();
        System.out.println("[Задание 2 / Задача 2] Безопасное деление");
        int x = readInt("Введите x: ");
        int y = readInt("Введите y: ");
        System.out.println("Результат: " + safeDiv(x, y));
    }

    // Задача 2.7 — Двойная сумма
    public int sum2(int x, int y) {
        int s = x + y;
        if (s >= 10 && s <= 19) {
            return 20;
        }
        return s;
    }

    private void runTask2_7() {
        System.out.println();
        System.out.println("[Задание 2 / Задача 7] Двойная сумма (10..19 -> 20)");
        int x = readInt("Введите x: ");
        int y = readInt("Введите y: ");
        System.out.println("Результат: " + sum2(x, y));
    }

    // Задача 2.8 — Возраст
    public String age(int x) {
        int lastTwo = x % 100;
        int lastOne = x % 10;

        if (lastTwo >= 11 && lastTwo <= 14) {
            return x + " лет";
        } else if (lastOne == 1) {
            return x + " год";
        } else if (lastOne >= 2 && lastOne <= 4) {
            return x + " года";
        } else {
            return x + " лет";
        }
    }

    private void runTask2_8() {
        System.out.println();
        System.out.println("[Задание 2 / Задача 8] Возраст");
        int x = readInt("Введите возраст: ");
        System.out.println("Результат: " + age(x));
    }

    // Задача 2.9 — День недели
    public String day(int x) {
        switch (x) {
            case 1: return "понедельник";
            case 2: return "вторник";
            case 3: return "среда";
            case 4: return "четверг";
            case 5: return "пятница";
            case 6: return "суббота";
            case 7: return "воскресенье";
            default: return "это не день недели";
        }
    }

    private void runTask2_9() {
        System.out.println();
        System.out.println("[Задание 2 / Задача 9] День недели");
        int x = readInt("Введите число от 1 до 7: ");
        System.out.println("Результат: " + day(x));
    }

    // МЕНЮ ЗАДАНИЯ 3
    private void menuTask3() {
        int c = -1;
        while (c != 0) {
            System.out.println();
            System.out.println("--------- ЗАДАНИЕ 3. ЦИКЛЫ ---------");
            System.out.println("3. Задача 3. Четные числа");
            System.out.println("5. Задача 5. Длина числа");
            System.out.println("7. Задача 7. Квадрат");
            System.out.println("8. Задача 8. Левый треугольник");
            System.out.println("9. Задача 9. Правый треугольник");
            System.out.println("0. Назад");
            System.out.println("------------------------------------");

            c = readInt("Выберите задачу: ");

            if (c == 3) {
                runTask3_3();
            } else if (c == 5) {
                runTask3_5();
            } else if (c == 7) {
                runTask3_7();
            } else if (c == 8) {
                runTask3_8();
            } else if (c == 9) {
                runTask3_9();
            } else if (c == 0) {
                System.out.println("Назад в главное меню.");
            } else {
                System.out.println("Неверный пункт.");
            }
        }
    }

    // Задача 3.3 — Чётные числа
    public String chet(int x) {
        String result = "";
        for (int i = 0; i <= x; i += 2) {
            result += i + " ";
        }
        return result.trim();
    }

    private void runTask3_3() {
        System.out.println();
        System.out.println("[Задание 3 / Задача 3] Чётные числа от 0 до x");
        int x = readInt("Введите x: ");
        System.out.println("Результат: " + chet(x));
    }

    // Задача 3.5 — Длина числа
    public int numLen(long x) {
        x = Math.abs(x);
        if (x == 0) {
            return 1;
        }
        int count = 0;
        while (x > 0) {
            x /= 10;
            count++;
        }
        return count;
    }

    private void runTask3_5() {
        System.out.println();
        System.out.println("[Задание 3 / Задача 5] Длина числа");
        int x = readInt("Введите число: ");
        System.out.println("Результат: " + numLen(x));
    }

    // Задача 3.7 — Квадрат
    public void square(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private void runTask3_7() {
        System.out.println();
        System.out.println("[Задание 3 / Задача 7] Квадрат из '*'");
        int x = readInt("Введите размер: ");
        square(x);
    }

    // Задача 3.8 — Левый треугольник
    public void leftTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private void runTask3_8() {
        System.out.println();
        System.out.println("[Задание 3 / Задача 8] Левый треугольник из '*'");
        int x = readInt("Введите высоту: ");
        leftTriangle(x);
    }

    // Задача 3.9 — Правый треугольник
    public void rightTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int s = 0; s < x - i; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private void runTask3_9() {
        System.out.println();
        System.out.println("[Задание 3 / Задача 9] Правый треугольник из '*'");
        int x = readInt("Введите высоту: ");
        rightTriangle(x);
    }

    // МЕНЮ ЗАДАНИЯ 4
    private void menuTask4() {
        int c = -1;
        while (c != 0) {
            System.out.println();
            System.out.println("--------- ЗАДАНИЕ 4. МАССИВЫ ---------");
            System.out.println("4.  Задача 4.  Добавление в массив");
            System.out.println("5.  Задача 5.  Добавление массива");
            System.out.println("6.  Задача 6.  Реверс");
            System.out.println("9.  Задача 9.  Все вхождения");
            System.out.println("10. Задача 10. Удалить негатив");
            System.out.println("0.  Назад");
            System.out.println("--------------------------------------");

            c = readInt("Выберите задачу: ");

            if (c == 4) {
                runTask4_4();
            } else if (c == 5) {
                runTask4_5();
            } else if (c == 6) {
                runTask4_6();
            } else if (c == 9) {
                runTask4_9();
            } else if (c == 10) {
                runTask4_10();
            } else if (c == 0) {
                System.out.println("Назад в главное меню.");
            } else {
                System.out.println("Неверный пункт.");
            }
        }
    }

    // Задача 4.4 — Добавление одного числа
    public int[] add(int[] arr, int x, int pos) {
        int[] res = new int[arr.length + 1];
        for (int i = 0; i < pos; i++) {
            res[i] = arr[i];
        }
        res[pos] = x;
        for (int i = pos; i < arr.length; i++) {
            res[i + 1] = arr[i];
        }
        return res;
    }

    private void runTask4_4() {
        System.out.println();
        System.out.println("[Задание 4 / Задача 4] Добавление числа x в позицию pos");
        int[] arr = readIntArray();
        System.out.println("Исходный: " + Arrays.toString(arr));
        int x = readInt("Введите число x: ");
        int pos = readInt("Введите позицию pos: ");
        System.out.println("Результат: " + Arrays.toString(add(arr, x, pos)));
    }

    // Задача 4.5 — Добавление массива
    public int[] add(int[] arr, int[] ins, int pos) {
        int[] res = new int[arr.length + ins.length];
        for (int i = 0; i < pos; i++) {
            res[i] = arr[i];
        }
        for (int i = 0; i < ins.length; i++) {
            res[pos + i] = ins[i];
        }
        for (int i = pos; i < arr.length; i++) {
            res[ins.length + i] = arr[i];
        }
        return res;
    }

    private void runTask4_5() {
        System.out.println();
        System.out.println("[Задание 4 / Задача 5] Добавление массива ins в arr");
        System.out.println("Ввод массива arr:");
        int[] arr = readIntArray();
        System.out.println("Ввод массива ins:");
        int[] ins = readIntArray();
        int pos = readInt("Введите позицию pos: ");
        System.out.println("Результат: " + Arrays.toString(add(arr, ins, pos)));
    }

    // Задача 4.6 — Реверс
    public void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    private void runTask4_6() {
        System.out.println();
        System.out.println("[Задание 4 / Задача 6] Реверс массива");
        int[] arr = readIntArray();
        System.out.println("До:    " + Arrays.toString(arr));
        reverse(arr);
        System.out.println("После: " + Arrays.toString(arr));
    }

    // Задача 4.9 — Все вхождения
    public int[] findAll(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        int[] res = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                res[index] = i;
                index++;
            }
        }
        return res;
    }

    private void runTask4_9() {
        System.out.println();
        System.out.println("[Задание 4 / Задача 9] Все вхождения числа x");
        int[] arr = readIntArray();
        int x = readInt("Введите число x: ");
        System.out.println("Результат: " + Arrays.toString(findAll(arr, x)));
    }

    // Задача 4.10 — Удалить негатив
    public int[] deleteNegative(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                count++;
            }
        }
        int[] res = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                res[index] = arr[i];
                index++;
            }
        }
        return res;
    }

    private void runTask4_10() {
        System.out.println();
        System.out.println("[Задание 4 / Задача 10] Удаление отрицательных");
        int[] arr = readIntArray();
        System.out.println("Результат: " + Arrays.toString(deleteNegative(arr)));
    }

    private int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Ошибка: нужно целое число. Повторите ввод.");
                scanner.next();
            }
        }
    }

    private char readChar(String prompt) {
        while (true) {
            System.out.print(prompt);
            String s = scanner.next();
            if (s.length() == 1) {
                return s.charAt(0);
            } else {
                System.out.println("Ошибка: введите один символ.");
            }
        }
    }

    private char readDigitChar(String prompt) {
        while (true) {
            char c = readChar(prompt);
            if (c >= '0' && c <= '9') {
                return c;
            } else {
                System.out.println("Ошибка: нужна цифра от '0' до '9'.");
            }
        }
    }

    private int[] readIntArray() {
        int n = readInt("Введите размер массива: ");
        int[] arr = new int[n];
        System.out.println("Введите " + n + " элементов:");
        for (int i = 0; i < n; i++) {
            arr[i] = readInt("  arr[" + i + "] = ");
        }
        return arr;
    }

    public static void main(String[] args) {
        Main lab = new Main();
        lab.run();
    }
}