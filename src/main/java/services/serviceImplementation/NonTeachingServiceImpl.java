package services.serviceImplementation;

import model.Person;
import services.NonTeachingService;
import utilities.Display;
import utilities.PersonData;

import java.util.ArrayList;

public class NonTeachingServiceImpl implements NonTeachingService {
    @Override
    public void displaySalaryPayroll(Person nonTeacher) {
        if(nonTeacher.getRole().equalsIgnoreCase("Non_Teaching_Staff")) {
            ArrayList<String> teachersData = PersonData.getTeachersDetails();
            ArrayList<String> nonTeachingStaffData = PersonData.getNonTeachingStaffs();
            Display.displaySalaryPayroll(teachersData, nonTeachingStaffData);
        }

    }

    @Override
    public void displayStudentLists(Person nonTeacher) {

        if(nonTeacher.getRole().equalsIgnoreCase("Non_Teaching_Staff")) {
            ArrayList<String> studentsData = PersonData.getStudentDetails();
            Display.displayStudentsList(studentsData);
        }
    }

    @Override
    public void displayTeachersLists(Person nonTeacher) {
        if(nonTeacher.getRole().equalsIgnoreCase("Non_Teaching_Staff")) {
            ArrayList<String> teachersData = PersonData.getTeachersDetails();
            Display.displayTeachersList(teachersData);
        }
    }

    @Override
    public void displayNonTeachingStaffLists(Person nonTeacher) {
        if(nonTeacher.getRole().equalsIgnoreCase("Non_Teaching_Staff")) {
            ArrayList<String> nonTeachersData = PersonData.getNonTeachingStaffs();
            Display.displayNonTeachersList(nonTeachersData);
        }else{
            System.out.println("Something");
        }
    }
}
