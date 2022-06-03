package qa.guru;

public class Main {
    public static void main(String[] args) {

        //математические и логические операторы (записывать переменные необязазельно)
        System.out.println("Сложение:" + 5 + 20);
        System.out.println("Вычитание:" + (10 - 5));
        System.out.println(6 >= 12);
        System.out.println(10 != 11);
        System.out.println(3 < 2);
        System.out.println(3 <= 2);
        System.out.println(3 != 2);
        boolean result = 3 > 2; //громоздкий способ с объявлением переменной
        System.out.println(result);

        //вычисления с разными типами данных
        byte a = 10;
        int b = 5;
        long c = 100;
        short d = 250;
        double e = 0.5;

        System.out.println("a + b = " + (a + b));
        System.out.println("d - e = " + (d - e));
        System.out.println("d / c = " + (d / c));
        System.out.println("e * b = " + (e * b));

        float f = 4.24f;
        int g = 5;
        System.out.println("Большее число из 2 чисел: " + Math.max(f,g));
        System.out.println("Меньшее число из 2 чисел: " + Math.min(f,g));

        //операции переполнения
        //byte qbyte = 127 + 1; //переполнение
        //System.out.println(qbyte);

        //short qshort = 34_000_000; //переполнение

        //вычисления комбинаций типов данных (int и double)
        System.out.println("Сложение:" + 253 + 232.4);
        System.out.println("Вычитание:" + 211.85 + 232);
    }
}
