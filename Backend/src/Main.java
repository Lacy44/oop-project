//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student=new Student();
        student.setUniversity("ADNSU");
        student.setYas(19);
        student.setAd("Lamie");

        student.showInfo();

        Teacher teacher=new Teacher();
        teacher.setSubject("OOP");
        teacher.setAd("AIDAN");
        teacher.setYas(36);
       
        teacher.showInfo();


    }
}