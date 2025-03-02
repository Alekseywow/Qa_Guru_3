package qaGuru;

import java.util.List;

public class Main {

    public static void main (String[] arqs) {
//        // Целочисленные типы: отличаются диапазонами
//        byte  aByte = 0;  // -128 + 127          8б
//        short aShort = 0; // -32768 + 32767     16б
//        int aInt = 0;     // -14 много              32б
//        long aLong = 0L;   // много                64б
//
//        // Типы с плавающей точкой
//        float aFloat = 0.0F;
//        double aDouble = 0.0;
//
//        // Символьный тип
//        char aChar = 'a'; // является целочисленным
//
//        // Логический тип
//        boolean aBoolean = true;
//
//        // Строка ( и бесконечность других объектных/ссылочных типов)
//        String toBePrint = "Hello world!";
//        List<String> teachers = List.of("Blabla", "Lala");
//
//        System.out.println(toBePrint);
//
//        //Пример описания чашки
//        class Cup {
//            String color = "grey";
//            int capacity = 250;
//            boolean hasHandle = true;
//        }
//
//        //Операторы
//        // Оператор присвоения =
//        String name = "ALeksey";

        //Арифметический оператор +  -  /  *  %  ++  --
//        System.out.println(4.0 + 3); // 7.0
//        System.out.println(4.0 / 3); // 1.333333333
//        System.out.println(4 / 3); // 1
//        System.out.println(5 / 3); // 1
//        System.out.println(5 % 3); // 2
//        int result = ++aInt; // 1
//        int result1 = --aInt; // -1

        //Операторы сравнения > , < , >= , <= , != , ==
//        System.out.println(3 > 2); // true
////        System.out.println(3 = 2); // false
//        System.out.println(3 != 2); // true
//        System.out.println(3 >= 2); // true
//        System.out.println(3 <= 2); // false

        //Объектные типы нельзя сравнивать операторами, их нужно сравнивать методом eaquls: пример
//        System.out.println(nameFirst.equals(nameSecond));

        //Логические операторы & , | , && , || , ! позволяют группировать несколько boolean значений и получать результа
        //Прмиер:
        String nameSpace = "Aleksey";
        int myAge = 30;

//        System.out.println(nameSpace.equals("Aleksey") && myAge == 30); // true
//        System.out.println(nameSpace.equals("Aleksey") && myAge == 34); // false

//        if (nameSpace != null && nameSpace.length() == 5) {
//            System.out.println("Удача");
//        }

//        System.out.println(nameSpace.equals("Aleksey") || myAge == 77); // true
//        System.out.println(!(nameSpace.equals("Aleksey") || myAge == 77)); // false, восклицательный знак инвертирует ответ
//

//        // Оператор instanceof
//        System.out.println(nameSpace instanceof  String); // true
//        System.out.println(!(nameSpace instanceof  String)); // false

        // Тернарный операвтор

        char sex = 'm';

        String childName = sex == 'm'
                ? "Valentin"
                : "Valentina";

        // Управляющая конструкция if

        if (sex == 'm') {
            childName = "Valentin";
        } else if(sex == 'w'){
            childName = "Valentina";
        } else {
            System.out.println(":(");
        }

        // Ключевое слово new ( позволяет создавать в программе, объекты, значение которое хранит в себе значение уже в созданном классе)

        String name = new String("Aleksey");
        String aName = new String("Aleksey");



    }



}
