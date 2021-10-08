import java.util.ArrayList;
import java.util.List;

public class Education {

    public static void main(String[] args) {

        List<Double> firstGradeList = new ArrayList<>();
        firstGradeList.add(20.6);
        firstGradeList.add(12.4);
        firstGradeList.add(56.8);
        firstGradeList.add(42.1);
        firstGradeList.add(11.5);
        Student studentOne = new Student(firstGradeList);

        List<Double> secondGradeList = new ArrayList<>();
        secondGradeList.add(34.2);
        secondGradeList.add(78.2);
        secondGradeList.add(55.1);
        secondGradeList.add(22.1);
        secondGradeList.add(54.7);
        Student studentTwo = new Student(secondGradeList);

        List<Double> thirdGradeList = new ArrayList<>();
        thirdGradeList.add(82.3);
        thirdGradeList.add(67.5);
        thirdGradeList.add(88.5);
        thirdGradeList.add(43.3);
        thirdGradeList.add(77.3);
        Student studentThree = new Student(thirdGradeList);

        List<Double> fourthGradeList = new ArrayList<>();
        fourthGradeList.add(11.6);
        fourthGradeList.add(22.1);
        fourthGradeList.add(33.2);
        fourthGradeList.add(18.6);
        fourthGradeList.add(12.9);
        Student studentFour = new Student(fourthGradeList);

        List<Student> listOfStudents = new ArrayList<>();
        listOfStudents.add(studentOne);
        listOfStudents.add(studentTwo);
        listOfStudents.add(studentThree);
        listOfStudents.add(studentFour);

        System.out.println(studentOne.getAverageGrade());
        System.out.println(studentTwo.getAverageGrade());
        System.out.println(studentThree.getAverageGrade());
        System.out.println(studentFour.getAverageGrade());
        System.out.println("- - - - - - - - - - - - ");

        Lecture lectureOne = new Lecture();
        System.out.println(lectureOne.getHighestAverageGrade(listOfStudents));

    }
}
