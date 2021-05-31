package Lesson1.Online;

/* Презентация "Что такое исключения". Иллюстрация проблемы */
public class Demo1 {

    public static void main(String[] args) {
        System.out.println(division(6, 2));
        System.out.println(division(6, 0));
    }

    private static int division(int a, int b) {
        return a / b;
    }
}


/*
    Рассмотрим пример с методом для деления двух чисел. Какие потенциальные проблемы вы видите?
    -------------------------------------------------------------------------------------------
        private static int div(int a, int b) {
            return a / b;
        }
    -------------------------------------------------------------------------------------------
    При вызове метода будут проблемы при передаче 0 качестве делителя

    -- Демонстрация исключения при запуске
    -- Разобрать стек вызова
    -- Показать класс ArithmeticException - обычный Java класс => исключение - объект

    Стандартное поведение - прекращение работы при получении исключения. Для того чтобы программа продолжала работать
    после непредвиденной ситуации, программисту требуется обработать исключение, но об этом - позже.
 */