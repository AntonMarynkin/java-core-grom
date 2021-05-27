package lesson8.homework.students;

public class Demo {

    static Student createHighestParent() {
        Student student = new Student("Serg", "Valera", 58, null);
        return student;
    }

    static SpecialStudent createLowestChild() {
        SpecialStudent specialStudent = new SpecialStudent("Nikolay", "Alex", 25, null);
        return specialStudent;
    }
}
