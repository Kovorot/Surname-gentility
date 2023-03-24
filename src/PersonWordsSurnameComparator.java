import java.util.Comparator;

public class PersonWordsSurnameComparator implements Comparator<Person> {
    private final int maxWordAmount;

    //Ограничение по количеству слов в фамилии
    public PersonWordsSurnameComparator(int maxWordAmount) {
        this.maxWordAmount = maxWordAmount;
    }

    //Основной метод
    @Override
    public int compare(Person o1, Person o2) {
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
    }
}
