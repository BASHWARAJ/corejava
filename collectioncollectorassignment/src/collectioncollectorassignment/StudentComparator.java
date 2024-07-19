package collectioncollectorassignment;

import java.util.Comparator;

public class StudentComparator {
    public static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);

    public static Comparator<Student> rollNoComparator = Comparator.comparing(Student::getRollNo);
}
