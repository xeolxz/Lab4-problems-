package instructor;

import student.Person;

public class Instructor extends Person {
    private String employeeNumber;
    public Instructor(){
        super();
        this.employeeNumber="23";
    }
    public Instructor(String nom, String prenom, String telephone, String email,String employeeNumber){
        super(prenom,nom,telephone,email);
        this.employeeNumber=employeeNumber;
    }
    public String getEmployeeNumber(){return employeeNumber;}
    public void setEmployeeNumber(String employeeNumber){
        if(!employeeNumber.isBlank()){
            this.employeeNumber=employeeNumber;
        }
    }
    public String cleanEmployeeNumber(){
        return employeeNumber.trim().replaceAll(" ","");
    }
    public String summaryLine(){
        return String.format("Instructor[employeeNumber=%s, lastName=%s, firstName=%s]",employeeNumber,secondName,firstName);
    }
    public String toCard(){
        StringBuilder card=new StringBuilder();
        card.append("Instructor \n");
        card.append("---------- \n");
        card.append("Employee # : ");
        card.append(employeeNumber);
        card.append("\n");
        card.append("Name \t : ");
        card.append(secondName);
        card.append(",");
        card.append(firstName);
        card.append("\n");
        card.append("Email : ");
        card.append(email);
        card.append("\n");
        card.append("Phone : ");
        card.append(phone);
        return card.toString();
    }
    public String displayName(){
        StringBuilder result = new StringBuilder();
        if (firstName != null && !firstName.isBlank()) {
            result.append(firstName);
        }
        if (secondName != null && !secondName.isBlank()) {
            if (!result.isEmpty()) {
                result.append(" ");
            }
            result.append(secondName);
        }
        return result.toString();
    }
}
