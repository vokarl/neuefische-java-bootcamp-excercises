package ecosystem.lombock;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor


public class Course {
    private int id;
    private String name;
    private Teacher teacher;
    private List<Student> students;
}


