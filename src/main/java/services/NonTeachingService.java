package services;

import model.Person;

public interface NonTeachingService {

    public void displaySalaryPayroll(Person nonTeacher);

    public void displayStudentLists(Person nonTeacher);

    public void displayTeachersLists(Person nonTeacher);

    public void displayNonTeachingStaffLists(Person nonTeacher);
}
