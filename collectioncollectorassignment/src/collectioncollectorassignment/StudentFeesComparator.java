package collectioncollectorassignment;

import java.util.Comparator;

public class StudentFeesComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getFees(), s2.getFees());
    }
}
