import java.util.List;

public class Student {

    List<Double> internalGrades;

    Student(List<Double> grades) {
        this.internalGrades = grades;
    }

    public double getAverageGrade() {
        double totalGrade = 0, average;

        // looping through the grades
        for (double grade: internalGrades) {
            totalGrade += grade;
        }

        // calculating the average
        average = totalGrade / internalGrades.size();
        return average;
    }

}
