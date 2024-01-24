import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    private static void PrintData(Iterable<Person> persons) {
        for (Person p : persons) {
            String message = p.toString() + " earns " + Double.toString(p.getPaymentAmount());
            System.out.println(message);
        }
    }

    public static void main (String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(
                new Employee("Oleg", "Lsp", "somePosition", 27.2F)
        );
        persons.add(
                new Employee("Adik", "Adikivich", "somePosition", 112.1F)
        );
        persons.add(
                new Student("Dias", "M", 31.1F)
        );

        Collections.sort(persons);
        PrintData(persons);
    }
}
