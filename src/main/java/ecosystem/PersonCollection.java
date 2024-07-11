package ecosystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonCollection {
    List<Person> personList = new ArrayList<>();

    public Optional<Person> findPersonByName(String name) {   // Optional <> = datentyp
        for (Person person : personList) {
            if (person.name().equals(name)) {      //name = getter aus person.java
                return Optional.ofNullable(person);
            }
        }
        return Optional.empty();}
}
