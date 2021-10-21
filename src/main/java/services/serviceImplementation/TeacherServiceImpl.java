package services.serviceImplementation;

import enums.Courses;
import model.Person;
import services.TeacherService;
import utilities.PersonData;

public class TeacherServiceImpl implements TeacherService {
    @Override
    public void applyForCourse(Person teacher) {

        if(teacher.getRole().equalsIgnoreCase("Teacher")) {
            System.out.println("\nLIST OF COURSES: \n");
            for (Courses course : Courses.values()) {
                System.out.println("\t" + course + "\n");
            }

            System.out.println("Register the course you want to teach:  ");
            CourseServiceImpl.selectCourseName();

            String teacherData = teacher.getId() + "," + teacher.getFullname() + "," + CourseServiceImpl.getRegisteredCourseName();
            PersonData.setTeachersDetails(teacherData);
        }else{
            System.out.println("You don't have access to this action");
        }

    }

    @Override
    public String getRegisteredCourse(Person teacher) {
        if(teacher.getRole().equalsIgnoreCase("Teacher" ) && CourseServiceImpl.getRegisteredCourseName() != null ) {
            String message = "You will be teaching " + CourseServiceImpl.getRegisteredCourseName() +
                    " this semester";
            if (teacher.getGender().toUpperCase().equals("MAlE"))
                return congratulationMessage(teacher.getFullname(), "Mr", message);
            else
                return congratulationMessage(teacher.getFullname(), "Mrs", message);
        }else{
            return "Please registered a course first";
        }
    }


    @Override
    public void courseContents(Person teacher) {

        if(teacher.getRole().equalsIgnoreCase("Teacher")) {
            String registeredCourse = CourseServiceImpl.getRegisteredCourseName();
            System.out.println("\n");
            if (teacher.getGender().toUpperCase().equals("MALE")) {
                System.out.println(this.congratulationMessage(teacher.getFullname(), "Mr",
                        " Your Course Contents on " + registeredCourse));
            } else {
                System.out.println(this.congratulationMessage(teacher.getFullname(), "Mrs",
                        " Your Course Contents on " + registeredCourse));
            }

            CourseServiceImpl.displayAllCourseContents(registeredCourse);
        }else{
            System.out.println();
        }



    }

    private String congratulationMessage(String name, String title, String message){
        return "Congratulations "+title+". "+name+",\n "+ message;
    }
}
