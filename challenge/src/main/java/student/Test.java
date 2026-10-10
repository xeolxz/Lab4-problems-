package student;

public class Test {
    public static void main(String[] args) {
        // 1. Create majors
        Major cs = new Major();
        Major math = new Major("24", "Mathematics");

        // 2. Create students
        Student s1 = new Student("SAFI", "Amal", "0600000001",
                "amal@example.com", "22885676", cs);

        Student s2 = new Student("ALAMI", "Samir", "0600000002",
                "samir@example.com", "23585976", cs);

        Student s3 = new Student("BENALI", "Sara", "0600000003",
                "sara@example.com", "12345678", math);

        // Display computer science students
        System.out.println("Computer Science students:");
        cs.displayStudents();

        // 3. Test getFullNameFormatted()
        System.out.println("=== Formatted full name ===");
        System.out.println(s1.getFullNameFormatted());
        // Expected: SAFI, Amal

        // 4. Test findStudentByCNE()
        System.out.println("\n=== Find student by CNE ===");
        Student found = cs.findStudentByCNE("23585976");

        if (found != null) {
            System.out.println("Student found: "
                    + found.getFullNameFormatted());
        } else {
            System.out.println("Student not found.");
        }


        // 5. Test getStudentCount()
        System.out.println("\n=== Student count ===");
        System.out.println("CS students: " + cs.getStudentCount());

        // 6. Test getOccupancyRate()
        System.out.println("\n=== Occupancy rate ===");
        System.out.println(cs.getOccupancyRate());

        // 7. Test getStudentListAsString()
        System.out.println("\n=== Student list ===");
        System.out.println(cs.getStudentListAsString());

        // 8. Test removeStudent()
        System.out.println("\n=== Remove student ===");
        boolean removed = cs.removeStudent("22885676");
        System.out.println("Student removed: " + removed);

        // 9. Verify the removal
        System.out.println("CS students after removal: "
                + cs.getStudentCount());

        System.out.println("\n=== Updated student list ===");
        System.out.println(cs.getStudentListAsString());

    }
}

