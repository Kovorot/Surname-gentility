import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        people.add(new Person("Петр", "Васильевич", 34));                    //8
        people.add(new Person("Рамзан", "Хамид Оглы Ахмед", 39));            //1
        people.add(new Person("Назар", "Аллаз Оглы", 17));                   //5
        people.add(new Person("Рамиль", "Мамед Ахмед Багет", 21));           //3 (Я устал придумывать длинные фамилии)
        people.add(new Person("Ахмед", "Исмаил Отар", 58));                  //4
        people.add(new Person("Иван", "Вячеславович", 39));                  //7
        people.add(new Person("Рамзес", "Хатам Ибрагим Ахмед Магомед", 25)); //2
        people.add(new Person("Оксана", "Вячеславовна", 17));                //9
        people.add(new Person("Владимир", "Фон Барон", 8));                  //6

        Collections.sort(people, new PersonWordsSurnameComparator(3));

        System.out.println(people);
    }
}