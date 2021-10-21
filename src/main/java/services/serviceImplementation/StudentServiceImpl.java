package services.serviceImplementation;

import model.Class;
import model.Person;
import services.StudentService;

public class StudentServiceImpl implements StudentService {
    @Override
    public void takeCourse(Person student, String courseName) {
        if(student.getRole().equalsIgnoreCase("Student")){
            String studentClass = Class.returnClass();
            System.out.println("Your course for today is " + studentClass);
        }
        else {
            System.out.println("You are not a student");
        }

    }
}
