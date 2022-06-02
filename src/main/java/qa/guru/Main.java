package qa.guru;

public class Main {
    public static void main(String[] args) {

        //математические и логические операторы
        System.out.println(5 + 20);
        System.out.println(10 - 5);
        System.out.println(6 >= 12);
        System.out.println(10 != 11);

        //операции переполнения
        byte qbyte = 127 + 1;
        System.out.println(qbyte);

        int qint = 2147483647 * 13;
        System.out.println(qint);


    }
}
