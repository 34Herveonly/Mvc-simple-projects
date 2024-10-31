import java.util.*;
public class DemoMVC {
    public static void main(String[] args) {
        Student model=StudentInfo();
        StudentView studentView=new StudentView();
        StudentController controller=new StudentController(model,studentView);
        controller.updateView();
    }

    private static Student StudentInfo(){
        Student student=new Student();
        student.setName("Mukiza Fiston");
        student.setRegNumber("22200459007");
        student.setAge(22);
        return student;
      /*  Scanner sc = new Scanner(System.in);
        System.out.print("Enter Full Name: ");
        String fullName = sc.nextLine();
        System.out.print("Registration Number: ");
        String regNum = sc.nextLine();
        System.out.println("How old are you?: ");
        int age = sc.nextInt();
        System.out.println(fullName+" "+regNum+" "+age);
        return null;*/

    }
}
