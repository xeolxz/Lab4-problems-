package instructor;

public class Subject {
    private static int nextId=1;
    private int id;
    private String code;
    private String title;
    public Subject(){
        this("CS-101","Introduction To Java");
    }
    public Subject(String code,String title){
        this.id=nextId;
        this.code=code;
        this.title=title;
        nextId++;
    }
    public int getId(){return id;}
    public String getCode(){return code;}
    public String getTitle(){return title;}
    public void setCode(String code){
        if(!code.isBlank()){
            this.code=code;
        }
    }
    public void setTitle(String title){
        if(!title.isBlank()){
            this.title=title;
        }
    }
    public String normalizedCode(){
        return code.trim().toUpperCase();
    }
    public String properTitle(){
        String[] words=title.split(" ");
        StringBuilder tmp=new StringBuilder();
        StringBuilder newTitle=new StringBuilder();
        for(String w: words) {
            w=w.toLowerCase();
            tmp=new StringBuilder(w.toUpperCase());
            newTitle.append(tmp.charAt(0));
            for(int i=1;i<tmp.length();i++){
                newTitle.append(w.charAt(i));
            }
            newTitle.append(" ");
        }
        return newTitle.toString();
    }
    public boolean isIntroCourse(){
        return (title.toLowerCase().contains("intro"))||(code.contains("INTRO-"));
    }
    public String syllabusLine(Instructor i){
        StringBuilder line=new StringBuilder();
        line.append(String.format("%s - %s (Instructor: %s %s)",code,title,i.getSecondName(),i.getFirstName()));
        return line.toString();
    }

}
