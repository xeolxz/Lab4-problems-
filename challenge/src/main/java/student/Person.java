package student;

public class Person {
    private static int nextId = 1;
    protected int id;
    protected String firstName;
    protected String secondName;
    protected String phone;
    protected String email;
    public Person(){
        this("","","","");
    }
    public Person(String firstName, String secondName, String telephone, String email) {
        this.id = nextId++;
        this.firstName = firstName;
        // add others
        this.secondName=secondName;
        this.phone=telephone;
        this.email=email;
    }
    public int getId(){return  id;}
    public String getFirstName(){return firstName;}
    public String getSecondName(){return secondName;}
    public String getPhone(){return phone;}
    public String getEmail(){return email;}
    public void setFirstName(String fname){
        if(!fname.isBlank()){
            this.firstName=fname;
        }
    }
    public void setSecondName(String sname){
        if(!sname.isBlank()){
            this.secondName=sname;
        }
    }
    public void setPhone(String phone){
        if(!phone.isBlank()){
            this.phone=phone;
        }
    }
    public void setEmail(String email){
        if(!email.isBlank()){
            this.email=email;
        }
    }
    @Override
    public String toString(){
        return "id : "+id+" last name : "+secondName+" first name : "+firstName+" phone : "+phone+" email : "+email;
    }
}

