package unitat3;

import java.util.List;

public class Course {
    private List<Student> students;

    public Course(List<Student> students) {
        this.students = students;
    }

    public int countStudents() {
        return students.size();
    }
}