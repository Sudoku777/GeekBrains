package ru.geekbrains.home_works;

public class LessonOne extends Main {
    /* 2. Создать переменные всех пройденных типов данных и
    инициализировать их значения.
    */
    static void one() {
        boolean bo = false;
        byte bt = 0;
        char c = 'x';
        short s = 123;
        int i = 1234;
        long l = 12345L;
        float f = 123.0f;
        double d = 123.456;
        System.out.println("boolean " + bo);
        System.out.println("byte " + bt);
        System.out.println("char " + c);
        System.out.println("short " + s);
        System.out.println("int " + i);
        System.out.println("long " + l);
        System.out.println("float " + f);
        System.out.println("double " + d);
    }

    /*
     3.Написать метод вычисляющий выражение a * (b + (c / d)) и
     возвращающий результат,
     где a, b, c, d – входные параметры этого метода.
      */
    static int calculate(int a, int b, int c, int d) {
        int result = a * (b + (c / d));
        return result;
    }

    /*
     4.Написать метод, которому в качестве параметра передается целое число,
     метод должен напечатать в консоль, положительное ли число передали или отрицательное.
     Замечание: ноль считаем положительным числом.
      */
    static boolean doFive(int a) {
        if (a < 0) {
            return true;
        }
        return false;
    }

    /*
    5.Написать метод, принимающий на вход два числа и
    проверяющий, что их сумма лежит в пределах от 10 до 20
    (включительно), если да – вернуть true, в противном случае – false.
    */
    static boolean five(int a, int b) {
        int sum = a + b;
        if (sum > 10 && sum < 20) {
            return true;
        } else {
            return false;
        }
    }

    /*
    6.Написать метод, которому в качестве параметра передается целое число.
    Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
     */
    static boolean bl(int a) {
        if (a > 0) return true;
        return false;
    }

    /*
    7.Написать метод, которому в качестве параметра передается строка,
    обозначающая имя. Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
     */
    static void str(String name) {

        System.out.println("\nHello, " + name + " ! ");
    }
}