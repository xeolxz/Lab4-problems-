package student;

public class Student extends Person {
    private String cne;
    private Major major;
    public Student(){
        this("","","","","",new Major());
    }
    public Student(String nom, String prenom, String telephone, String email, String cne, Major major) {
        super(prenom,nom,telephone,email);
        this.cne=cne;
        if(major.getStudentCount()<50){
            this.major=major;
            major.addStudent(this);
        }else{
            System.out.println("This major is full");
            this.major=new Major();
            this.major.addStudent(this);
        }
    }
    public Student(String nom, String prenom, String telephone, String email, String cne) {
        super(prenom,nom,telephone,email);
        this.cne=cne;
        this.major=new Major();
        this.major.addStudent(this);
    }

    // Getters
    public String getCne(){return cne;}
    public Major getMajor(){return major;}
    // Setters
    public void setCne(String cne){this.cne=cne;}
    public void setMajor(Major major){
        if(major.getStudentCount()<50){
            this.major=major;
            major.addStudent(this);
        }else{
            System.out.println("This major is full");
        }
    }
    @Override
    public String toString(){
        return String.format("%d. \t %s %s %s",id,cne,secondName,firstName);
    }
    public String getFullNameFormatted(){
        return String.format("%s, %s",secondName.toUpperCase(),firstName);
    }

}

