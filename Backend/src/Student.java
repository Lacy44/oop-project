public class Student extends Person{
    private String university;

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
    public void showInfo(){
        super.showInfo();
        System.out.println(" "+university);
    }
}
