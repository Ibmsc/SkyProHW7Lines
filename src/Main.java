import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("HomeWork7 Lines");
        System.out.println("Задача №1!");
        /* Бухгалтерия попросила написать программу, в которой можно работать с Ф.И.О. сотрудников.
        первая с именем firstName — для хранения имени;
        вторая с именем middleName — для хранения отчества;
        третья с именем lastName — для хранения фамилии;
        четвертая с именем fullName — для хранения Ф.И.О. сотрудника в формате "Фамилия Имя Отчество".
        Выведите в консоль фразу: “ФИО сотрудника — ….”
        В качестве данных для задачи используйте “Ivanov Ivan Ivanovich”.
       */
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = "Ivanov Ivan Ivanovich";

        System.out.println("ФИО сотрудника - " + fullName);

        System.out.println("Задача №2!");
        /*Напишите программу, которая изменит написание Ф. И. О. сотрудника с
        “Ivanov Ivan Ivanovich” на полностью заглавные буквы.
         В качестве строки с исходными данными используйте строку fullName.
         Результат программы выведите в консоль в формате: ”Данные ФИО сотрудника для заполнения отчета — …”
        */
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase(Locale.ROOT));

        System.out.println("Задача №3!");
        /*Система, в которой мы работаем, не принимает символ “ё”.
        Поэтому нам нужно написать программу, которая заменяет символ “ё” на символ “е”.
        В качестве исходных данных используйте строку fullName и данные в ней “Иванов Семён Семёнович”
        Выведите результат программы в консоль в формате: ”Данные ФИО сотрудника — ...”
         */

       String fullName2 = "Иванов Семён Семёнович";

       // System.out.println(fullName2.replace('ё', 'е'));


        if (fullName2.contains("ё")) {
            System.out.println("Ввели неправильную буква 'Ё', нужно заменить на 'Е'!");
        } else {
            System.out.println("Все хорошо");

    }
}}