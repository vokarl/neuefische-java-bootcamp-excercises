package time;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.time.LocalDate;

@AllArgsConstructor
@Data
public class Animal {
    private LocalDate birthday;
    private String name;


    public static void main(String[] args) {
        Animal birthdayAnimal = new Animal(LocalDate.of(2013,11, 2), "joe");
    }

}


