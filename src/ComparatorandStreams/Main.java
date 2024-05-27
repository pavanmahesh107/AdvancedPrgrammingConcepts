package ComparatorandStreams;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Pavan", 15, 76),
                new Student("Mahesh", 17, 87),
                new Student("Radha", 12, 98),
                new Student("Rupa", 15, 89)
        );
        //Comparator
        Comparator<Student> comparator = (st1, st2) -> st2.marks - st1.marks;
        Collections.sort(students, comparator);
        System.out.println(students);

        List<Student> studentList = students.stream().filter((student) -> student.marks > 85).toList();
        System.out.println(studentList);


        //The above code is Enhanced into single line.
        //Iterate over the list and get the marks of each student.
        //System.out.println(students.stream().filter((student) -> student.marks < 80).toList());

        //Using map method in streams
        System.out.println(students.stream().map((student) -> student.marks).toList());

        System.out.println(students.stream().map((student) -> student.rollnumber).toList());

        List<String> stringList = Arrays.asList("Pavan","Mahesh","rachapudi","Ganesh","Rupa","Umasree","Radha");
        System.out.println(stringList.stream().filter((names) -> names.length() >6 ).toList());
        //Count the number of words with length greater than 6
        System.out.println(stringList.stream().filter((names) -> names.length() >6 ).count());

        //Convert the list of words into UPPER CASE
        System.out.println(stringList.stream().map((word) -> word.toUpperCase()).toList());

        System.out.println(stringList.stream().map(String::toUpperCase).toList());

        //Both the lines are same.
    }
}
