package chapter14.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


class MapDto {
    public String name;
    public Integer grade;
    public String schoolName;

    public MapDto(String name, Integer grade, String schoolName) {
        this.name = name;
        this.grade = grade;
        this.schoolName = schoolName;
    }
}

class Student {
    public String name;
    public Integer grade;
    public String schoolName;
    public String department;
    public String nickName;

    public Student(String name, Integer grade, String schoolName, String department, String nickName) {
        this.name = name;
        this.grade = grade;
        this.schoolName = schoolName;
        this.department = department;
        this.nickName = nickName;
    }

    public String getName() {
        return name;
    }

    public Integer getGrade() {
        return grade;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public String getDepartment() {
        return department;
    }

    public String getNickName() {
        return nickName;
    }
}

public class MapTest {
    public static void main(String[] args) {
        Student student1 = new Student("홍길동", 4, "힘들대", "컴공", "길동");
        Student student2 = new Student("전우치", 2, "어딘대", "마술학과", "우치");

        List<Student> list = new ArrayList<>(List.of(student1, student2));

        Stream<MapDto> stream = list.stream()
                .map(student -> new MapDto(student.getName(), student.getGrade(), student.getSchoolName()));
        stream.forEach(mapDto -> System.out.println(mapDto.name));

    }
}
