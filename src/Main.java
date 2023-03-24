import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        people.add(new Person ("Петр", "Васильевич", 34));          //6
        people.add(new Person ("Рамзан", "Хамид Оглы Ахмед", 39));  //1
        people.add(new Person ("Назар", "Аллаз Оглы", 17));         //4
        people.add(new Person ("Рамиль", "Мамед Ахмед Багет", 21)); //2
        people.add(new Person ("Ахмед", "Исмаил Отар", 58));        //3
        people.add(new Person ("Иван", "Вячеславович", 39));        //5

        Collections.sort(people, new PersonWordsSurnameComparator());

        System.out.println(people);
    }
}