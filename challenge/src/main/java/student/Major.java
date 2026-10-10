package student;

public class Major {
    private static int nextId = 1;
    private int id;
    private String code;
    private String name;
    private Student[] students;
    private int studentCount;
    public Major(){
        this("23","Computer Science");
    }
    public Major(String code, String name) {
        this.code=code;
        this.name=name;
        this.students=new Student[50];
        this.studentCount=0;
        this.id=nextId;
        nextId++;
    }

    // Method to add a student
    public void addStudent(Student s) {
        if(studentCount<50){
            students[studentCount]=s;
            studentCount++;
        }
    }
//
    // Getters
    public int getId(){return  id;}
    public String getCode(){return code;}
    public String getName(){return name;}
    public int getStudentCount(){return studentCount;}
    public void setCode(String code){
        if(!code.isBlank()){
            this.code=code;
        }
    }
    public void setName(String name){
        if(!name.isBlank()){
            this.name=name;
        }
    }
    // Display all students in the major
    public void displayStudents() {
        for(int i=0;i<studentCount;i++){
            System.out.println(students[i]);
        }
    }
    @Override
    public String toString(){
        return "id : "+ id +" code : "+code+" name : "+name;
    }
    public Student findStudentByCNE(String cne){
        for(Student s : students){
            if(s.getCne().equals(cne)){
                return s;
            }
        }
        return null;
    }
    public boolean removeStudent(String cne){
        if(findStudentByCNE(cne)!=null){
            int idx=0;
            for(int i=0;i<studentCount;i++){
                if(students[i].getCne().equals(cne)){
                    idx=i;
                    break;
                }
            }
            students[idx]=null;
            for(int i=0;i<students.length-1;i++){
                Student tmp=students[i];
                students[i]=students[i+1];
                students[i+1]=tmp;
            }
            studentCount--;
            return true;
        }
        return false;
    }
    public String getOccupancyRate(){
        String capacity=String.format("%s capacity : 50 students \n",this.getName());
        String enrol=String.format("Current enrollment : %d students \n", studentCount);
        String occupancy=String.format("Occupancy rate : %.1f%% \n", (studentCount * 100) / 50.0);
        return capacity+enrol+occupancy;
    }
    public StringBuilder getStudentListAsString(){
        StringBuilder total=new StringBuilder();
        for(int i=0;i<studentCount;i++){
            total.append(students[i].toString());
        }
        return total;
    }
}
