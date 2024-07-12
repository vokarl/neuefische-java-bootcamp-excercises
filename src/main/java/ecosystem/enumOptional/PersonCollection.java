package ecosystem.enumOptional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonCollection {
    List<Person> personList = new ArrayList<>();

    public Optional<Person> findPersonById(int Id) {
        for (Person person : personList) {
            if (person.id() == (Id)) {
                return Optional.ofNullable(person);
            }
        }
        return Optional.empty();
    }
}
