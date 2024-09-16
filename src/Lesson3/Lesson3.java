package Lesson3;

import java.util.*;

public class Lesson3 {
    public static void main(String[] args) {
        stringExercise();
    }

    public static void massiveIntroduction(){
        int[] mass = new int[10]; // Инициализация пустого массива с длинной 10
        int[] posNumber = {1,2,10,3}; // Инициализация массива уже с заданными значениями

        // Базовая распечатка массива
        for (int i = 0;  i < posNumber.length; i++)
            System.out.println(posNumber[i]);

        // Распечатка через for_each
        for (int element: posNumber)
            System.out.println(element);

        // Установка значений в массив через цикл
        Random random = new Random();
        for (int i = 0; i < mass.length; i++)
            mass[i] = random.nextInt(-100, 200);

        // Поиск минимума, максимума, сумма, поиск
        int min = mass[0], max = mass[0], sum = 0, find_element=1, find_index = -1;
        for (int i = 0; i < mass.length; i++)
        {
            // min
            if (mass[i] < min)
                min = mass[i];
            // max
            if (mass[i] > max)
                max = mass[i];
            // sum
            sum += mass[i];
            // find
            if (mass[i] == find_element)
                find_index = i;
        }

        // То же самое, но через интерфейс потоков
        System.out.println("Минимум:" + min + "\nМаксимум:" + max + "\nСумма:" + sum);
        System.out.println("Минимум:" + Arrays.stream(mass).min().getAsInt() +
                           "\nМаксимум:" + Arrays.stream(mass).max().getAsInt() +
                           "\nСумма:" + Arrays.stream(mass).sum() +
                           "\nЭлемент " + find_element + " найден в позиции " + find_index);
    }

    public static void stringIntroduction(){
        String tmp = "test string";
        String tmp2 = "test string";
        // String tmp2 = new String("test string"); old style
        System.out.println(tmp.equals(tmp2)); // Такое сравнение более безопасно, т.к. String является объектом класса. Классы сравниваются методом equals
        System.out.println(tmp.toUpperCase()); // Приведение строки к верхнему регистру
        System.out.println(tmp.replace('t', 'a')); // Заменяет символ передаваемый первым параметром на символ передаваемый вторым параметром
        System.out.println(tmp.charAt(0)); // Получение символа по номеру позиции. Номера позиций начинаются с 0.
        System.out.println(tmp.indexOf('e')); // Поиск позиции символа в строке. То есть ищет первое вхождение символа в строку и возвращает позицию, если ничего не находит, вернет -1.
        System.out.println(tmp.lastIndexOf('e')); // Поиск позиции символа в строке. То есть ищет последнее вхождение символа в строку и возвращает позицию, если ничего не находит, вернет -1.
        System.out.println(tmp.substring(5)); // Вернет подстроку от 6 символа включительно до конца строки
        System.out.println(tmp.substring(5, 8)); // Вернет подстроку от 6 символа включительно до 8 не включительно.
        System.out.println(tmp.contains("str")); // Вернет true или false в зависимости от того, есть ли передаваемая аргументом строка внутри строки tmp

        String tmp3 = "   !!!, test !!!";
        System.out.println(tmp3.strip()); // Убирает все лишние пробелы в начале и конце строки работает для пробелов из любой кодировки
        System.out.println(tmp3.trim()); // Убирает все лишние пробелы в начале и конце строки работает для removes only characters <= U+0020 (space);

        System.out.println(tmp3.length()); // Возвращает длинну строки. То есть количество символов.
        System.out.println(tmp3.charAt(tmp3.length()-1)); // Получить последний символ
        System.out.println(tmp3.trim().length());
    }

    public static void stringExercise(){
        Dictionary<Character, Integer> vowelsDict = new Hashtable<>(); // Создадим словарь, чтобы вместо индексов использовались буквы
        // Далее определяем буквы и базовое значение(0)
        vowelsDict.put('а', 0);
        vowelsDict.put('у', 0);
        vowelsDict.put('и', 0);
        vowelsDict.put('э', 0);
        vowelsDict.put('ы', 0);
        vowelsDict.put('я', 0);
        vowelsDict.put('ю', 0);
        vowelsDict.put('е', 0);
        vowelsDict.put('ё', 0);
        int countVowels = 0;
        String vowels = "ауоиэыяюеё";
        String tmp = "Мама мыла раму, а папа читал газету";

        String[] words = tmp.split(" ");

        System.out.println("Количество слов: " + words.length);

        for (int i = 0; i < tmp.length(); i++) {
            if (vowels.contains(String.valueOf(tmp.charAt(i)))) {
                countVowels++;
                // Если буква глассная, то так-же увеличим значение словаря по этой букве на 1
                vowelsDict.put(tmp.charAt(i), vowelsDict.get(tmp.charAt(i)) + 1);
            }
        }

        System.out.println("Количество гласных в предложении: " + countVowels);

        System.out.println("Словарь букв:");

        var iterator = vowelsDict.keys().asIterator(); // Возьмем итератор ключей, чтобы перебрать словарь
        while (iterator.hasNext()) // Пока можем брать дальше
        {
            char symbol = iterator.next(); // Берем дальше ключ
            System.out.println(symbol + " : " + vowelsDict.get(symbol)); // Распечатаем сам ключ и распечатаем значение.
        }
    }
}
