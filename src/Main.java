import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        people.add(new Person("Петр", "Васильевич", 34));                    //7
        people.add(new Person("Рамзан", "Хамид Оглы Ахмед", 39));            //1
        people.add(new Person("Назар", "Аллаз Оглы", 17));                   //5
        people.add(new Person("Рамиль", "Мамед Ахмед Багет", 21));           //3 (Я устал придумывать длинные фамилии)
        people.add(new Person("Ахмед", "Исмаил Отар", 58));                  //4
        people.add(new Person("Иван", "Вячеславович", 39));                  //6
        people.add(new Person("Рамзес", "Хатам Ибрагим Ахмед Магомед", 25)); //2

        Comparator<Person> comparator = (o1, o2) -> {
            int maxWordAmount = 3;
            String[] parts1 = o1.getSurname().split(" ");
            String[] parts2 = o2.getSurname().split(" ");
            if (parts1.length >= maxWordAmount && parts2.length >= maxWordAmount) {
                return (Integer.compare(o1.getAge(), o2.getAge())) * -1;
            } else if (parts1.length > parts2.length) {
                return -1;
            } else if (parts1.length < parts2.length) {
                return 1;
            } else {
                return (Integer.compare(o1.getAge(), o2.getAge())) * -1;
            }
        };

        Collections.sort(people, comparator);
        System.out.println(people);
    }
}