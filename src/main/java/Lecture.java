import java.util.List;

    // the relationship between the Lecture and the Student is that of aggregation and nothing else
    // that is to say, the student can take the lecture, but does not solely rely on the lecture
    // both can exist independent of each other

public class Lecture {

    // enter function
    void enter(Student student) { }

    // get highest average grade function
    double getHighestAverageGrade(List<Student> students) {
        double highestAverage = 0;

        for (Student student : students) {
            double studentHighestAverage = student.getAverageGrade();

            if (studentHighestAverage > highestAverage) {
                highestAverage = studentHighestAverage;
            }
        }

        return highestAverage;
    }

}
