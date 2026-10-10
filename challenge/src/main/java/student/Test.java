package student;

import instructor.*;

public class Test {
    public static void main(String[] args) {
        Major cs = new Major();
        Major math = new Major("24", "Mathematics");


        Student s1 = new Student("SAFI", "Amal", "0600000001",
                "amal@example.com", "22885676", cs);

        Student s2 = new Student("ALAMI", "Samir", "0600000002",
                "samir@example.com", "23585976", cs);

        Student s3 = new Student("BENALI", "Sara", "0600000003",
                "sara@example.com", "12345678", math);

        // Display computer science students
        System.out.println("Computer Science students:");
        cs.displayStudents();

        System.out.println("=== Formatted full name ===");
        System.out.println(s1.getFullNameFormatted());
        System.out.println("\n=== Find student by CNE ===");
        Student found = cs.findStudentByCNE("23585976");

        if (found != null) {
            System.out.println("Student found: "
                    + found.getFullNameFormatted());
        } else {
            System.out.println("Student not found.");
        }


        System.out.println("\n=== Student count ===");
        System.out.println("CS students: " + cs.getStudentCount());

        System.out.println("\n=== Occupancy rate ===");
        System.out.println(cs.getOccupancyRate());

        System.out.println("\n=== Student list ===");
        System.out.println(cs.getStudentListAsString());

        System.out.println("\n=== Remove student ===");
        boolean removed = cs.removeStudent("22885676");
        System.out.println("Student removed: " + removed);

        System.out.println("CS students after removal: "
                + cs.getStudentCount());

        System.out.println("\n=== Updated student list ===");
        System.out.println(cs.getStudentListAsString());

        Instructor instructor = new Instructor(
                " AB 123 ",
                "Safi",
                "Amal",
                "amal@example.com",
                " AB 123 "
        );
        System.out.println("=== Clean Employee Number ===");
        System.out.println(instructor.cleanEmployeeNumber());
        System.out.println("\n=== Summary Line ===");
        System.out.println(instructor.summaryLine());
        System.out.println("\n=== Instructor Card ===");
        System.out.println(instructor.toCard());
        Subject subject = new Subject(
                " cs-101 ",
                "introduction to java"
        );
        System.out.println("=== Normalized Code ===");
        System.out.println(subject.normalizedCode());
        System.out.println("\n=== Proper Title ===");
        System.out.println(subject.properTitle());
        System.out.println("\n=== Intro Course? ===");
        System.out.println(subject.isIntroCourse());
        System.out.println("\n=== Syllabus Line ===");
        System.out.println(subject.syllabusLine(instructor));


        System.out.println(instructor.displayName());
    }
}

