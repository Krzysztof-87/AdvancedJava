package JavaZaawansowana;

public class UniversityTest {

    public static void main(String[] args) {


        Student student = new Student("Gabriela", "Krakow", "UE", 2, 2350);
        Staff staff = new Staff("Anna", "London", "EU affairs", 3500);
        String studentInfo = student.toString();
        System.out.println(studentInfo);
        String staffInfo = staff.toString();
        System.out.println(staffInfo);


    }

}
