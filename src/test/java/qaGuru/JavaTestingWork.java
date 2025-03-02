package qaGuru;

import java.util.List;

public class JavaTestingWork {
    public static void main(String... args) {

        // Целочисленные типы
        byte aByte = 0;  // 8b   -128 + 127
        short aShort = 0; // 16b  -32768 +32767
        int aInt = 0;     // 32b  -2,147,483,648 до 2,147,483,647
        long aLong = 0L;  // 64b  -9,223,372,036,854,775,808 до 9,223,372,036,854,775,807

        // Типы с плавающей точкой
        float aFloat = 0.0F;
        double aDouble = 0.0;

        // Символьный
        char aChar = 'a';

        // Логически тип
        boolean aBoolean = true;

        // Строка (и бесконечность других объектных/ссылочных типов)
        String toBePrint = "Hello world!";
        System.out.println(toBePrint);
        List<Integer> teachers = List.of(10, 20);

        byte byteMax = 127;
        byte byteMin = -128;

        // Переполнение: добавление к максимальному значению
        byte overflowByte = (byte) (byteMax + 1);  // Ожидается -128
        System.out.println("Переполнение byte (127 + 1): " + overflowByte);

        // Переполнение: вычитание от минимального значения
        byte underflowByte = (byte) (byteMin - 1); // Ожидается 127
        System.out.println("Переполнение byte (-128 - 1): " + underflowByte);

        byte b = 69;
        short s = 43;
        int i = 150;
        long l = 2000L;
        float f = 49.4F;
        double d = 49.4;
        System.out.println("");
        System.out.println("Операторы арифметики +, -, *, /, %");
        System.out.println(b + " + " + s + " = " + (b + s));
        System.out.println(i + " + " + d + " = " + (i + d));
        System.out.println(b + " - " + s + " = " + (b - s));
        System.out.println(b + " * " + i + " = " + (b * i));
        System.out.println(i + " / " + b + " = " + (i / b));
        System.out.println(l + " / " + s + " = " + (l / s) + " Остаток: " + (l % s));
        System.out.println("");
        System.out.println("Операторы сравнения >, <, >=, <=, !=, ==");
        System.out.println(b + " > " + s + " = " + (b > s));
        System.out.println(b + " < " + s + " = " + (b < s));
        System.out.println(b + " >= " + s + " = " + (b >= s));
        System.out.println(b + " <= " + (s + 26) + " = " + (b <= (s+26)));
        System.out.println(b + " != " + b + " = " + (b != b));
        System.out.println("Пример сравнения float и double");
        System.out.println(f + " == " + d + " = " + (f == d));
        System.out.println("Комбинаций типов данных (int и double)");
        System.out.println(i + " + " + d + " = " + (i + d));
    }
}
