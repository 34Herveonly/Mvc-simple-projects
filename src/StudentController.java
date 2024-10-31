public class StudentController {
    private Student model;
    private StudentView view;
public StudentController(Student model, StudentView view) {
    this.model = model;
    this.view = view;
}
public void setStudentName(String name) {
    model.setName(name);
}
public void setStudentRegNumber(String regNumber) {
    model.setRegNumber(regNumber);
}
public void setAge(int age) {
    model.setAge(age);
}
public String getStudentName(){
    return model.getName();
}

    public String getStudentRegNumber(){
        return model.getRegNumber();
    }

    public int getAge(){
        return model.getAge();
    }
    public void updateView(){
    view.printStudentDetails(model.getName(), model.getRegNumber(), model.getAge());

    }
}

