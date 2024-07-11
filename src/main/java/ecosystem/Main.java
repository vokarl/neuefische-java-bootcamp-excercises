package ecosystem;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        DaysOfWeek currentDay = DaysOfWeek.SATURDAY;
        System.out.println(currentDay.weekDayChecker());

        PersonCollection personCollection = new PersonCollection();
        personCollection.personList.add(new Person(1, "Alice", DaysOfWeek.MONDAY));
        personCollection.personList.add(new Person(2, "Bob", DaysOfWeek.FRIDAY));


        Optional<Person> foundPerson = personCollection.findPersonByName("Al");
        Optional<Person> foundPerson2 = personCollection.findPersonByName("Alice");

        // Verarbeitung des Optionals
        if (foundPerson.isPresent()) {
            System.out.println("Person gefunden: " + foundPerson.get());
        } else {
            System.out.println("Person nicht gefunden.");
        }




    }
}
