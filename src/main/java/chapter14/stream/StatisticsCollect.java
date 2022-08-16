package chapter14.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

class StudentInfo {
    public String name;
    public int score;

    public StudentInfo(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
public class StatisticsCollect {
    public static void main(String[] args) {
        StudentInfo student1 = new StudentInfo("choi", 88);
        StudentInfo student2 = new StudentInfo("mong", 54);

        ArrayList<StudentInfo> studentInfos = new ArrayList<>(Arrays.asList(student1, student2));

        Long collect = studentInfos.stream()
                .collect(Collectors.counting());

        System.out.println("collect = " + collect);

        Integer collect1 = studentInfos.stream()
                .collect(Collectors.summingInt(StudentInfo::getScore));
        System.out.println("collect1 = " + collect1);
    }
}
