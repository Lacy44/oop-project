public class Teacher extends Person{
    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public void showInfo(){
        super.showInfo();
        System.out.println(" "+subject);
    }
}
