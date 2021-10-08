import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getAverageGrade() {
        List<Double> gradeStore = new ArrayList<>();
        gradeStore.add(20.5);
        gradeStore.add(12.4);
        gradeStore.add(56.8);
        gradeStore.add(42.1);
        gradeStore.add(11.3);

        Student testStudent = new Student(gradeStore);

        double averageGrade = testStudent.getAverageGrade();

        assertEquals(28.619999999999997, averageGrade, "should return 28.619999999999997");
        assertEquals(28.619444399999997, averageGrade, "should return 28.619999999999997");
    }
}