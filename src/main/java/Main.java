import model.Person;
import services.NonTeachingService;
import services.PrincipalService;
import services.StudentService;
import services.TeacherService;
import services.serviceImplementation.NonTeachingServiceImpl;
import services.serviceImplementation.PrincipalServiceImpl;
import services.serviceImplementation.StudentServiceImpl;
import services.serviceImplementation.TeacherServiceImpl;

import javax.naming.NoPermissionException;

public class Main {

    public static void main(String[] args) throws NoPermissionException {
/**
 * Student, Teacher, Non_teaching staff instance can't be created now,
 * Throws an error cause they haven't passed through recruitment or admission stage
 *   for instance the student instance
 *   Person student = new Person(22, "John", "Student", "Male"); throws Student can't login
 *
 */

        // Admitting teachers, teachers can login and perform some actions
        Person teacher1 = principalAdmitApplicant("Chadwick John", "Teacher",29, "Male");
        Person teacher2 = principalAdmitApplicant("Osten Jonathan", "Teacher", 32, "Male");
        Person teacher3 = principalAdmitApplicant("Johnson Kurt", "Teacher", 24, "Male");

//        TeacherService teacherActions = new TeacherServiceImpl();
//
//        teacherActions.applyForCourse(teacher1);

//        teacherActions.applyForCourse(teacher2);
//        teacherActions.courseContents(teacher2);
//        teacherActions.applyForCourse(teacher3);
//        teacherActions.courseContents(teacher3);

        // Admitting Student, Students can login and perform some actions
//        Person student1 = principalAdmitApplicant("Uche Amaka", "Student",23, "Female");
//        Person student2 = principalAdmitApplicant("Augustin Promise", "Student", 20, "Male");
//        Person student3 = principalAdmitApplicant("Joy Christ", "Student",15, "Female");
//        StudentService studentActions = new StudentServiceImpl();
//        studentActions.takeCourse(student1, "English");
//        studentActions.takeCourse(student2, "Mathematics");
//        studentActions.takeCourse(student2, "Biology");
//        student1.displayPersonInformation();
//        student2.displayPersonInformation();
//        student3.displayPersonInformation();

        //Admitting non-teachers, Non-teachers can login and perform some actions
//        Person secretary1 = principalAdmitApplicant("Henry Cleiton", "Non_teaching_staff", 40, "Male");
//        NonTeachingService nonTeacherActions = new NonTeachingServiceImpl();
//        nonTeacherActions.displaySalaryPayroll(secretary1);
//        nonTeacherActions.displayStudentLists(secretary1);
//        nonTeacherActions.displayTeachersLists(secretary1);
//        nonTeacherActions.displayNonTeachingStaffLists(secretary1);
//        secretary1.displayPersonInformation();
    }


    public static Person principalAdmitApplicant(String name, String role, int age, String gender) throws NoPermissionException {
        Person principal = new Person(22, "Mr. Austin Gabriel", "Principal", "Male");

        Person applicant = new Person(name, role, age);

        //Applicant's information
        String applicantName = applicant.getApplicantName();
        String applicantRole = applicant.getApplicantRole();
        int applicantAge = applicant.getApplicantAge();

        //Principal admits base on the teacher information
        PrincipalService principalActions = new PrincipalServiceImpl();
        int statusId = principalActions.admitApplicant(principal, applicant);

        /**
         *  appointmentStatus returns 0 or number > 0 as an id
         *  if 0, teacher not admitted, else you can now create a teacher instance
         **/

        if(statusId != 0){
            Person person = new Person(statusId, applicantName, applicantRole, gender);
            return  person;
        }else{
            throw new NullPointerException(role+" Application processing terminated");
        }

    }
}
